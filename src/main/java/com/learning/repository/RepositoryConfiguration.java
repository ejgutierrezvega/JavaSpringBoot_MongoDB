package com.learning.repository;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
public class RepositoryConfiguration {

	public @Bean MongoDbFactory createRepoFactory() throws Exception{
		String serverName = "localhost";
		int serverPort = 27017;
		String serverDb = "directory";
		String username = "";
		String password = "";
		
		ServerAddress address = new ServerAddress(serverName, serverPort);
		MongoCredential credential = null;
		MongoClient client;
		
		if (username != null && !username.isEmpty()){
			credential = MongoCredential.createMongoCRCredential(username, serverDb, password.toCharArray());
			client = new MongoClient(address, Arrays.asList(credential));
		}
		else{
			client = new MongoClient(address);
		}
		
		return new SimpleMongoDbFactory(client, serverDb);
	}
}
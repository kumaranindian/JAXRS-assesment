package com.jersey.country.dao;

import java.util.List;

import com.jersey.country.pojo.Countrypojo;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class ConnectToMongo {

	
	/*MongoClientURI uri = new MongoClientURI(
	          "mongodb://root:root123@db1.avaldes.com:27017/?authSource=admin");*/
	
	
    
	
		
		public ConnectToMongo() {
			
			// TODO Auto-generated constructor stub
			MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/nodemongo");
			MongoClient  mongoClient = new MongoClient(uri);	  
			  // Old way to get database - deprecated now
			  DB db = mongoClient.getDB("test");  
			  
			  // Old way to get collection - deprecated now
			  DBCollection collection = db.getCollection("employee");
			  System.out.println("collection: " + collection);
			  System.out.println("Inserting using BasicDBObjects...");
			  BasicDBObject basic1 = new BasicDBObject();
			  basic1.put("_id", "1");
			  basic1.put("type", "basic");
			  basic1.put("first-name", "Amaury");
			  basic1.put("last-name", "Valdes");    
			  collection.insert(basic1);
			  System.out.println("Employee 1: " + basic1.getString("first-name"));

			  BasicDBObject basic2 = new BasicDBObject();
			  basic2.put("_id", "2");
			  basic2.put("type", "basic");
			  basic2.put("first-name", "Jane");
			  basic2.put("last-name", "Valdes");    
			  collection.insert(basic2);
			  System.out.println("Employee 1: " + basic2.getString("first-name"));
			
			  mongoClient.close();
		}

		public ConnectToMongo(List allcountry) {
			// TODO Auto-generated constructor stub
			
			MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017/nodemongo");
			MongoClient  mongoClient = new MongoClient(uri);	  
			  // Old way to get database - deprecated now
			  DB db = mongoClient.getDB("test");  
			  
			  			  System.out.println("LIST VALUES IS ==>"+allcountry);
			  DBCollection collection = db.getCollection("AllCountries");
			  System.out.println("collection: " + collection);
			  System.out.println("Inserting using BasicDBObjects...");
			  for (int i=0;i<allcountry.size(); i++) {
				  Countrypojo country=(Countrypojo)allcountry.get(i);
				  BasicDBObject basic2 = new BasicDBObject();
				  basic2.put("id", country.getId());
				  basic2.put("countryname", country.getCountryname());
				  basic2.put("population", country.getPopulation());
				  basic2.put("countrycode", country.getCountrycode());    
				  collection.insert(basic2);
				  System.out.println("Employee 1: " + basic2.getString("countryname"));
			}
			  mongoClient.close();
		}

		
	
}

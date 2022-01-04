package com.bezkoder.spring.datajpa.controller;

public class SampleReqRes {

	public static void main(String[] args) {

		
		//https://www.bezkoder.com/spring-boot-jpa-crud-rest-api/
		
		/*
		 * POST /api/tutorials create new Tutorial GET /api/tutorials retrieve all
		 * Tutorials GET /api/tutorials/:id retrieve a Tutorial by :id PUT
		 * /api/tutorials/:id update a Tutorial by :id DELETE /api/tutorials/:id delete
		 * a Tutorial by :id DELETE /api/tutorials delete all Tutorials GET
		 * /api/tutorials/published find all published Tutorials GET
		 * /api/tutorials?title=[keyword] find all Tutorials which title contains
		 * keyword
		 */
		
		
		
		
		
		/*
POST -http://localhost:8080/api/tutorials
{
  "title": "spring boot tutorial",
  "description": "desc spring boot tutorial"
}		
		 	 
PUT - http://localhost:8080/api/tutorials/3

{
  "title": "Spring Boot Tutorial #3",
  "description": "desc Spring Boot Tutorial #three",
  "published": true
}
		 	 
GET - http://localhost:8080/api/tutorials/		 	 
GET - http://localhost:8080/api/tutorials/3		 	 
GET - http://localhost:8080/api/tutorials/published
GET - http://localhost:8080/api/tutorials/?title=boot

DELETE - http://localhost:8080/api/tutorials/3
DELETE - http://localhost:8080/api/tutorials/
		 	 
		 	 
		 */
		 

		
		
	}

}

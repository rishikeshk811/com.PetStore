package com.PetStore;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import pojoClass.userPojoClass;
import utilityPackage.javaUtility;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class UserTest {

	
	
	
	public static  void main(String []args) {
		
	
		
	javaUtility jlib =new javaUtility();
	    int random=jlib.getRandomNumber();
		baseURI="https://petstore.swagger.io/v2";
		
		
		
	String	username ="rishikesh"+random;
	String name =username;
		userPojoClass userPojo =new userPojoClass(random,name,"rishikesh","singh","rishikesh234@gmail.com"
				,"password@123","7834256712",342);
		HashMap<Object, Object> object=new HashMap<>();
		object.put("id", 101);
		object.put("username", "rishikesh123");
		object.put("firstName", "rishikesh");
		object.put("lastName", "singh");
		object.put("email", "rishikesh123@gmail.com");
		object.put("password", "password@123");
		object.put("phone", "9012345678");
		object.put("userStatus", 543);

		
		
		  String postResponse=given().contentType(ContentType.JSON).body(userPojo).log().all()
		.when().post("/user")
		.then().assertThat().log().all().statusCode(200).extract().body().asString();
		
	/*	JsonPath js =new JsonPath(postResponse);
	
		           String username= js.getString("username");   */
  
	
       System.out.println(name);
		
		
	
		// get the user with UserName
		
		   String getResponse=given().pathParam("userName",name)
		
		
		.when().get("/user/{userName}")
		.then().assertThat().log().all().statusCode(200).contentType(ContentType.JSON).extract().body().asString();
		   // validating the PostResponse Body and GetResponse Body
	Assert.assertEquals(postResponse, getResponse); 
	
	// Update the User with UserName
	
	
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}





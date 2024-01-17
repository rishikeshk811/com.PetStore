package com.PetStore;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojoClass.PetPojoClass;
import utilityPackage.EndPoints;
import utilityPackage.IpathConstants;
import utilityPackage.javaUtility;

public class PetTest {
	
	@DataProvider(name = "petData")
	public Object[][] data() throws EncryptedDocumentException, IOException {
	/*	FileInputStream fis =new FileInputStream(IpathConstants.excel_path);
		   Workbook wb=WorkbookFactory.create(fis);
		    Sheet sh=  wb.getSheet("PetData");
		  int lastRow=sh.getLastRowNum();
		    int lastCell=sh.getRow(0).getLastCellNum();
		    Object [][] ob=new Object[lastRow][lastCell];
		    System.out.println(lastRow);
		    System.out.println(lastCell);
		    for(int i=1;i<=lastRow;i++) {
		    	for(int j=0;j<=lastCell;j++) {
		    		ob[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		    	}
		    }
		    return ob;   */
	    Object [][] ob=new Object[2][2];
	 
	    
	    return ob;
               
	}
	
	
	

	
	
	
	
	
	
	@Test
	public  void createPet() {
		javaUtility jlib =new javaUtility();
// if we use dataprovide ,we need to use attribute dataprovider in the test with the value 
		// ex -- @Test(dataprovider="petData") and method need two parameter otherwise we will get MethodMatcherException
		   //int idofPet=Integer.valueOf(pid);
		
		//  PetPojoClass pobj =new PetPojoClass(idofPet,pname,pstatus);

		
		   int random=jlib.getRandomNumber();
		   PetPojoClass petOb =new PetPojoClass(random,"Tommy"+random,"available");    
	
				  
	  String	 postResponse =given().contentType(ContentType.JSON).body(petOb)
		.when().post(EndPoints.post_UrlS)
		.then().assertThat().log().all().statusCode(200).contentType(ContentType.JSON).extract().body().asString();
		
		JsonPath js =new JsonPath(postResponse);
		   int  id=js.getInt("id");
		   System.out.println(id);
	
	
	
	           
	  /*        String postBody= response.getBody().asString();
	       int actualStatusCode=response.getStatusCode();
	       Assert.assertEquals(actualStatusCode, 200);  */

	
	

// get pet Using PetId
	
	
          String getResponse=  given().pathParam("petid", id ).
		when().get(EndPoints.get_UrlS)
		.then().log().all().assertThat().statusCode(200).contentType(ContentType.JSON).extract().body().asString();
          
	
	
		
		//  Update pet
 int updatedId=jlib.getRandomNumber();
		HashMap<Object, Object> hm=new HashMap<>();
		hm.put("id", updatedId);
		hm.put("name", "Husky");
		hm.put("status", "Notavailable");
		given().contentType(ContentType.JSON).body(hm)
					.when().put(EndPoints.put_UrlS)
					.then().assertThat().log().all().statusCode(200).contentType(ContentType.JSON);
	
	
		 // delete Pet Using PEtID
       given().pathParam("petid", updatedId)
   .when().delete(EndPoints.delete_UrlS)
  .then().assertThat().statusCode(200);
    
        // validating the PostResponse with GetResponse 
  Assert.assertEquals(postResponse, getResponse);
	}

}








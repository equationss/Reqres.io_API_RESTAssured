package Reqres_API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class CreateUser {

    @Test
    public void NewUser(){

        //RequestBody
        String ReqBody= "{\n" +
                "    \"name\": \"Junaid\",\n" +
                "    \"job\": \"Junaid\"\n" +
                "}";

        // Sending the request and getting the response
        baseURI= "https://reqres.in/";
        given().
                header("Content-Type", "application/json").
                body(ReqBody).
                // Asserting the status code to be 201 for successful creation
                        post("api/users").then().statusCode(201).log().all();
    }
}

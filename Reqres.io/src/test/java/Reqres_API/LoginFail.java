package Reqres_API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class LoginFail {

    @Test
    public void LoginFail(){

        //RequestBody
        String ReqBody= "{\n" +
                "    \"email\": \"peter@klaven\"\n" +
                "}";

        // Sending the request and getting the response
        baseURI= "https://reqres.in/";
        given().
                header("Content-Type", "application/json").
                body(ReqBody).
                // Asserting the status code to be 400 for successful creation
                        post("api/login").then().statusCode(400).log().all();

    }
}

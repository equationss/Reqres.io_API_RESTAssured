package Reqres_API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class LoginSuccess {

    @Test
    public void Login(){

        //RequestBody
        String ReqBody= "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"\n" +
                "}";

        // Sending the request and getting the response
        baseURI= "https://reqres.in/";
        given().
                header("Content-Type", "application/json").
                body(ReqBody).
                // Asserting the status code to be 200 for successful creation
                        post("api/login").then().statusCode(200).log().all();

    }
}

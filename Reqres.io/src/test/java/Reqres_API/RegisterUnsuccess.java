package Reqres_API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class RegisterUnsuccess {


    @Test
    public  void Register(){

        //RequestBody
        String ReqBody= "{\n" +
                "    \"email\": \"sydney@fife\"\n" +
                "}";

        // Sending the request and getting the response
        baseURI= "https://reqres.in/";
        given().
                header("Content-Type", "application/json").
                body(ReqBody).
                // Asserting the status code to be 400 for successful creation
                        post("api/register").then().statusCode(400).log().all();



    }
}
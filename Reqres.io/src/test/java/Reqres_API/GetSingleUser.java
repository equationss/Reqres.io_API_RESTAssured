package Reqres_API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class GetSingleUser {

    @Test
    public void SingleUser()

    {
        // Sending the request and getting the response
        baseURI= "https://reqres.in/";
        given().
                // Asserting the status code to be 200 for successful creation
                        get("api/users/2").then().statusCode(200).log().all();



    }
}

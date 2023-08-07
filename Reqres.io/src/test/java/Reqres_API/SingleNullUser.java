package Reqres_API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class SingleNullUser {

    @Test
    public void NullUser()
    {
        // Sending the request and getting the response
        baseURI= "https://reqres.in/";
        given().
                // Asserting the status code to be 404 for successful creation
                        get("api/users/23").then().statusCode(404).log().all();



    }
}

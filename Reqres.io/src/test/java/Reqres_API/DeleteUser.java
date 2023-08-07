package Reqres_API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class DeleteUser {

    @Test
    public void Delete()
    {

        // Sending the request and getting the response
        baseURI= "https://reqres.in/";
        given().
                // Asserting the status code to be 204 for successful creation
                        delete("api/users/2").then().statusCode(204).log().all();



    }
}

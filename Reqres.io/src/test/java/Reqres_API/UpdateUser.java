package Reqres_API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class UpdateUser
{

    @Test
    public void UpdateUser()
    {
        //RequestBody
        String ReqBody= "{\n" +
                "    \"name\": \"Junaid\",\n" +
                "    \"job\": \"rfegrger\"\n" +
                "}";

        // Sending the request and getting the response
        baseURI= "https://reqres.in/";
        given().
                header("Content-Type", "application/json").
                body(ReqBody).
                // Asserting the status code to be 200 for successful creation
                        put("api/users/2").then().statusCode(200).log().all();

    }
}

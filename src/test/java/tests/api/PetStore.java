package tests.api;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import requests.PetStoreRequests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by Hmayak Atayan on  17, Mar, 2021
 */
public class PetStore {

    int id = 12;

    @Test
    public void getByID() {
        given().log().all(). //displays request data
                header("Accept", "application/json").
                header("Content-Type", "application/xml").
                when().
                get(String.format("https://petstore.swagger.io/v2/pet/%d", id)).
                then().
                log().body(). //displays response body
                statusCode(HttpStatus.SC_OK). //checks status code is 200
                assertThat().
                contentType(ContentType.JSON); //checking content type same as "application/json"
    }


    @Test
    void usingMethods() {
        PetStoreRequests.getByID(id)
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test
    void getDataFromJson() {
        JsonPath jsonPath = PetStoreRequests.getByID(id).jsonPath();
        System.out.println((String) jsonPath.get("id"));
    }

    @Test
    void addAPet() {
        given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"id\": 28,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 0,\n" +
                        "    \"name\": \"string\"\n" +
                        "  },\n" +
                        "  \"name\": \"doggie\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"string\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"string\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .post("https://petstore.swagger.io/v2/pet")
                .then()
                .statusCode(200);
    }
}

package requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * Created by Hmayak Atayan on  18, Mar, 2021
 */
public class PetStoreRequests {

    public static Response getByID(int id) {
        return given().log().all(). //displays request data
                header("Accept", "application/json").
                when().
                get(String.format("https://petstore.swagger.io/v2/pet/%s", id));
    }


}

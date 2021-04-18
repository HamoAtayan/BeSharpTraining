package requests;

import io.restassured.response.Response;
import org.testng.Assert;
import pojos.Pet;

import static io.restassured.RestAssured.given;

/**
 * Created by Hmayak Atayan on  18, Mar, 2021
 */
public class PetStoreRequests {

    public static Response getByID(String id) {
        return given().log().all(). //displays request data
                header("Accept", "application/json").
                when().
                get(String.format("https://petstore.swagger.io/v2/pet/%s", id));
    }

    public static Response addAPet(Pet pet, String id, String categoryName) {
        pet.setId(id);
        pet.getCategory().setName(categoryName);

        return given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(pet)
                .when()
                .post("https://petstore.swagger.io/v2/pet");
    }
}

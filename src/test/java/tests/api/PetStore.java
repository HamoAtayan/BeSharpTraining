package tests.api;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pojos.Pet;
import requests.PetStoreRequests;

/**
 * Created by Hmayak Atayan on  17, Mar, 2021
 */
public class PetStore {
    String id = "1";
    Pet pet;
    //Mard mard;
//    mard =  new Mard(28,Anun, azganun);

//    @Test
//    public void getByID() {
//        given().log().all(). //displays request data
//                header("Accept", "application/json").
//                header("Content-Type", "application/xml").
//                when().
//                get(String.format("https://petstore.swagger.io/v2/pet/%s", id)).
//                then().
//                log().body(). //displays response body
//                statusCode(HttpStatus.SC_OK). //checks status code is 200
//                assertThat().
//                contentType(ContentType.JSON); //checking content type same as "application/json"
//    }

    @Test
    public void initPet() {
        pet =
                PetStoreRequests.getByID(id)
                        .as(Pet.class);
        Assert.assertEquals(pet.getId(), "1");
    }

    @Test
    public void initPet2() {
        PetStoreRequests.getByID(id).then().log().body();
    }


//    @Test
//    void usingMethods() {
//        PetStoreRequests.getByID(id)
//                .then()
//                .log().body()
//                .statusCode(200);
//    }

//    @Test
//    void getDataFromJson() {
//        JsonPath jsonPath = PetStoreRequests.getByID(id).jsonPath();
//        System.out.println((String) jsonPath.get("id"));
//    }

    @Test(priority = 1)
    void addAPet() {
        PetStoreRequests.addAPet(pet, "121", "cat name2")
                .then().log().body()
                .statusCode(200);
    }

//    public void esiminch() {
//        HUman human = new HUman();
//        human.setAge(25);
//        human.setName("human name");
//        human.setLastName("human Lastname");
//
//    }
//
//    public void esiminch2() {
//        HUman human = new HUman();
//        human.setAge(25).setName("aaa").setLastName("lastname");
//    }

}

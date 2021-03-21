package tests.api;

import pojos.Category;
import pojos.Pet;

/**
 * Created by Hmayak Atayan on  21, Mar, 2021
 */
public class Delete {
    public static void main(String[] args) {
        Category category = new Category();
        category.setName("cat name");
        category.setId(10);

        Pet pet = new Pet();
        pet.setId("10");
        pet.setName("name");
        pet.setCategory(category);
    }
}

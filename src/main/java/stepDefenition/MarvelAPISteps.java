package stepDefenition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_step_definitions {
    @When("I request details for the comic with ID {string}")
    public void i_request_details_for_the_comic_with_id(String comicId) {
        Response response = RestAssured.given()
                .param("apikey", "your_public_api_key")
                .when()
                .get("/comics/" + comicId)
                .then()
                .statusCode(200)
                .extract().response();
        System.out.println("Blah");
    }
    @Given("I have access to the Marvel API")
    public void access_marvel_apis(){
        System.out.println("hahaha");
    }

    @Then("I should see the following characters:{string}")
    public void character_check(String charatcer){
        System.out.println(charatcer);
    }

}

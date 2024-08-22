@When("I request details for the comic with ID {string}")
public void i_request_details_for_the_comic_with_id(String comicId) {
    response = RestAssured.given()
            .param("apikey", "your_public_api_key")
            .when()
            .get("/comics/" + comicId)
            .then()
            .statusCode(200)
            .extract().response();
}
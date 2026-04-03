package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;


public class PostmanTest {

    @Test
    public void postmanTest() {
        var text = "Hello";

        given()
                .baseUri("https://postman-echo.com")
                .body(text)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
        ;

    }
}

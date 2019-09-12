package ru.dexsys;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

public class StatusCodes {
    @Before
    public void setUp(){
        RestAssured.baseURI = "http://httpbin.org/status";
    }

    @Test
    public void testPostCode200(){
        when().post("200")
                .then().statusCode(200);
    }
}

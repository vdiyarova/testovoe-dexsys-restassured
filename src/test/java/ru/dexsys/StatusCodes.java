package ru.dexsys;

import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class StatusCodes {
    @Before
    public void setUp(){
        RestAssured.baseURI = "http://httpbin.org/status";
    }

    @Test
    public void testPostCode200(){
        int response = when().post("200")
                .then()
                .extract().statusCode();
        Assert.assertEquals(200, response);
    }
}

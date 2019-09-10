package ru.dexsys;

import org.junit.Test;

import static io.restassured.RestAssured.when;

public class StatusCodes {
    @Test
    public void testCode200(){
        when().post("http://httpbin.org/status/200")
                .then().statusCode(200);
    }
}

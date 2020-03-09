package com.hexaware.MLP178.integration.test;

import static com.jayway.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.net.URISyntaxException;

import com.jayway.restassured.http.ContentType;

import org.junit.Test;

public class OrdersRestTest {

    @Test
    public void testOrders() throws AssertionError, URISyntaxException {
    Orders[] res = given().when().accept(ContentType.JSON)
        .get(CommonUtil.getURI("/api/Orders")).getBody().as(Orders[].class);
    assertEquals(32, res.length);
    assertEquals(1,res[0].getOrderId());
    }

    @Test
    public void testPendingCustomer200() throws AssertionError, URISyntaxException {
        given().accept(ContentType.JSON).when()
        .get(CommonUtil.getURI("/api/Orders/pendingcus/1201")).then().assertThat().statusCode(200);
    }
    @Test
    public void testPendingVendor200() throws AssertionError, URISyntaxException {
        given().accept(ContentType.JSON).when()
        .get(CommonUtil.getURI("/api/Orders/pendingven/1100")).then().assertThat().statusCode(200);
    }
    @Test
    public void showCustomer200() throws AssertionError, URISyntaxException {
        given().accept(ContentType.JSON).when()
        .get(CommonUtil.getURI("/api/Orders/1200")).then().assertThat().statusCode(200);
    }
    @Test
    public void showVendor200() throws AssertionError, URISyntaxException {
        given().accept(ContentType.JSON).when()
        .get(CommonUtil.getURI("/api/Orders/Ven/1100")).then().assertThat().statusCode(200);
    }
}


package com.hexaware.MLP178.integration.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import org.junit.Test;
import static org.junit.Assert.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import static com.jayway.restassured.RestAssured.given;

public class WalletRestTest {

    @Test
    public void testWallet() throws AssertionError, URISyntaxException {
    Wallet[] res = given().when().accept(ContentType.JSON)
		.get(CommonUtil.getURI("/api/wallet/1200"))
		.getBody().as(Wallet[].class);
    	assertEquals(3, res.length);
    }
    @Test
    public void testWalletId200() throws AssertionError, URISyntaxException {
        given().accept(ContentType.JSON).when()
        .get(CommonUtil.getURI("/api/wallet/1200")).then().assertThat().statusCode(200);
    }

    @Test
    public void testMenuById404() throws AssertionError, URISyntaxException {
     given().accept(ContentType.JSON).when()
     .get(CommonUtil.getURI("/api/menu/1010")).then().assertThat().statusCode(404);
    }
    
}


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

public class CustomerRestTest {

	@Test
	public void testCustomerList() throws AssertionError, URISyntaxException {
        Customer[] res = given().when().accept(ContentType.JSON)
		.get(CommonUtil.getURI("/api/Customer/")).getBody().as(Customer[].class);
	assertEquals(6, res.length);
	assertEquals(1200, res[0].getCustomerId());
	assertEquals("MOHAN", res[0].getCustomerName());
    assertEquals("MOHAN12", res[0].getCustomerPassword());
	}

    @Test
	public void testCustomerDetails() throws AssertionError, URISyntaxException {
        Customer m = given().
                  accept(ContentType.JSON).
				  when().
                  get(CommonUtil.getURI("/api/Customer/MOHAN")).
				  getBody().as(Customer.class);
				  assertEquals(1200, m.getCustomerId());
	              assertEquals("MOHAN", m.getCustomerName());
                  assertEquals("MOHAN12",m.getCustomerPassword());
	}

	@Test
	public void testCustomerByName200() throws AssertionError, URISyntaxException {
		given().accept(ContentType.JSON).when()
		.get(CommonUtil.getURI("/api/Customer/MOHAN")).then().assertThat().statusCode(200);
	}
	@Test
	public void testCustomerByName404() throws AssertionError, URISyntaxException {
		given().accept(ContentType.JSON).when()
		.get(CommonUtil.getURI("/api/Customer/MOHAN13")).then().assertThat().statusCode(204);
	}
	
}

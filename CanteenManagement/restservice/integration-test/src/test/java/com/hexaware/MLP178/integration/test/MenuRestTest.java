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

public class MenuRestTest {

	@Test
	public void testMenuList() throws AssertionError, URISyntaxException {
	Menu[] res = given().when().accept(ContentType.JSON)
		.get(CommonUtil.getURI("/api/menu")).getBody().as(Menu[].class);
	assertEquals(6, res.length);
	assertEquals(1, res[0].getMenuId());
	assertEquals("DOSA", res[0].getMenuItem());
	assertEquals(50, res[0].getMenuCost(), 0.1);
	}

    @Test
	public void testFoodDetails() throws AssertionError, URISyntaxException {
	Menu m = given().
                  accept(ContentType.JSON).
				  when().
                  get(CommonUtil.getURI("/api/menu/showmenu/1")).
				  getBody().as(Menu.class);
				  assertEquals(1, m.getMenuId());
				  assertEquals("DOSA", m.getMenuItem());
				  assertEquals(50, m.getMenuCost(), 0.1);
	}

	@Test
	public void testMenuById200() throws AssertionError, URISyntaxException {
		given().accept(ContentType.JSON).when()
		.get(CommonUtil.getURI("/api/menu/showmenu/1")).then().assertThat().statusCode(200);
	}
	@Test
	public void testMenuById404() throws AssertionError, URISyntaxException {
		given().accept(ContentType.JSON).when()
		.get(CommonUtil.getURI("/api/menu/showmenu/1010")).then().assertThat().statusCode(204);
	}
	
}

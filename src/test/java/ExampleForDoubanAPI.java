import io.restassured.RestAssured;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class ExampleForDoubanAPI {

    @Before
    public void before() {
        RestAssured.baseURI = "http://api.douban.com/v2/book/1220562";
        RestAssured.port = 8080;
    }

    @Test
    public void testGetBook() {
//        String url = "https://api.douban.com/v2/movie/search";
//        get(url).then().body("title", equalTo("满月之夜白鲸现"));
        get("/tags").then().body("tags.title", equalTo("满月之夜白鲸现"));

    }

    @Test
    public void testSearchBook() {
        System.out.print("test finished!");
    }

    @After
    public void After() {

    }
}

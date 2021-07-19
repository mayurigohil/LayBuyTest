import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class APITestTwo {
	public static Response response;
    public static String jsonAsString;
	
	@Test
	public void GetResponseCode()
	{
		given().
			get("https://jsonplaceholder.typicode.com/users/6").
		then().
		body(containsString("Mrs. Dennis Schulist")).
		statusCode(200);	
}
}

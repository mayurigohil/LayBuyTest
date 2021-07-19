import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class APITEST {

	
	
	@Test
	public void GetResponseCode()
	{
		given().
			get("https://jsonplaceholder.typicode.com/users/").
		then().
			statusCode(200).
			body("size", is(10)).
			body("name", hasItems("Mrs. Dennis Schulist")).
		log().all();
}
	
}

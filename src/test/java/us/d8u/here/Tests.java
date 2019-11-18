package us.d8u.here;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response; 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
	private static OkHttpClient client = new OkHttpClient();
  // FIXME update as you see fit, and rebuild
	private final static HttpUrl.Builder ENDPOINT_HOST = new HttpUrl.Builder().scheme("http").host("localhost").port(8080);

	@Test
	public void testGetValid() throws Exception {
		String parameter = "?ptA=51.5074,-0.1278&ptB=51.8787,-0.4200";
		
		Request request = new Request.Builder().url(ENDPOINT_HOST.addQueryParameter("ptA", "51.5074,-0.1278").addQueryParameter("ptB", "51.8787,-0.4200").build()).method("GET", null).build();
		Response response = client.newCall(request).execute();
		String responseContents = response.body().string();
		Assertions.assertEquals("The weather from your starting point, LA, is currently perfect for driving. However, it is snowing at your destination, Big Bear.", responseContents);
	}
}

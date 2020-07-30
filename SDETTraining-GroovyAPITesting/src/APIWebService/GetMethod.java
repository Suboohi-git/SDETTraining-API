package APIWebService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class GetMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//String USER_AGENT="Mozilla/5.0";
		
		StringBuffer result=new StringBuffer();
		@SuppressWarnings("deprecation")
		HttpClient client=(HttpClient) new DefaultHttpClient();
		String url="https://petstore.swagger.io/v2/pet/findByStatus?status=available";
		HttpGet request=new HttpGet(url);
		
		//request.addHeader("User-Agent",USER_AGENT);
		
		HttpResponse response= client.execute(request);
		int responseCode=response.getStatusLine().getStatusCode();
		System.out.println("Response Code: " + responseCode);
		System.out.println("Get Response ");
		BufferedReader reader= new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String line="";
		while((line=reader.readLine())!=null)
		{
			result.append(line);
			System.out.println(result.toString());
		}
		

}
}

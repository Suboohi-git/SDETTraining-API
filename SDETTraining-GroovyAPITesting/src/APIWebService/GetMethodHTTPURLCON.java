package APIWebService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;


public class GetMethodHTTPURLCON {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		URL url = new URL("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
		HttpURLConnection con= (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.connect();
		
		System.out.println(con.getResponseCode());
		System.out.println(con.getResponseMessage());
		
		InputStream input;
		input= con.getInputStream();
		
		BufferedReader in= new BufferedReader(new InputStreamReader (input));
		StringBuilder response= new StringBuilder();
		String currentline;
		while((currentline=in.readLine())!=null)
			response.append(currentline);
		in.close();
		
		System.out.println(response.toString());
		//System.out.println(con.res);
		

	}

}

package APIWebService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PostMethod {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		//Reading Request from file
		String reqPath= System.getProperty("user.dir")
				+File.separator
				+"Requests"
				+File.separator
				+"PetStore.txt";
		
		String data= new String(Files.readAllBytes(Paths.get(reqPath)));
		//System.out.println(data);
		
		/*File fso= new File(reqPath);
		BufferedReader br= new BufferedReader(new FileReader(fso));
		String request="";
		
		while((request= br.readLine())!=null)
		{
			System.out.println(request);
		}
		*/
		
				
		String url="https://petstore.swagger.io/v2/pet";
		HttpURLConnection con= (HttpURLConnection) new URL(url).openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("content-type", "application/json");
		con.setRequestProperty("Accept", "application/json");
		con.setDoOutput(true);
		
		OutputStream out=con.getOutputStream();
		
		out.write(data.getBytes());
		out.close();
		
		InputStream input;
		input= con.getInputStream();
		
		BufferedReader in= new BufferedReader(new InputStreamReader (input));
		StringBuilder response= new StringBuilder();
		String currentline;
		while((currentline=in.readLine())!=null)
			response.append(currentline);
		in.close();
		
		System.out.println(response.toString());
		
		

	}

}

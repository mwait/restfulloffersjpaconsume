package restfulloffersjpaconsume;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;
public class ConsumeMain {
	  public static final String REST_SERVICE_URI = "http://localhost:8080/restfulloffersjpa-0.0.1-SNAPSHOT/test";
	public static void main(String[] args) {
		
		 RestTemplate restTemplate = new RestTemplate();
		 List<ExampleObjectRest> user = Arrays.asList(restTemplate.getForObject(REST_SERVICE_URI, ExampleObjectRest[].class));
	      System.out.println(user);
		  for(int i=0; i<user.size();i++){
			  System.out.println(user.get(i).getId());
			  System.out.println(user.get(i).getRestOb().get(0));
			  System.out.println(user.get(i).getRestOb().get(0).getData1());
		  }
	      
	}
}

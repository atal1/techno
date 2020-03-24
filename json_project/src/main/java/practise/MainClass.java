package practise;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainClass {

	public static void main(String[] args) {
		
		 try {
			 ObjectMapper objectMapper = new ObjectMapper();
			Order order = objectMapper.readValue(new File("src\\main\\resources\\Order.json"), Order.class);
			System.out.println(order.getStandardHeader().getSendingTime());
			System.out.println(order.getBody().get(0).getEntities().get(0).getOrderID());
			System.out.println(order.getBody().get(0).getEntities().get(0).getInstrument().getSymbol());	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	

}

/**
 * 
 */
package android;

import org.json.simple.JSONObject;

/**
 * @author Atal
 *
 */
public class BhaiProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject obj = new JSONObject();
		JSONObject obj1 = new JSONObject();
		obj1.put("password", "Dimag na kharab kr");
		obj1.put("idType", "mobileNumber");
		obj.put("DOB", "kasam paida krne wale ki");
		obj.put("transact", obj1);
		System.out.println(obj);

	}
	
	
	

}

package h_m;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap< String , Integer>customer= new HashMap< >();
		//adding key and value
		customer.put("Akshay", 005);
		customer.put("nandish",006);
		customer.put("KGF", 1);
		customer.containsValue(1);
		System.out.println(customer.containsKey("Ak"));
		System.out.println(	customer.containsKey("KGF"));    //printing the key which is contain in the map
		System.out.println(customer.containsValue(1));        // printing the value of which contain in the map
		customer.clear();                                                                     //removing all the mapping from a map
		System.out.println(customer);
	}

}
//Write program to check if a map contains existing the specified customer value and remove all the
//mappings from a map.
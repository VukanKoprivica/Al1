/**
 * 
 */
package dmi.vi1.search.examples.romania;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author bdimic@uns.ac.rs
 *
 */
public class RomanianMap {
	
	public static List<TwoCityConnection> connected = new ArrayList<TwoCityConnection>();
	public static HashMap<String, Integer> straightLineDistanceToBucharest = new HashMap<String, Integer>(); 
		
	static {	
		connected.add(new TwoCityConnection("Arad", "Zerind", 75));		
		connected.add(new TwoCityConnection("Arad", "Sibiu", 140));		
		connected.add(new TwoCityConnection("Arad", "Timisoara", 118));		
		connected.add(new TwoCityConnection("Zerind", "Oradea", 71));
		connected.add(new TwoCityConnection("Oradea", "Sibiu", 151));
		connected.add(new TwoCityConnection("Sibiu", "Fagaras", 99));		
		connected.add(new TwoCityConnection("Sibiu", "Rimnicu Vilcea", 80));
		connected.add(new TwoCityConnection("Timisoara", "Lugoj", 111));		
		connected.add(new TwoCityConnection("Lugoj", "Mehadia", 70));
		connected.add(new TwoCityConnection("Mehadia", "Drobeta", 75));
		connected.add(new TwoCityConnection("Drobeta", "Craiova", 120));
		connected.add(new TwoCityConnection("Rimnicu Vilcea", "Craiova", 146));
		connected.add(new TwoCityConnection("Rimnicu Vilcea", "Pitesti", 97));
		connected.add(new TwoCityConnection("Pitesti", "Bucharest", 101));
		connected.add(new TwoCityConnection("Fagaras", "Bucharest", 211));
		connected.add(new TwoCityConnection("Bucharest", "Glurgin", 90));
		connected.add(new TwoCityConnection("Bucharest", "Urziceni", 85));
		connected.add(new TwoCityConnection("Urziceni", "Hirsova", 98));
		connected.add(new TwoCityConnection("Hirsova", "Eforie", 86));
		connected.add(new TwoCityConnection("Urziceni", "Vaslui", 142));
		connected.add(new TwoCityConnection("Vaslui", "Iasi", 92));
		connected.add(new TwoCityConnection("Iasi", "Neamt", 87));
		
		straightLineDistanceToBucharest.put("Arad",366);
		straightLineDistanceToBucharest.put("Bucharest", 0);
		straightLineDistanceToBucharest.put("Craiova", 160);
		straightLineDistanceToBucharest.put("Drobeta", 242);
		straightLineDistanceToBucharest.put("Eforie", 161);
		straightLineDistanceToBucharest.put("Fagaras", 176);
		straightLineDistanceToBucharest.put("Giurgiu", 77);
		straightLineDistanceToBucharest.put("Hirsova", 151);
		straightLineDistanceToBucharest.put("Iasi", 226);
		straightLineDistanceToBucharest.put("Lugoj", 244);
		straightLineDistanceToBucharest.put("Mehadia", 241);
		straightLineDistanceToBucharest.put("Neamt", 234);
		straightLineDistanceToBucharest.put("Oradea", 380);
		straightLineDistanceToBucharest.put("Pitesti", 100);
		straightLineDistanceToBucharest.put("Rimnicu Vilcea", 193);
		straightLineDistanceToBucharest.put("Sibiu", 253);
		straightLineDistanceToBucharest.put("Timisoara", 329);
		straightLineDistanceToBucharest.put("Urziceni", 80);
		straightLineDistanceToBucharest.put("Visliu", 199);
		straightLineDistanceToBucharest.put("Zerind", 374);
		
		
		
		
	}

		
		
		
		
	}
	
	

	
	
	
	


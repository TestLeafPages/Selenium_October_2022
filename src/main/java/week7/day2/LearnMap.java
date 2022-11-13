package week7.day2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class LearnMap {
	@Test
	public void runMap() {
		// Collections - 2 Dimensional
		// Key Value pair -> Key = unique & value = duplicate
		// <"Name","Balaji">,<"EmpID","7531">
//		<Integer,Name>
//		<7892,"Pradeep">
//		<7893, "Raji">
//		<654, "Priya">
//		Map is an interface
		/*
		 * Imp Classes -> HashMap, TreeMap, LinkedHashMap HashMap -> Random -> Key
		 * TreeMap -> Ordered output -> Key LinkedHashMap -> insertion order -> key
		 */

		Map<Integer, String> map = new TreeMap<>();
		map.put(431, "Priya");
		map.put(145, "Jaya");
		map.put(256, "Nowfal");
		map.put(109, "Hari");
		map.put(679, "Raji");
		map.put(987, "Danny");
		map.put(431, "Prashanthi");
		map.remove(145);
		System.out.println(map);
		String value = map.get(256);
		System.out.println(value);
		Set<Integer> keySet = map.keySet();
		for (Integer eachKey : keySet) {
			System.out.println(eachKey + " -> " + map.get(eachKey));
		}
		System.out.println("Type 2 iteration of map");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> eachEntry : entrySet) {
			System.out.println(eachEntry.getKey() +" -> "+eachEntry.getValue());
		}
		boolean containsKey = map.containsKey(431);
		boolean containsValue = map.containsValue("Priya");
		map.clear();
		map.isEmpty();
		map.size();
	}
}

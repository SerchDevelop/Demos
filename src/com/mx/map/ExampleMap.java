package com.mx.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleMap {
	
	public static void main(String args[]){
		
		Map<String, Integer> hora = new HashMap<String, Integer>();
		hora.put("1", 1);
		hora.put("2", 2);
		hora.put("3", 3);
		hora.put("4", 4);
		hora.put("5", 5);
		hora.put("6", 6);
		hora.put("7", 7);
		hora.put("8", 8);
		hora.put("9", 9);
		hora.put("10", 10);
		hora.put("11", 11);
		hora.put("12", 12);
		hora.put("13", 13);
		hora.put("14", 14);
		hora.put("15", 15);
		hora.put("16", 16);
		hora.put("17", 17);
		hora.put("18", 18);
		hora.put("19", 19);
		hora.put("20", 20);
		hora.put("21", 21);
		hora.put("22", 22);
		hora.put("23", 23);
		hora.put("24", 24);
		hora.put("25", 25);
		
		ValueComparator bvc = new ValueComparator(hora);
		TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
		sorted_map.putAll(hora);
		
    	Iterator it = sorted_map.entrySet().iterator();
    	while(it.hasNext()){
    		Map.Entry e = (Map.Entry)it.next();
System.out.println("texto :: " + e.getValue());
    		
    	}
        
	}

}


class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;

    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with
    // equals.
    public int compare(String a, String b) {
        if (base.get(a) <= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}
package com.demomap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {
	
	public void testTreeMap() {
		
		Map<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(6, "Latur");
		map.put(5, "Ausa");
		map.put(7, "Renapur");
		map.put(2, "chakur");
		map.put(5, "udgir");
		
		Set set=map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	
	}

}

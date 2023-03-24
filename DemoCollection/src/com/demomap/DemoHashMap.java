package com.demomap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
	
		public void testHashmap(){
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("shree",15000);
			map.put("rushi",15000);
			map.put("xyz", 15000);
			//System.out.println(map.get("xyz"));
			map.put("xyz", 30000);
			Set set=map.entrySet();
			Iterator it = set.iterator();
			while(it.hasNext())
			{
				Map.Entry entry = (Map.Entry)it.next();
				System.out.println(entry.getKey()+" "+entry.getValue());
				
			}
	}
}

package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab823 {
	public static void main(String[] args) {
		Map map = new LinkedHashMap();
		System.out.println(map);
		System.out.println("Size " + map.size());
		System.out.println("IS EMPTY " + map.isEmpty());
		map.put("eid", new Integer(99));
		map.put("name", "Srinivas");
		map.put("phone", new Integer(9066800));
		map.put("valid", new Boolean(true));
		System.out.println(map);
		System.out.println("Size " + map.size());
		System.out.println("IS EMPTY " + map.isEmpty());
	}

}

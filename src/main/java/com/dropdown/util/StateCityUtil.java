package com.dropdown.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class StateCityUtil {
	
	private static Map<String,Integer> states;
	
	private static Map<Integer,List> citys;

	public StateCityUtil() {
		states=new HashMap();
		states.put("Telangana",1);
		states.put("AndhraPradesh",2);
		states.put("Maharastra",3);
		states.put("Gujarat",4);
		states.put("Karnataka",5);
		citys=new HashMap();
	}
	
	public Map getStatesMap() {
		Map<String,Map> map=new HashMap();
		List<String> telangana=new ArrayList();
		telangana.add("Hyderabad");
		telangana.add("Warangal");
		telangana.add("Karimnagar");
		telangana.add("Rangareddy");
		telangana.add("Nizamabad");
		
		List<String> ap=new ArrayList();
		ap.add("Amaravathi");
		ap.add("Visakapatnam");
		ap.add("vijayawada");
		ap.add("Thirupathi");
		ap.add("Guntur");
		
		List<String> mh=new ArrayList();
		mh.add("Mumbai");
		mh.add("Pune");
		mh.add("Nagpur");
		mh.add("Sangli");
		mh.add("Solapur");
		
		List<String> gr=new ArrayList();
		gr.add("Ahmadabad");
		gr.add("Vadodara");
		gr.add("Surat");
		gr.add("Rajkot");
		gr.add("Junaghad");
		
		List<String> ka=new ArrayList();
		ka.add("Bengalore");
		ka.add("Mangalore");
		ka.add("Hubli");
		ka.add("Belgaum");
		ka.add("Ballary");
		
		citys.put(states.get("Telangana"),telangana);
		citys.put(states.get("AndhraPradesh"),ap);
		citys.put(states.get("Maharastra"),mh);
		citys.put(states.get("Gujarat"),gr);
		citys.put(states.get("Karnataka"),ka);
		
		map.put("citys",citys);
		map.put("states",states);
		
		return map;
		
	}
	
	
	

}

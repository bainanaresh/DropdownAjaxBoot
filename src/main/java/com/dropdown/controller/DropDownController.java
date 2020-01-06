package com.dropdown.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dropdown.util.State;
import com.dropdown.util.StateCityUtil;

@Controller
public class DropDownController {

	@Autowired
	StateCityUtil util;

	@RequestMapping("/index")
	public String getIndex(Model m) {

		return "index";
	}

	@RequestMapping("/states")
	public @ResponseBody List<State> getStates() {
		System.out.println("*************statess");
		List<State> stateList = new ArrayList();
		State state;
		Map map = util.getStatesMap();
		Map states = (Map) map.get("states");
		Set s = states.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			state = new State();
			state.setsName(str);
			state.setSid((int) states.get(str));
			stateList.add(state);
		}
		return stateList;

	}
	
	
	@RequestMapping("/citys/{sid}")
	public @ResponseBody List<String> getCitys(@PathVariable("sid") int sid) {
		System.out.println("citys*******");
		Map map = util.getStatesMap();
		Map citys = (Map) map.get("citys");
		List<String> cityList=(List) citys.get(sid);
		return cityList;
		
	}

}

package collecttion_Assign;

import java.util.*;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class CityStateMap {
	private String city;
	private String state;
	
	private Map<String,String> map = new HashMap<>();
	
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public String getStateOfCity(String city)
	{
		return map.get(city);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void getAllCities(Map<String,String> map)
	{
		List<String> keyList=new ArrayList<>(map.keySet());
		System.out.println("All cities are: ");
		for(String k:keyList)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	}
	
	public void getAllStates(Map<String,String> map)
	{
		List<String> valueList=new ArrayList<>(map.values());
		System.out.println("All states are: ");
		for(String v:valueList)
		{
			System.out.print(v+" ");
		}
		System.out.println();
	}
	
	public void getAllCitiesForAState(String state)
	{
		Set<Entry<String,String>> entries =map.entrySet();
		 for (Entry<String, String> entry : entries) {
			 	if (entry.getValue().equals(state)) {
	                System.out.println(entry.getKey());
	            }  
	        } 
	} 
	
	public void addCityState(String city, String state) {
		map.put(city, state);
	}
	
	public void deleteCities(String state) {
		List<String> str = new ArrayList<>();
		Iterator iterator = map.entrySet().iterator();
		int i=0;
		while(iterator.hasNext()) {
			Map.Entry mEntry = (Map.Entry)iterator.next();
			if(mEntry.getValue().equals(state)) {
				str.add((String) mEntry.getKey());
			}
		}
		for(String s:str)
		{
			map.remove(s);
		} 
	//map.values().remove(state);
	//System.out.println();
	}
}

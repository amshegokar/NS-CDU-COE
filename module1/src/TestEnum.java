package com.techm;

import java.util.Set;
import java.util.TreeSet;

public class TestEnum {
	public static void main(String[] args) {
		
		
		Set mySet=new TreeSet();
		
		mySet.add(Day.SATURDAY);
		mySet.add(Day.WEDNESDAY);
		mySet.add(Day.FRIDAY);
		mySet.add(Day.WEDNESDAY);
		mySet.add(Day.HOLIDAY);
		for(Object d: mySet){
			System.out.println(d);
			
		}
	}

}

package com.assign;

import java.util.Comparator;

public class NameComDes implements Comparator<Student> {
	
	@Override
	public int compare(Student o1, Student o2) {
		
	
		return o2.getName().compareTo(o1.getName());
	}

}


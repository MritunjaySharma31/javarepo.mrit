package com.assign;

import java.util.Comparator;


	public class Student implements Comparable<Student> 
	{
		private int id;
		private String name;
		private int marks;
		
		public Student(int id, String name, int marks) {
			this.id = id;
			this.name = name;
			this.marks= marks;
		}
		public int getId() {return id;}
		public void setId(int id) {this.id = id;}
		public String getName() {return name;}
		public void setName(String name) {this.name = name;}
		public int getMarks() {return marks;}
	    public void setMarks(int marks) {this.marks = marks;}

		public static void main(String[] args) {
			
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "[id="+id+",name="+name+",marks="+marks+"]";
		}

		
		public static Comparator<Student> sortByName=new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		@Override
		public int compareTo(Student o) {
			if (this.getId()<o.getId())
				return 1;
			else if (this.getId()>o.getId())
				return -1;
			else
			return 0;
			
		}
				
		}






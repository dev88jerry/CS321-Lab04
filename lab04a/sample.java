import java.util.Collections;
//missing package otherwise it should be good
public class Main
{
	public static void main(String[] args) {

		Person p = new Person("abc", 1);
		Person p1 = new Person("abcd", 102);
		Person p2 = new Person("xyz", 128);
		Person p3 = new Person("wxyz", 20);
		Person p4 = new Person("qwerty", 88);
		
		Person[] myList = new Person[5];
		
		myList[0] = p;
		myList[1] = p1;
		myList[2] = p2;
		myList[3] = p3;
		myList[4] = p4;
		
		for (Person myP : myList){
		    System.out.println(myP.toString());
		}
		
		
		Collections.sort(myList, new LexicographicComparator());
		
		System.out.println("After sorting");
		for (Person myP : myList){
		    System.out.println(myP.toString());
		}
		
		
	}
}


public class Person{
    
    private String name;
    private int age;
    
    
    public Person(){
        this.name = "";
        this.age = 0;
    }
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String toString(){
        return this.name + " is age " + this.age;
    }
    
    
}

import java.util.Comparator;
//https://www.geeksforgeeks.org/comparator-interface-java/
public class AgeComparator implements Comparator{
    
    public int compare(Object arg0, Object, arg1){
        return (Person) arg0.getAge() - (Person) arg1.getAge();
    }
    
}

import java.util.Comparator;

public class LexicographicComparator implements Comparator{
    
    public int compare(Object arg0, Object, arg1){
        return (Person) arg0.getName().compareTo((Person) arg1.getName());
    }
    
}

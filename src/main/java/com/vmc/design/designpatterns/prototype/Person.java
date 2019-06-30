/**
 * 
 */
package com.vmc.design.designpatterns.prototype;

/**
 * @author krishna_v
 *
 */
public class Person {
	private String name;
	private long age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public long getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(long age) {
		this.age = age;
	}
	
	public Person() {
		
	}
	
	public Person(Person p) {
		this.name = p.name;
		this.age  = p.age;
	}
	
	public Person clone() {
		return new Person(this);
	}
	
}

package org.g4studio.demo.assist.reflect;


/**
 * 反射用例
 * 
 * @author XiongChun
 * @since 2013-02-19
 */
public class StudentClass {
	
	private String name;
	
	public void sayHi(String name){
		System.out.println("hi, " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

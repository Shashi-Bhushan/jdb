package com.jdb.demo;

import static java.lang.System.out;

/**
 * Author: Shashi
 * DebuggerDemo provider a sample class for which breakpoints can be set on different methods
 * and using a debugger, value of varibles at some specific instance can be set or get.
 */
public class DebuggerDemo {

	/**
	 * String name
	 * instance variable of class which can be changed for Debugging demonstration purposes.
	 */
	private String name = "Shashi";

	public static void main(String... arg){
		DebuggerDemo debuggerDemo = new DebuggerDemo();

		debuggerDemo.printName()
		.setName("Shivani")
		.printName();
	}

	/**
	 * @param none
	 * prints the value of instance variable name
 	 */
	public DebuggerDemo printName(){
		out.println("value of Name is :" + name);

		return this;
	}

	/**
	 * @param none
	 * returns the value of instance variable name
	 */
	public String getName(){
		return this.name;
	}

	/**
	 * @param newName name to be changed to newName
	 * changes the value of instance variable name to newName
	 */
	public DebuggerDemo setName(String newName){
		this.name = newName;

		return this;
	}
}

/*
 * met dank aan Mark van Velthoven
 */

package com.avans.factory.commands.impl;

import com.avans.factory.commands.AbstractCommand;

public class ExampleCommand implements AbstractCommand {
	
	public ExampleCommand() {
	}
	
	public int action(int input) {
		System.out.println(getClass().getName() + " executing action " + input);
		System.out.println();
		int output = input+1;
		return output;
	}

	public AbstractCommand copy() {
		return new ExampleCommand();
	}	

}

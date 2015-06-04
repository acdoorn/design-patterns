/*
 * met dank aan Mark van Velthoven
 */

package com.avans.factory.commands.impl;

import com.avans.factory.commands.AbstractCommand;

public class ExampleCommand implements AbstractCommand {
	
	public ExampleCommand() {
	}
	
	public void action() {
		System.out.println(getClass().getName() + " executing action");
		System.out.println();
	}

	public AbstractCommand copy() {
		return new ExampleCommand();
	}	

}

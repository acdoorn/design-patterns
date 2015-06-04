/*
 * met dank aan Mark van Velthoven
 */

package com.avans.factory.commands.impl;

import com.avans.factory.commands.AbstractCommand;

public class UnknownCommand implements AbstractCommand {
	
	public UnknownCommand() {
	}
	
	public int action(int input) {
		System.out.println(getClass().getName() + " executing action " + input);
		System.out.println();
		return input-1;
	}

	public AbstractCommand copy() {
		return new UnknownCommand();
	}	

}

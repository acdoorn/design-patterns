/*
 * met dank aan Mark van Velthoven
 */

package com.avans.factory.commands.impl;

import com.avans.factory.commands.AbstractCommand;

public class ConstructCommand implements AbstractCommand {

	public ConstructCommand() {
	}
	
	public int action(int input) {
		System.out.println(getClass().getName() + " executing action " + input);
		System.out.println();
		return input;
	}

	public AbstractCommand copy() {
		return new ConstructCommand();
	}
}

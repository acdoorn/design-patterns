/*
 * met dank aan Mark van Velthoven
 */

package com.avans.factory.commands.impl;

import com.avans.factory.commands.AbstractCommand;

public class ConstructCommand implements AbstractCommand {

	public ConstructCommand() {
	}
	
	public void action() {
		System.out.println(getClass().getName() + " executing action");
		System.out.println();
	}

	public AbstractCommand copy() {
		return new ConstructCommand();
	}
}

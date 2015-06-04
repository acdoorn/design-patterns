/*
 * met dank aan Mark van Velthoven
 */

package com.avans.factory.commands;

public interface AbstractCommand extends Cloneable {
	
	int action(int input);
	
	AbstractCommand copy();
	
}

/*
 * met dank aan Mark van Velthoven
 */

package com.avans.factory.commands;

public interface AbstractCommand extends Cloneable {
	
	void action();
	
	AbstractCommand copy();
	
}

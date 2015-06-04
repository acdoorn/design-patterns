/*
 * met dank aan Mark van Velthoven
 */

package com.avans.factory;

import com.avans.factory.commands.AbstractCommand;

public class Application {
	
	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		try
		{
			final AbstractCommand exampleCommand = Factory.create("ExampleCommand");		
			exampleCommand.action();

			final AbstractCommand constructCommand = Factory.create("ConstructCommand");		
			constructCommand.action();
		
			final AbstractCommand unknownCommand = Factory.create("UnknownCommand");
		}
		catch ( IllegalArgumentException exception )
		{
			System.out.println( exception.getMessage() );
		}
	}
	
}

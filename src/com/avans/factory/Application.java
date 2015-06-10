/*
 * met dank aan Mark van Velthoven
 */

package com.avans.factory;

import java.lang.reflect.Array;
import java.util.HashMap;
import com.avans.factory.commands.AbstractCommand;

public class Application {
	
	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		try
		{
			int input = 5;
			//final Node exampleNode = NodeFactory.create("ExampleNode");
//			final AbstractCommand exampleCommand = Factory.create("ExampleCommand");		
//			input = exampleCommand.action(input);
							
			
			MainController m = new MainController();
			m.generate();
			m.execute();

		
//			final AbstractCommand unknownCommand = Factory.create("UnknownCommand");
//			input = unknownCommand.action(input);
			
			
//			final AbstractCommand constructCommand = Factory.create("ConstructCommand");		
//			constructCommand.action(input);
		}
		catch ( IllegalArgumentException exception )
		{
			System.out.println( exception.getMessage() );
		}
	}
	
}

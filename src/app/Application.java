package app;

import controllers.MainController;

public class Application {
	private String path = "./src/readablefiles/circuit4.txt";
	private int high = 1;
	private int low = 1;
	
	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		try
		{			
			MainController m = new MainController(path);
			m.generate();
			m.execute(high,low);
			System.out.println("Done...bye");
		}
		catch ( IllegalArgumentException exception )
		{
			System.out.println( exception.getMessage() );
		}
	}
	
}

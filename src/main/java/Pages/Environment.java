package Pages;

public class Environment {


	// static variable single_instance of type Singleton
	private static Environment single_instance = null;

	// variable of type String
	public String codenboxautomationlabURL;
	// private constructor restricted to this class itself
	private Environment()
	{
		codenboxautomationlabURL ="https://codenboxautomationlab.com/";
	}

	// static method to create instance of Singleton class
	public static Environment getInstance()
	{
		if (single_instance == null)
			single_instance = new Environment();

		return single_instance;
	}
}



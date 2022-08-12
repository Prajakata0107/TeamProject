package utility;

public class EnvironmentA {

	private static String filepath = "/src/main/resources/Environment.properties";
	public static String URL;
	// public static String appUser1;
	static {
		PropU prop = new PropU();
		String baseDir = System.getProperty("user.dir");
		URL = prop.getValue(baseDir + filepath, "app_url");

	}
}


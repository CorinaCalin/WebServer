package httpserver.config;

import org.junit.Test;

public class ConfigManagerTest {

	@Test(expected= ConfigException.class)
	public void getCurrentConfigurationFileTest() {
			ConfigManager myConfigManager = new ConfigManager();
			myConfigManager.getCurrentConfiguration();
	}
	
	@Test(expected= ConfigException.class)
	public void loadConfigurationFileTest() {
			ConfigManager myConfigManager = new ConfigManager();
			myConfigManager.loadConfigurationFile("");
	}

//	@Test()
//	public void loagConfigurationFileTest2() {
//			ConfigurationManager myConfigurationManager= new ConfigurationManager();
//			myConfigurationManager.loadConfigurationFile("src/main/resources/http.json");
//			assertEquals("Not as expected",8080,myConfigurationManager.getCurrentConfiguration().getPort());
//	}
//
//	@Test()
//	public void loagConfigurationFileTest3() {
//		ConfigurationManager myConfigurationManager= new ConfigurationManager();
//		myConfigurationManager.loadConfigurationFile("src/main/resources/http.json");
//		assertEquals("Not as expected","/tmp",myConfigurationManager.getCurrentConfiguration().getWebroot());
//	}
//
//	@Test()
//	public void getInstance() {
//		ConfigurationManager myConfigurationManager = null;
//		ConfigurationManager newOne = myConfigurationManager.getInstance();
//		assertNotNull(newOne);
//	}
}

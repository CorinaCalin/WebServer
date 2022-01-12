package httpserver.config;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConfigTest {

	@Test
	public void testPort() {
		Config conf = new Config();
		conf.setPort(443);
		assertEquals(443, conf.getPort());
	}

	@Test
	public void testWebroot(){
		Config conf = new Config();
		conf.setWebroot("/tmp");
		assertEquals("/tmp",conf.getWebroot());
	}

}

package pt.dnxt.techfridays.configserver.server;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ConfigServerTests {

	@Autowired
	private ApplicationContext appCtx;

	@Test
	void contextLoads() {
		assertNotNull(appCtx);
	}

}

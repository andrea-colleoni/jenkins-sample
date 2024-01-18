package info.colleoni.jenkinssampleapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsSampleApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void ok() {
		assertTrue(true, "ok");
	}

	@Test
	void fallire() {
		assertTrue(false, "ok");
	}

}

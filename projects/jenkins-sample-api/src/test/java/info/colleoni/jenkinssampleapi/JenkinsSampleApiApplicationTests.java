package info.colleoni.jenkinssampleapi;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsSampleApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void fallire() {
		fail();
	}

}

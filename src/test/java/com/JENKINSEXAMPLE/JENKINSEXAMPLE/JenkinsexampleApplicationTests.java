package com.JENKINSEXAMPLE.JENKINSEXAMPLE;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootTest
class JenkinsexampleApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsexampleApplication.class);
	@Test
	void contextLoads() {
		
		logger.info("Test case executing...");
		assertEquals(true, true);
		
		
	}

}

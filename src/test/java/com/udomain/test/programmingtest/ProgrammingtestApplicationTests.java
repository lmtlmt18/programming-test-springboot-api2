package com.udomain.test.programmingtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.BDDAssertions.then;

import java.util.Map;

@RunWith(SpringRunner.class)
//@SpringBootTest
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {"management.port=0"})
public class ProgrammingtestApplicationTests {

	@LocalServerPort
//	@Value("${local.server.port}")
//	private int port = 8080;
	private int port;

//	@Value("${local.management.port}")
//	private int mgt;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void contextLoads() {
	}
	
//	@Test
//	public void shouldReturn200WhenSendingRequestToController() throws Exception {
//		@SuppressWarnings("rawtypes")
//		ResponseEntity<Map> entity = this.testRestTemplate.getForEntity(
//				"http://localhost:" + this.port + "/post", Map.class);
//
//		then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
//	}
}

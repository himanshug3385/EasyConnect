package com.easyconnect;

import static org.assertj.core.api.Assertions.assertThat;

import com.easyconnect.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {


	void contextLoads() {
	}

	@Autowired
	private EmailService service;

	void sendEmailTest() {
		service.sendEmail("batchlcwd@gmail.com", "Just managing the emails",
				"this is scm project working on email service");
	}
	void testUnits() {
		int result=40;
		 List<String> list = List.of("ram","shyam","ankit");
//		assertThat(result).isEqualTo(50);
		assertThat(list).asList().size().isGreaterThan(5);

	}

}

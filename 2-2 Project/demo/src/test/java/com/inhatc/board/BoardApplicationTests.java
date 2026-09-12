package com.inhatc.board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.context.SpringBootTest;
import com.inhatc.board.question.QuestionService;

@SpringBootTest
class BoardApplicationTests {
		
	@Autowired
	private QuestionService questionService;
	
	@Test
	void testJpa() {
		for (int i = 1; i <= 200; i++) {
			String subject = String.format("테스트 데이터[%03d]", i); 
			String content = "제곧내"; 
			this.questionService.create(subject, content, null);
		}
	}
}
	

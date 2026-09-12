package com.inhatc.board;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.context.SpringBootTest;

import com.inhatc.board.answer.Answer;
import com.inhatc.board.answer.AnswerRepository;
import com.inhatc.board.question.Question;
import com.inhatc.board.question.QuestionRepository;

import jakarta.transaction.Transactional;

@SpringBootTest 
class TestApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Transactional
	@Test 
	void testJpa() {
//		<1. 질문 데이터 저장>
//		Question q1 = new Question(); 
//		q1.setSubject("스프링 부트에 대한 질문"); 
//		q1.setContent("Spring은 무슨 뜻인가요?"); 
//		q1.setCreateDate(LocalDateTime.now()); 
//		this.questionRepository.save(q1);
//		Question q2 = new Question(); 
//		q2.setSubject("수업에 대한 질문"); 
//		q2.setContent("쉬는 시간은 있나요?"); 
//		q2.setCreateDate(LocalDateTime.now()); 
//		this.questionRepository.save(q2);
		
		
//		<2. findAll 메소드>
		List<Question> all = this.questionRepository.findAll();
		assertEquals(1, all.size());
	
		Question q = all.get(0);
		assertEquals("스프링 부트에 대한 질문", q.getSubject());
		
//		<3. findById 메소드>
//		Optional<Question> oq = this.questionRepository.findById(2); 
//		if (oq.isPresent()) { 
//			Question q = oq.get(); 
//			assertEquals("수업에 대한 질문", q.getSubject());
//		}
		
//		<4. findBySubject 메소드>
		Question q1 = this.questionRepository.findBySubject("스프링 부트에 대한 질문");
		assertEquals(1, q1.getId());
		
//		<5. findBySubjectAndContent 메소드>
		Question q2 = this.questionRepository.findBySubjectAndContent("스프링 부트에 대한 질문", "Spring은 무슨 뜻인가요?");
		assertEquals(1, q2.getId());

		Question q3 = this.questionRepository.findBySubjectOrContent("스프링 부트에 대한 질문", "Spring은 무슨 뜻인가요?");
		assertEquals(1, q3.getId());
		
//		<6. findBySubjectLike 메서드>
		List<Question> q4 = this.questionRepository.findBySubjectLike("%질문");
		assertEquals(1, q4.get(0).getId());
		
//		<7. setSubject 메서드>
//		Optional<Question> oq = this.questionRepository.findById(1); // 1번 가져오고 존재 여부
//		assertTrue(oq.isPresent());
//		Question q = oq.get(); // 객체 가지고 오고
//		q.setSubject("질문");    // Subject에 질문을 널어라
//		this.questionRepository.save(q); // 저장
		
//		<8. delete 메서드>
//		Long check = this.questionRepository.count();
//		Optional<Question> oq2 = this.questionRepository.findById(1); // 1번 가져오고 존재 여부
//		assertEquals(oq2, this.questionRepository.count());
//		assertTrue(oq2.isPresent());
//		this.questionRepository.deleteById(1);
//		assertEquals(1, this.questionRepository.count());
//		Long check2 = this.questionRepository.count();
		
		// <8. delete 메서드 - 교수님 ver.>
//		assertEquals(2, this.questionRepository.count());
//		Optional<Question> oq2 = this.questionRepository.findById(1);
//		assertTrue(oq2.isPresent());
//		Question q = oq2.get();
//		this.questionRepository.delete(q);
//		assertEquals(2, this.questionRepository.count());
		
// 		<9. 답변 데이터 - setSubject 메서드>
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		
//		Answer a = new Answer();
//		a.setContent("있습니다.");
//		a.setCreateDate(LocalDateTime.now());
//		a.setQuestion(q);
//		this.answerRepository.save(a);
		
//		<10. 답변 데이터 - getQuestion 메서드>
//		Optional<Answer> a = this.answerRepository.findById(1);
//		assertTrue(a.isPresent());
//		Answer a1 = a.get();
//		assertEquals(2, a1.getQuestion().getId());
		
//		<11. 질문을 통해 답변 찾기>
//		Optional<Question> a = this.questionRepository.findById(1);
//		assertTrue(a.isPresent());
//		Question a2 = a.get();
//		List<Answer>answers = a2.getAnswers();
//		assertEquals(1, answers.size());
//		assertEquals("있습니다.", answers.get(0).getContent());	
	}
}
	
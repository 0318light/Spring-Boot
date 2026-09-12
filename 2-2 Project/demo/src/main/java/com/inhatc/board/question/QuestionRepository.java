package com.inhatc.board.question;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.domain.Page; 
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.domain.Specification;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> ,JpaSpecificationExecutor<Question>{

	Question findBySubject(String string);

	Question findBySubjectAndContent(String subject, String content);

	Question findBySubjectOrContent(String string, String string2);
	
	Question findByCreateDate(LocalDateTime datetime);

	List<Question> findBySubjectLike(String subject);
	
//	Page<Question> findAll(Pageable pageable);
	
	Page<Question> findAll(Specification<Question> spec, Pageable pageable);

}

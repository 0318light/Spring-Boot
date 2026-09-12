package com.inhatc.board.answer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
//	Answer findByContent(Question question);
}

package com.inhatc.board.question;

import jakarta.validation.constraints.NotEmpty; 
import jakarta.validation.constraints.Size;

import lombok.Getter; 
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
	@NotEmpty(message="Subject is required.") 
	@Size(max=10, message="Input: '${validatedValue}'") 
	private String subject;
	@NotEmpty(message="Content is required.") 
	private String content;
}

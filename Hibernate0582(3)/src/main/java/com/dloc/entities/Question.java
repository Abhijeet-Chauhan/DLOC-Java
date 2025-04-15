package com.dloc.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	private int qid;
	
	@OneToMany(mappedBy = "question")
	private List<Answer> answers; 
	
	private String ques;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}


	
}

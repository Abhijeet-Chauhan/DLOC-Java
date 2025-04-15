package com.dloc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	private int aid;
	private String ans;
	@ManyToOne
	private Question question;
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", ans=" + ans + ", question=" + question + "]";
	}
	
}

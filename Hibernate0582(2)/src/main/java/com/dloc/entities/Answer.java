package com.dloc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	private int aid;
	private String ans;
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
	
}

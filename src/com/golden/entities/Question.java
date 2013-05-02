package com.golden.entities;

public class Question {
    private int id;
    private String question;
    private String trueAnsewer;
    private String falseAnsewer1;
    private String falseAnsewer2;
    private String falseAnsewer3;
	public Question(int id, String question, String trueAnsewer,
            String falseAnsewer1, String falseAnsewer2, String falseAnsewer3) {
	    super();
	    this.id = id;
	    this.question = question;
	    this.trueAnsewer = trueAnsewer;
	    this.falseAnsewer1 = falseAnsewer1;
	    this.falseAnsewer2 = falseAnsewer2;
	    this.falseAnsewer3 = falseAnsewer3;
    }
	public int getId() {
    	return id;
    }
	public void setId(int id) {
    	this.id = id;
    }
	public String getQuestion() {
    	return question;
    }
	public void setQuestion(String question) {
    	this.question = question;
    }
	public String getTrueAnsewer() {
    	return trueAnsewer;
    }
	public void setTrueAnsewer(String trueAnsewer) {
    	this.trueAnsewer = trueAnsewer;
    }
	public String getFalseAnsewer1() {
    	return falseAnsewer1;
    }
	public void setFalseAnsewer1(String falseAnsewer1) {
    	this.falseAnsewer1 = falseAnsewer1;
    }
	public String getFalseAnsewer2() {
    	return falseAnsewer2;
    }
	public void setFalseAnsewer2(String falseAnsewer2) {
    	this.falseAnsewer2 = falseAnsewer2;
    }
	public String getFalseAnsewer3() {
    	return falseAnsewer3;
    }
	public void setFalseAnsewer3(String falseAnsewer3) {
    	this.falseAnsewer3 = falseAnsewer3;
    }
	@Override
    public String toString() {
	    return "Question [id=" + id + ", question=" + question
	            + ", trueAnsewer=" + trueAnsewer + ", falseAnsewer1="
	            + falseAnsewer1 + ", falseAnsewer2=" + falseAnsewer2
	            + ", falseAnsewer3=" + falseAnsewer3 + "]";
    }
	@Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + id;
	    return result;
    }
	@Override
    public boolean equals(Object obj) {
	    Question q = (Question) obj;
	    return (q.getId() == id);
    }
}

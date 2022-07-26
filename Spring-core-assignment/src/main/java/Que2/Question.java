package Que2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

	private int questionId;
	private String question;
	private List<String> answersInList;
	private Set<String> answersInSet;
	private Map<Integer,String> answerInMap;
	
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Question(int questionId, String question, List<String> answersInList) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answersInList = answersInList;
	}


	public Question(int questionId, String question, Set<String> answersInSet) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answersInSet = answersInSet;
	}


	public Question(int questionId, String question, Map<Integer, String> answerInMap) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answerInMap = answerInMap;
	}


	public int getQuestionId() {
		return questionId;
	}


	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public List<String> getAnswersInList() {
		return answersInList;
	}


	public void setAnswersInList(List<String> answersInList) {
		this.answersInList = answersInList;
	}


	public Set<String> getAnswersInSet() {
		return answersInSet;
	}


	public void setAnswersInSet(Set<String> answersInSet) {
		this.answersInSet = answersInSet;
	}


	public Map<Integer, String> getAnswerInMap() {
		return answerInMap;
	}


	public void setAnswerInMap(Map<Integer, String> answerInMap) {
		this.answerInMap = answerInMap;
	}


	public void displayAnswerInList() {
		System.out.println("Id : "+ questionId +"\nQuestion : "+question+"\nAnswers in list : \n" +answersInList);
	}
	
	public void displayAnswerInSet() {
		System.out.println("Id : "+ questionId +"\nQuestion : "+question+"\nAnswers in Set : \n" +answersInSet);
	} 
	
	public void displayAnswerInMap() {
		System.out.println("Id : "+ questionId +"\nQuestion : "+question+"\nAnswers in Map : \n" +answerInMap);
	} 
}

package edu.ap.jaxrs;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

public class AnswersXML {
	
	private ArrayList<String> answers;
	
	public ArrayList<String> getAnswers() {
		return answers;
	}

	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}
}



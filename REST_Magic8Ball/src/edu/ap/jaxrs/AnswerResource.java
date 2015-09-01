package edu.ap.jaxrs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class AnswerResource {
	
	
	
	@GET
	@Produces({"application/json"})
	public String getProductsJSON() {
		String jsonString = "{\"answers\" : [";
		try {
			JAXBContext jaxbContext1 = JAXBContext.newInstance(AnswersXML.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext1.createUnmarshaller();
			File XMLfile = new File("/Users/Joris/workspace/REST_Magic8Ball/Answers.xml");
			AnswersXML answersXML = (AnswersXML)jaxbUnmarshaller.unmarshal(XMLfile);
			ArrayList<String> listOfAnswers = answersXML.getAnswers();
			
			for(Answer answer : listOf1answers) {
				jsonString += "{\"answer\" : \"" + answer) +""},";
		
		catch (JAXBException e) {
		   e.printStackTrace();
		}
		return jsonString;
	}
	
	
	}

	
	@POST
	@Consumes({"text/xml"})
	public void processFromXML(String productXML) {
		
		
		try {
			
			
			// unmarshal new product
			JAXBContext jaxbContext2 = JAXBContext.newInstance(Product.class);
			Unmarshaller jaxbUnmarshaller2 = jaxbContext2.createUnmarshaller();
			StringReader reader = new StringReader(productXML);
			Answer newAnswer = (Answer)jaxbUnmarshaller2.unmarshal(reader);
			
			
			
			// marshal the updated productsXML object
			Marshaller jaxbMarshaller = jaxbContext1.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			jaxbMarshaller.marshal(answersXML, XMLfile);
		} 
		catch (JAXBException e) {
		   e.printStackTrace();
		}
	}
}

}

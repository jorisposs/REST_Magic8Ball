package edu.ap.jaxrs;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
	
	public static void main(String[] args) {
		
		String PlayerInput = new Scanner(System.in);
		
		String playerInput = "";
		int thought = 5;
		Random random = new Random();
		
		System.out.println("Ask a yes or no question");
		playerInput = PlayerInput.nextLine();
		
		while(!PlayerInput.equalsIgnoreCase("Quit"))){
			
			while(playerInput.lenght()<2) {
				if(playerInput.equalsIgnoreCase("") ) {
					System.out.println("Please ask a question.");
				} else {	
					System.out.println("You need to ask a longer question.");
				}
				playerInput = PlayerInput.nextLine();
			}
			System.out.println("Thinking...");
			
			System.out.println("Ask a yes or no question");
			PlayerInput = new Scanner(System.in);
			playerInput = PlayerInput.nextLine();
			
			thought = random.nextInt(4);
			
			for(int i = 0; i < tought; i++) {
				
				try {
					Thread.currentThread().sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
				
		}
	}

}

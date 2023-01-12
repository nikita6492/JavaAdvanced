package com.cts.s;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintAccountDetails {
	
	Account account;

	public PrintAccountDetails(Account account) {
		this.account = account;
	}
	
	public void printAccountDetailsOnScreen() {
		//print on screen
		System.out.println("Account Details::"+account.toString());
	}
	
	public void printAccountDetailsOnPaper() {
		//print on paper
		 File file = new File("accountDetails.txt");
		 try {
	            if (!file.exists()) {
	                file.createNewFile();
	            }

	            // Write the text to the file
	            FileWriter fileWriter = new FileWriter(file);
	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	            bufferedWriter.write(account.toString());
	            bufferedWriter.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

		 System.out.println("Printing Details on paper from file::"+file.getName());
	}

}

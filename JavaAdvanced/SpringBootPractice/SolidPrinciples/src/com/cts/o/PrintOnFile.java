package com.cts.o;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintOnFile implements PrintDetails {

	@Override
	public void printDetails(Account account) {
		 File file = new File("accountDetails1.txt");
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

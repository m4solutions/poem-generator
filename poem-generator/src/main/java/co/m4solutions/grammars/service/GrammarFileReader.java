package co.m4solutions.grammars.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class GrammarFileReader {
	
	
	public static BufferedReader readFile(String file){
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader((new FileInputStream(file))));
			return in;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return null;	
//		String line = null;
//		StringBuilder responseData = new StringBuilder();
//		while((line = in.readLine()) != null) {
//		    responseData.append(line);
//		}
	}

}

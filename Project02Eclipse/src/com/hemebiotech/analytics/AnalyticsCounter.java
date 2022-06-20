package com.hemebiotech.analytics;
import java.io.IOException;

public class AnalyticsCounter {
	private static final String source = "Project02Eclipse/source/symptoms.txt";
	private static final String destination = "Project02Eclipse/destination/results.out";
	
	public static void main(String args[]) {
		
		try {
			ReadSymptomDataFromFile readerSD = new ReadSymptomDataFromFile(source);
			
			WriteSymptomDataToFile writerSD = new WriteSymptomDataToFile(destination);
			
			writerSD.WriteSymptoms(readerSD.GetSymptoms());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

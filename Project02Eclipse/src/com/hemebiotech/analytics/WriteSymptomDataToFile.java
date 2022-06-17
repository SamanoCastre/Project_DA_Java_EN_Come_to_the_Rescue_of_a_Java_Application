package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 */
public class WriteSymptomDataToFile implements ISymptomWriter{
private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to store symptoms line
	 */
	public WriteSymptomDataToFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public void writeSymptoms(List<String> symptoms) throws IOException {
		if(!symptoms.isEmpty()) {
			
			BufferedWriter bWriter = null;
			try {	
				
				SortedMap<String, Integer> symptomsOccurrencesMap = new TreeMap<String, Integer>();
				
				for (String symptom : symptoms) {
					Integer occurrence = 1;
					
					if(symptomsOccurrencesMap.containsKey(symptom)) {
						occurrence =  symptomsOccurrencesMap.get(symptom) + 1;
					}
					symptomsOccurrencesMap.put(symptom, occurrence);
				}
				
				bWriter = new BufferedWriter(new FileWriter (this.filepath));
				
				for (Map.Entry<String, Integer> entry : symptomsOccurrencesMap.entrySet()) {
					bWriter.write(entry.getKey() + ": " + entry.getValue() + "\n");
				}
				bWriter.flush();
			}
			catch (Exception e) {
				throw e;
			}
			finally {
				bWriter.close();
			}
		}
	}
}
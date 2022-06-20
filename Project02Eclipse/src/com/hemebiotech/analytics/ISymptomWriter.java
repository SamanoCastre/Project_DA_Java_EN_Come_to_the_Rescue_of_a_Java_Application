/**
 * 
 */
package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
 
/**
 * Anything that will write symptom data to a destination (path)
 * The important part is the count of the number of occurrence of each symptom written in the destination file
 * 
 * The implementation needs to count the number of occurrences for each symptom of the given list of symptoms
 */
public interface ISymptomWriter {
	
	/**
	 * Generate a file (or replace the content of a file if already exists) 
	 * by an ordered list of symptoms with the number of occurrences.
	 * 
	 * if the given list is empty, no file will be generated nor updated.
	 * @param symptoms
	 * @throws IOException
	 */
	void WriteSymptoms(List<String> symptoms) throws IOException;
}

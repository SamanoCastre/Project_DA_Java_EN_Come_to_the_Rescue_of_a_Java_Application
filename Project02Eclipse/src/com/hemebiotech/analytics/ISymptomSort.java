package com.hemebiotech.analytics;

import java.util.List;
import java.util.SortedMap;

/**
 * Anything that will sort symptoms alphabetically
 * The important part is the count of the number of occurrence of each symptom written in the destination file
 * 
 * The implementation needs return a SortedMap of symtoms sorted alphabetically
 */
public interface ISymptomSort {
	
	/**
	 * Generate a SortedMap of symptoms ordered alphabetically.
	 * 
	 * if the given list as parameter is empty, an empty map will be returned.
	 * @param symptoms
	 * @return
	 */
	SortedMap<String,Integer> SortSymtoms(List<String> symptoms);
}

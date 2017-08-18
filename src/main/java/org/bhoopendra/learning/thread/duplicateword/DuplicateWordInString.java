package org.bhoopendra.learning.thread.duplicateword;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicateWordInString {

	public static void main(String[] args) {
		String s = "bbaasacd";
		/*TreeMap<Character, Integer> tmp = new TreeMap<>();*/
		LinkedHashMap<Character, Integer> tmp = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++){
			if(tmp.containsKey(s.charAt(i))){
				tmp.put(s.charAt(i), tmp.get(s.charAt(i))+1);
			}
			else{
				tmp.put(s.charAt(i), 1);
			}
		}
		
		for(Entry<Character, Integer> entry: tmp.entrySet()){
			System.out.print(entry.getKey()+""+entry.getValue());
		}
	}

}

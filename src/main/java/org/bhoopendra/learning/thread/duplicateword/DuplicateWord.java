package org.bhoopendra.learning.thread.duplicateword;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DuplicateWord {

	public static void main(String[] args) {
		String s = "bbaasacd";
		Map<Character, Integer> characterMap = new TreeMap<>();
		
		for(int i=0;i<s.length();i++){
			Character ch = s.charAt(i);
			if(characterMap.containsKey(ch)){
				characterMap.put(ch, characterMap.get(ch)+1);
			}else{
				characterMap.put(ch, 1);
			}
			
			Set<Map.Entry<Character, Integer>> keyValue = characterMap.entrySet();
			
			for(Map.Entry<Character, Integer> entry:keyValue){
				System.out.println(entry.getKey());
			}
		}

	}

}

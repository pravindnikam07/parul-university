package dsa_44.old_code;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
//		String s1 = "abc";
//		String s2 = "dabc";
//		HashMap<Character, Integer> s1hm = new HashMap<>();
//		HashMap<Character, Integer> s2hm = new HashMap<>();
//		
//		for(int i = 0; i < s1.length(); i++) {
//			char key = s1.charAt(i);
//			if(s1hm.containsKey(key)) {
//				int freq = s1hm.get(key);
//				s1hm.put(key, freq + 1);
//			}
//			else {
//				s1hm.put(key, 1);
//			}
//		}
//		
//		for(int i = 0; i < s2.length(); i++) {
//			char key = s2.charAt(i);
//			if(s2hm.containsKey(key)) {
//				int freq = s1hm.get(key);
//				s2hm.put(key, freq + 1);
//			}
//			else {
//				s2hm.put(key, 1);
//			}
//		}
//		System.out.println(s1hm);
//		System.out.println(s2hm);
		
		
		
		
//		Set<Character> s1Keys = s1hm.keySet();
//		System.out.println(s1Keys);
//		
//		for(char c : s1Keys) {
//			System.out.println(s1hm.get(c) + " " + c);
//		}
		
//		Set<Map.Entry<Character, Integer>> s1Entries = s1hm.entrySet();
//		Set<Map.Entry<Character, Integer>> s2Entries = s2hm.entrySet();
//		
//		boolean isanagram = true;
//		
//		for(Map.Entry<Character, Integer> entry : s1Entries) {
//			char s1key = entry.getKey();
//			
//			if(s1hm.get(s1key) != s2hm.get(s1key)){
//				System.out.println("Strings are not anagram");
//				isanagram  = false;
//				break;
//			}
//		}
//		
//		
//		for(Map.Entry<Character, Integer> entry : s2Entries) {
//			char s2key = entry.getKey();
//			
//			if(s1hm.get(s2key) != s2hm.get(s2key)){
//				System.out.println("Strings are not anagram");
//				isanagram  = false;
//				break;
//			}
//		}
//		
//		
//		
//		
//		if(isanagram) {
//			System.out.println("String is anagram");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		HashSet<Integer> hs = new HashSet<>();
//		
//		hs.add(2);
//		hs.add(12);
//		hs.add(5);
//		hs.add(1);
//		
//		
//		
//		
//		System.out.println(hs);
//		
//		
//		for(Integer i : hs) {
//			System.out.println(i);
//		}
		
		
		
		String s1 = "abcfgh";
		String s2 = "fghabc";
		int[] s1arr = new int[26];
		int[] s2arr = new int[26];
		
		for(int i = 0; i < s1.length(); i++) {
			int index = s1.charAt(i) - 97;
			s1arr[index]++;
		}
		
		for(int i = 0; i < s2.length(); i++) {
			int index = s2.charAt(i) - 97;
			s2arr[index]++;
		}
		
		System.out.println(Arrays.toString(s1arr));
		
		System.out.println(Arrays.toString(s2arr));
		
		boolean isanagram = true;
		
		for(int i =0; i < 26; i++) {
			if(s1arr[i] != s2arr[i]) {
				System.out.println("Strings are not anagram!");
				isanagram = false;
				break;
			}
		}
		
		if(isanagram)
			System.out.println("String are anagram!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

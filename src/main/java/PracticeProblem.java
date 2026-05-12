/*
File: Lesson 5.8 - HashMaps
Author: Stephen Li
Date Created: May 12, 2026
Date Last Modified: May 12, 2026
*/

import java.util.HashMap;
import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], ages[i]);
		}
		return map;
	}

	public static void increaseAge(HashMap<String, Integer> map, String name) {
		int index = map.get(name);
		map.put(name, index + 1);
	}

	public static void replaceName(HashMap<String, Integer> map, String name1, String name2) {
		int age = map.get(name1);
		map.remove(name1);
		map.put(name2, age);
	}
}

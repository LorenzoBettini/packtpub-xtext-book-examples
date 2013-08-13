package org.example.xtend.closures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaAnonymousClasses {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("Second");
		strings.add("First");
		strings.add("Third");
		Collections.sort(strings, new Comparator<String>() {
			public int compare(String arg0, String arg1) {
				return arg0.compareToIgnoreCase(arg1);
			}
		});
		
		String found = null;
		for (String string : strings) {
			if (string.startsWith("F")) {
				found = string;
				break;
			}
		}
		System.out.println(found);
	}
}

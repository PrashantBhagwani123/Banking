package com.luv2code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOperations {

	public static void main(String[] args) {

		String strArray[] = { "Prashant", "Rahul", "Divyesh", "Ramesh" };

		
		String str = "GeeksforGeeks";
		int highestSubStrLength = subStrLength(str);
		System.out.println("length of longest substring " + highestSubStrLength);
		Arrays.sort(strArray);
		System.out.println(Arrays.toString(strArray));
		String newstr1 = str.concat("Rahul");

		String newstr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			newstr += str.charAt(i);
		}

		System.out.println(newstr);

		List<String> strList = Arrays.asList(str.split(""));

		Map<String, Long> map = strList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
		System.out.println(str);
		System.out.println(newstr1);

		// To short an String of array

		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i + 1; i < strArray.length; i++) {

				if (strArray[i].compareTo(strArray[j]) > 0) {

					String Temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = Temp;
				}

			}
		}
		System.out.println(Arrays.toString(strArray));

		List<String> strlist = new ArrayList<>();

		for (String str1 : strArray) {
			strlist.add(str1);

		}
		List<String> newstrlist = strlist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(newstrlist);
	}

	public static int subStrLength(String str) {
		String test = "";
		int maxlength = -1;

		if (str.isEmpty())
			return 0;
		if (str.length() == 1)
			return 1;

		for (char c : str.toCharArray()) {
			String current = String.valueOf(c);

			if (test.contains(current)) {
				test = test.substring(test.indexOf(current) + 1);
			}
			test = test + String.valueOf(c);
			maxlength = Math.max(test.length(), maxlength);
		}

		return maxlength;

	}

}

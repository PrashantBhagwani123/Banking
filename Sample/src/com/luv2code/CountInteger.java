package com.luv2code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class CountInteger {
	public static void main(String[] args) {

		// Program for count the repetition of a number

		int arr[] = { 1, 2, 3, 3, 4, 4, 5, 7, 6, 2, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}

		List<Integer> newlist = new ArrayList<>();

		for (int i : arr) {
			newlist.add(i);
		}

		List<Integer> uniElements = newlist.stream().distinct().collect(Collectors.toList());

		System.out.println(uniElements);
		Set<Integer> set = new HashSet<>();
		Set<Integer> newset = newlist.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
		System.out.println(newset);

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]) == false) {
				map.put(arr[i], 1);
			} else {
				int count = map.get(arr[i]);
				count++;
				map.put(arr[i], count);
			}
		}

		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> newValue = (Map.Entry<Integer, Integer>) it.next();
			if (newValue.getValue() == 1)
				System.out.println(newValue.getKey());
		}

		/*
		 * for (Map.Entry<Integer, Integer> mapvalue : map.entrySet()) {
		 * System.out.println(mapvalue.getKey()+"-->" +mapvalue.getValue()); }
		 */

	}

}

package com.astamatii.javarushexc.javasyntaxzero.L5;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class L5_8_StackTrace {

	public static void main(String[] args) {
		Map<String, Integer> screwdriverIngredients = makeScrewdriver();
		String screwdriver = screwdriverIngredients.keySet().stream()
				.map(key -> key + "=" + screwdriverIngredients.get(key)).collect(Collectors.joining(", ", "{", "}"));
		System.out.println(screwdriver + "\n");
		
		try {
			exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static Map<String, Integer> makeScrewdriver() {
		Map<String, Integer> ingredients = new TreeMap<>();

		addIce(ingredients);
		addVodka(ingredients);
		addJuice(ingredients);
		addOrange(ingredients);

		return ingredients;
	}

	static void exception() throws IOException{
		throw new IOException("EXCEPTION!");
	}
	
	static void addIce(Map<String, Integer> ingredients) {
		try {
			ingredients.put("ice cubes", 7);
		} catch (Exception e) {
			printBugMethodName(e.getStackTrace());
		}
	}

	static void addVodka(Map<String, Integer> ingredients) {
		try {
			ingredients.put("vodka", 50);
		} catch (Exception e) {
			printBugMethodName(Thread.currentThread().getStackTrace());
		}
	}

	static void addJuice(Map<String, Integer> ingredients) {
		try {
			ingredients.put(null, 100);
		} catch (Exception e) {
			printBugMethodName(Thread.currentThread().getStackTrace());
		}
	}

	static void addOrange(Map<String, Integer> ingredients) {
		try {
			ingredients.put("orange slice", 1);
		} catch (Exception e) {
			printBugMethodName(Thread.currentThread().getStackTrace());
		}
	}

	public static void printBugMethodName(StackTraceElement[] stackTraceElements) {
		StackTraceElement stackTraceElement = stackTraceElements[1];
		System.out.println(stackTraceElement.getMethodName());
	}
}

package de.thro.inf.prg3.a08.filtering;

import de.thro.inf.prg3.a08.filtering.filters.AllMealsStrategy;
import de.thro.inf.prg3.a08.filtering.filters.NoPorkStrategy;
import de.thro.inf.prg3.a08.filtering.filters.NoSoyStrategy;
import de.thro.inf.prg3.a08.filtering.filters.VegetarianStrategy;

import java.util.HashMap;
import java.util.Map;

public abstract class MealFilterFactory {

	private static final Map<String, MealsFilter> filters = new HashMap<>();

	static {
		filters.put("All", new AllMealsStrategy());
		filters.put("Vegetarian", new VegetarianStrategy());
		filters.put("No Pork", new NoPorkStrategy());
		filters.put("No Soy", new NoSoyStrategy());
	}

	private MealFilterFactory(){

	}

	public static  MealsFilter getStrategy(String key){
		return filters.getOrDefault(key, filters.get("All"));
	}

	public static MealsFilter getStrategyThroughSwitch(String key) {
		switch (key) {
			case "Vegetarian":
				return new VegetarianStrategy();
			case "No soy":
				return new NoSoyStrategy();
			case "No pork":
				return new NoPorkStrategy();
			default:
				return new AllMealsStrategy();
		}
	}
}

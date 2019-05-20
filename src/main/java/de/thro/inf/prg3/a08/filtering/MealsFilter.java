package de.thro.inf.prg3.a08.filtering;

import de.thro.inf.prg3.a08.model.Meal;

import java.util.List;

public interface MealsFilter {
	List<Meal> filter(List<Meal> meals);
}

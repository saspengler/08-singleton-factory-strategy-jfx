package de.thro.inf.prg3.a08.filtering.filters;

import de.thro.inf.prg3.a08.filtering.NotesFilterBase;

public class VegetarianStrategy extends NotesFilterBase {

	public VegetarianStrategy() {
		super(new String []{"fleisch", "schwein", "rind"});
	}
}

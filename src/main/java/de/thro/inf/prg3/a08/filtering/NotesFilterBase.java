package de.thro.inf.prg3.a08.filtering;

import de.thro.inf.prg3.a08.model.Meal;

public abstract class NotesFilterBase extends FilterBase {

	private final String[] keywordsToExclude;

	protected NotesFilterBase(String[] keyWordsToExclude) {
		this.keywordsToExclude = keyWordsToExclude;
	}

	@Override
	protected boolean include(Meal m) {

		boolean negateResult = false;

		for(String note : m.getNotes()) {
			var loweredNote = note.toLowerCase();
			for(String keyword : keywordsToExclude) {
				negateResult |= loweredNote.contains(keyword);
			}
		}

		return !negateResult;
	}
}

package pvcarrera.katas;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Sorter {

	private JournalCollection journalCollection;

	public Sorter(JournalCollection journalCollection) {
		this.journalCollection = journalCollection;
	}

	public List<Journal> getJournals(String year) {
		List<Journal> journals = this.journalCollection.getByYear(year);
		Collections.sort(journals);
		deleteQuarterly(journals);
		setPositions(journals);
		
		return journals;
	}

	private void deleteQuarterly(List<Journal> journals) {
		ListIterator<Journal> listIterator = journals.listIterator();
		while (listIterator.hasNext()) {
			if(((Journal) listIterator.next()).isQuarterly())
				listIterator.remove();
		}
		
	}

	private void setPositions(List<Journal> journals) {
		for (int index = 0; index < journals.size(); index++) {
			Journal journal = journals.get(index);
			if ( index == 0 )
				journal.setPosition(1);
			else{
				Journal previousJournal = journals.get(index -1);
				if(sameScore(journal, previousJournal))
					journal.setPosition(previousJournal.getPosition());
				else
					journal.setPosition(previousJournal.getPosition() + 1);
			}
				
		}
	}

	private boolean sameScore(Journal journal, Journal previousJournal) {
		return journal.getScore().equals(previousJournal.getScore());
	}

}

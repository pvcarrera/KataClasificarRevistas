package pvcarrera.katas;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class SorterTest {
	
	private JournalCollection journalCollection = mock(JournalCollection.class);

	@Test
	public void sortJournals() {
		List<Journal> expectedJournals = expectedJournals(
				new Journal("A", 8.9),
				new Journal("B", 2.0),
				new Journal("C", 4.4));
		when(journalCollection.getByYear("2010")).thenReturn(expectedJournals);
		
		Sorter sorter = new Sorter (journalCollection);
		List<Journal> orderedJournals = sorter.getJournals("2010");
		
		assertEquals("[position: 1 journal: A, " +
				"position: 2 journal: C, " +
				"position: 3 journal: B]", orderedJournals.toString());
	}
	
	@Test
	public void sortJournalsSameScore() {
		List<Journal> expectedJournals = expectedJournals(
				new Journal("C", 3.0),
				new Journal("A", 2.0),
				new Journal("B", 3.0));
		when(journalCollection.getByYear("2010")).thenReturn(expectedJournals);
		
		Sorter sorter = new Sorter (journalCollection);
		List<Journal> orderedJournals = sorter.getJournals("2010");
		
		assertEquals("[position: 1 journal: B, " +
						"position: 1 journal: C, " +
						"position: 2 journal: A]", orderedJournals.toString());
	}
	
	@Test
	public void sortJournalsWhitoutTrimestrals() {
		Journal journal = new Journal("A", 2.0);
		journal.setQuarterly(true);
		List<Journal> expectedJournals = expectedJournals(
				journal,
				new Journal("B", 1.0),
				new Journal("C", 3.0));
		when(journalCollection.getByYear("2010")).thenReturn(expectedJournals);
		
		Sorter sorter = new Sorter (journalCollection);
		List<Journal> orderedJournals = sorter.getJournals("2010");
		
		assertEquals("[position: 1 journal: C, " +
						"position: 2 journal: B]", orderedJournals.toString());
	}
	
    private LinkedList<Journal> expectedJournals (Journal ... journals){
    	return new LinkedList<Journal>(Arrays.asList(journals));
    }
}

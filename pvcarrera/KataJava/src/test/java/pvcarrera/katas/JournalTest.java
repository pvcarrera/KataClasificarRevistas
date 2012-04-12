package pvcarrera.katas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class JournalTest {

	@Test
	public void canCompareByScore() {
		List<Journal> journals = new ArrayList<Journal>();
		journals.add(new Journal("A",5.6));
		journals.add(new Journal("B",2.4));
		journals.add(new Journal("C",3.1));
		Collections.sort(journals);
		
		assertEquals(journals.get(0).getScore(), new Double(5.6));
		assertEquals(journals.get(1).getScore(), new Double(3.1));
		assertEquals(journals.get(2).getScore(), new Double(2.4));
	}
	
	@Test
	public void ifScoreEqualsCompareByName() {
		List<Journal> journals = new ArrayList<Journal>();
		journals.add(new Journal("C", 6.2));
		journals.add(new Journal("B", 6.2));
		Collections.sort(journals);

		assertEquals(journals.get(0).getName(), "B");
		assertEquals(journals.get(1).getName(), "C");
	}

}

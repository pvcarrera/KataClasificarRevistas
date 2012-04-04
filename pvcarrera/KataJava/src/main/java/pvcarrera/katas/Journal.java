package pvcarrera.katas;

public class Journal implements Comparable<Journal> {

	private String name;
	private Double score;
	private int position;
	private boolean quarterly;

	public Journal(String name, double score) {
		this.name = name;
		this.score = Double.valueOf(score);
	}

	public String getName() {
		return name;
	}

	public int compareTo(Journal journal) {
		int compareScores = journal.score.compareTo(this.score);
		if (compareScores == 0)
			return -journal.getName().compareTo(this.name);
		else
			return compareScores;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Double getScore() {
		return this.score;
	}

	public void setQuarterly(boolean trimestral) {
		this.quarterly = trimestral;
	}
	
	public boolean isQuarterly() {
		return quarterly;
	}
	
	@Override
	public String toString() {
		return "position: " + position + " journal: " + name;
	}


}

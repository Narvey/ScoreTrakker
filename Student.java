
public class Student implements Comparable {
	private String name;
	private int score;
	@Override
	public String toString() {
		return name + ' '+score;
	}
	public int compareTo(Student arg0) {
		return(arg0.score-score);
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

}

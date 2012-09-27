package score;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	@Override
	public String toString() {
		return name + ' '+score;
	}
	public int compareTo(Student arg0) {
		//return(name.compareTo(arg0.name));
		return(score-arg0.score);
	}
	public String getName() {
		return name;
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
}

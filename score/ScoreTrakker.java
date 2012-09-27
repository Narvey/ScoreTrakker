package score;

import java.util.ArrayList;
import java.util.Collections;

public class ScoreTrakker {
	private ArrayList<Student> students;
	
	public ScoreTrakker(){
		students = new ArrayList<Student>();
	}
	
	public void loadFromFile(String filename){
		//TODO make this work properly
	}
	
	public static void main(String[] args) {
		ScoreTrakker list=new ScoreTrakker();
                list.loadFromFile("scores.txt");
                list.printInOrder();

	}
	public void printInOrder(){
		Collections.sort(students);
		for(Student s : students){
			String temp = s.toString();
			System.out.println(s);
		}
	}

}

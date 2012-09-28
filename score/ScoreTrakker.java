package score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {
	private ArrayList<Student> students;

	public ScoreTrakker(){
		students = new ArrayList<Student>();
	}

	public void loadFromFile(String filename){
		FileReader readerforfile;
		try {
			readerforfile = new FileReader(filename);
		} catch (FileNotFoundException e1) {
			System.out.println(e1);
			return;
		}
		Scanner file = new Scanner(readerforfile);
		String nam = "";
		int sco=0;
		while(file.hasNextLine()){
			try{
				nam=file.nextLine();
				if(nam.indexOf(' ')==-1)throw new FullNameException(nam);
			}catch (FullNameException e2){
				//TODO finish this
				System.out.println(e2);
				file.nextLine();
				continue;
			}
			try{
				sco= Integer.parseInt(file.nextLine());
			}catch (NumberFormatException e3){
				System.out.println(e3);
				continue;
			}
			students.add(new Student(nam,sco));
		}
		file.close();
	}

	public static void main(String[] args) {
		ScoreTrakker list=new ScoreTrakker();
		list.loadFromFile("scores.txt");
		list.printInOrder();
		list.loadFromFile("badname.txt");
		list.loadFromFile("badscore.txt");
		list.loadFromFile("badfilename.txt");

	}
	public void printInOrder(){
		Collections.sort(students);
		for(Student s : students){
			System.out.println(s.toString());
		}
	}

}

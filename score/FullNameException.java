package score;

public class FullNameException extends Exception{
	private String name;

	public FullNameException(String name) {
		super();
		this.name = name;
	}
	public String toString(){
		return super.toString() + ": "+ name + " does not include a first and last name";
		//I did this because I wanted it to be formatted the same as the other exceptions for consistency.
	}
}

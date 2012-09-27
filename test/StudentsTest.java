package test;

import static org.junit.Assert.*;


import java.util.*;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import score.Student;

public class StudentsTest {
	private Student bob;
	private ArrayList<Student> herd;	
	@Before
	public void setUp(){
		herd = new ArrayList<Student>();
		bob=new Student("bob cornuke",0);
		herd.add(new Student("phillip the first",7));
		herd.add(bob);		
		herd.add(new Student("jerry gourd",2));		
		herd.add(new Student("al gore",3));
	}
	
	@Test
	public void testCompareTo() {
		Collections.sort(herd);
		Assert.assertEquals(bob, herd.get(0));
		Assert.assertEquals("phillip the first", herd.get(3).getName());
	}
	
	@Test
	public void testToString() {
		Assert.assertEquals("bob cornuke 0",bob.toString());
	}


}

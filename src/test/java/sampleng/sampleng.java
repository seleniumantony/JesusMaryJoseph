package sampleng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class sampleng {
	 
		@Test (priority=1)
		public void Login() // This is a Test
		{ System.out.println("1");
		}
		@Test  (priority=2)
		public void search()
		{ System.out.println(" 2");}
	             @Test  (priority=2) 
		public void t()
		{ System.out.println(" 2A");}
	             @Test   (priority=3)
		public void Logout()
		{ System.out.println(" 3");}
	              @Test   (priority=4)
		public void Logout1()
		{ System.out.println(" 4");}
	              @Test   (priority=5)
		public void Logout125()
		{ System.out.println("5");}
	              @Test  (priority=6)
		public void Logout12()
		{
		System.out.println("6");
		}}
 

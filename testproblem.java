package test1;


	import static org.junit.Assert.*;
	import org.junit.Test;

	public class testproblem {
	    public static problem cal = new problem();
	    @Test 
	     public void testTriangle(){  
	    	 cal.triangle(5, 5, 5);
	         assertEquals("等边三角形", cal.getReuslt());
	         cal.triangle(5, 5, 6);
	         assertEquals("等腰三角形", cal.getReuslt());
	         cal.triangle(3, 4, 5);
	         assertEquals("普通三角形", cal.getReuslt());
	         cal.triangle(12, 5, 5);
	         assertEquals("等腰三角形", cal.getReuslt());
	         cal.triangle(10, 5, 5);
	         assertEquals("等腰三角形", cal.getReuslt());
	         cal.triangle(11, 5, 5);
	         assertEquals("等腰三角形", cal.getReuslt());
	         cal.triangle(-1, 5, 5);
	         assertEquals("等腰三角形", cal.getReuslt());
	         }
	    
}

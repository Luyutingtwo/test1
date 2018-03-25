package test1;

public class problem {
	 private static String s1="";
	 public String getReuslt(){
	        return s1;
	    }
	 
	 public void triangle(int a,int b,int c) {
		 if(a>0 && b>0 && c>0) 
		 {
		     if((a+b>c)&&(a+c>b)&&(b+c>a))
		     {
			      if((a==b)&&(b==c)) {
				     s1="等边三角形";
				     
			       }
			       if((a==b && a!=c)||(a==c && a!=b)||(b==c && a!=b)) {
				      s1="等腰三角形";
			       }
			       if(a!=b && a!=c && b!=c) {
				      s1="普通三角形";
			       }
			 
		 }  else {
			      s1="不构成三角形";
		           System.out.println(s1);
		          }
	   }
		    else {
			      s1="三角形边长必须大于0！";
		         }
	 }

}

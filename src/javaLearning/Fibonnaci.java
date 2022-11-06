package javaLearning;

public class Fibonnaci{
	public static void main(String[] args) {
	    int a=1;
	    int b=0;
	    int c=0;
	    
	    
		while(c<=60){
		   System.out.print(c+"\t");
		    c=a+b;
		    a=b;
		    b=c;
		}
	}
}

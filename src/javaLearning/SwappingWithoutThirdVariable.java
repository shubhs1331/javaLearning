package javaLearning;

public class SwappingWithoutThirdVariable{
public static void main(String args[]){
      int c=4;
	  int d=3;
	  c=d+c-(d=c);
	  System.out.println("value of c after swapping : "+ c);
	  System.out.println("value of d after swapping : "+d);
	  System.out.println(c+" "+d);
	}
}

package javaLearning;

public class Pallindrome
{
	public static void main(String[] args) {
	  int num = 122;
	  int temp = num;
	  int sum =0;
	  
	  while(num>0){
	      int rem = num%10;
	      num = num/10;
	      sum=sum*10+rem;
	  }
	  if(temp==sum){
	      System.out.println(temp+" is Pallindrome");
	  }
	  else{
	      System.out.println(temp+" is not pallindrome");
	  }
	}
}
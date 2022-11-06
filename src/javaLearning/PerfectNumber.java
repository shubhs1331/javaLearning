package javaLearning;

public class PerfectNumber{
	public static void main(String[] args) {
	    int n =14;
	    int temp=n;
	    int sum=0;
	  for(int i=1;i<=(temp/2);i++){
	      if(temp%i==0 && n>1){
	          sum=sum+i;
	          System.out.println(sum+" "+i);
	      }
	  }
	  
	  if(sum == temp){
	      System.out.println(temp + " is a perfect number");
	  }
	  else{
	      System.out.println(temp + " is not a perfect number");
	  }
	}
}

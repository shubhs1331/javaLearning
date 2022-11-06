package javaLearning;

public class PrimeNumber
{
	public static void main(String[] args) {
	    int n =12;
	    boolean flag = true;
		for(int i=2;i<=Math.pow(n,0.5);i++){
		    if(n%i==0){
		        System.out.println(n+" is not a prime number");
		        flag=false;
		        break;
		    }
		}
		if(flag==true){
		System.out.println(n+" is a prime number");
		}
	}
}

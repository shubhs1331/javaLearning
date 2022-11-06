package javaLearning;

/** Armstrong Number
It is a positive m-digit number  ie equal to the sum of the mth power of their digits

2 = 2*1 = 2
153 = (1*1*1)+(5*5*5)+(3*3*3) = 153
1634 =(1*1*1*1)+(6*6*6*6)+(3*3*3*3)+(4*4*4*4) = 1634
**/

public class ArmstrongNumber{
	public static void main(String[] args) {
	    String n = "153";
	    int cnt=n.length();
	    System.out.println("power : "+cnt);
	    int num = Integer.parseInt(n);
	    System.out.println(num);
	    ArmstrongNumber obj = new ArmstrongNumber();
	    obj.checkArmstrong(num,cnt);
	}
	
	public void checkArmstrong(int num, int cnt){
	    int temp = num;
	    int digit =0;
	    int sum=0;
	    while(num>0){
	        digit=num%10;
	        num=num/10;
	        sum=sum+(int)Math.pow(digit,cnt);
	    }
	    
	    if(sum==temp){
	        System.out.println(temp + " is an Armstrong Number");
	    }
	    else{
	          System.out.println(temp + " is not an Armstrong Number");
	    }

	}
}



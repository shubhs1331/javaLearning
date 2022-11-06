package javaLearning;

public class EnhancedForLoop
{
	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++){
		    arr[i]=i*2;
		}
		int index=0;
		for(int j:arr){
		    System.out.println((index+1)+" element is :"+j);
		    index++;
		}
	}
}

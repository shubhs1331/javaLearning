package javaLearning;

public class OnedArray{
	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++){
		    arr[i]=i*2;
		}
		for(int i=0;i<arr.length;i++){
		    System.out.println((i+1)+" element is :"+arr[i]);
		}
	}
}
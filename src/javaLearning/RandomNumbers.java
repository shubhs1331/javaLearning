package javaLearning;

import java.util.*;
public class RandomNumbers
{
	public static void main(String[] args) {
	    Random r = new Random();
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++){
		    arr[i]=r.nextInt(50);
		}
		int index=0;
		for(int j:arr){
		    System.out.println((index+1)+" element is :"+j);
		    index++;
		}
	}
}
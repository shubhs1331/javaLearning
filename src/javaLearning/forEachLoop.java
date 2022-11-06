package javaLearning;

import java.util.*;
public class forEachLoop
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String fruits[] = new String[5];
	    for(int i=0;i<fruits.length;i++){
	        fruits[i]=sc.nextLine();
	    }
	    System.out.println("------------------\nThe Array of Fruits is : ");
	    for(String fruit : fruits){
	        System.out.println(fruit);
	    }
	     System.out.println("------------------\nThe List of Fruits is : ");
	    List <String> fruitsList = Arrays.asList(fruits);
	    fruitsList.forEach(System.out::println);
	    
	    
	}
}
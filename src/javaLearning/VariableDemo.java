package javaLearning;

class VariableDemo{
 public static void main(String args[]){
  
    short month =12;
    byte age = 27;
    int num=10;
    long code = 83248274;
    float amount = 547.45f;
    double salary = 83499945.87;
    char grade = 'A';
    boolean response = true;  
    VariableDemo demo = new VariableDemo();
    demo.printValues(month,age,num,code,amount,salary,grade,response);
 }

public void printValues(short month,byte age,int num,long code,float amount,double salary,char grade,boolean response){

System.out.println("Month : "+month);
System.out.println("Age : "+age);
System.out.println("Number : "+num);
System.out.println("code : "+code);
System.out.println("Amount : "+amount);
System.out.println("Salary : "+salary);
System.out.println("Grade : "+grade);
System.out.print("Response : "+response);
}
}
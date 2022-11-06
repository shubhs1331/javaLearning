package javaLearning;

class TypeCasting{
 public static void main(String args[]){

   int num = 1234;
   double salary = 784547.50;
   
   //implicitly typecast
   double implictNum = num;
   //int implictSalary = salary;
  // explicitly typecast
     int implictSalary = (int)salary;

   System.out.println("Implicitly typecast number : "+implictNum);
// when we try to convert higher value into lower it will loose some data 
   System.out.println("Implicitly typecast salary : " + implictSalary);

 }
}
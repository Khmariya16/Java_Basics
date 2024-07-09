//methods in java
import java.util.Scanner;  
public class EvenOdd  
{  
public static void main (String args[])  
{  
Scanner scan=new Scanner(System.in);  
System.out.print("Enter the number: ");  
int num=scan.nextInt();  
findEvenOdd(num);  
}  

public static void findEvenOdd(int num){
    if(num%2 == 0)
      System.out.println("EVEN");
    else
      System.out.println("ODD");
}
}

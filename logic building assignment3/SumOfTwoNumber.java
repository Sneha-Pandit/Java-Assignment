import java.util.Scanner;

public class SumOfTwoNumber
{
     static int SumOfTwoNumber(int a, int b)
{
      int sum=a+b;
      return sum;
}
     public static void main(String[] args)
{
     Scanner value1 = new Scanner(System.in);
      System.out.println("please enter the first value:");
       int a = value1.nextInt();

      Scanner value2 = new Scanner(System.in);
       System.out.println("please enter the second value:");
      int b = value2.nextInt();
        
     int result = SumOfTwoNumber(a,b);
      System.out.println("sum :" +result);


}



}
import java.util.Scanner;
 public class PositiveNumber{
   public static void askForPositiveNumber(){
       Scanner sc=new Scanner(System.in);
         int num;
    do{
  System.out.println("enter a positive number:");
      num=sc.nextInt();
} while(num<=0);
System.out.println("you entered a positive number:" +num);
}
public static void main(String[] args){
    askForPositiveNumber();
}



}






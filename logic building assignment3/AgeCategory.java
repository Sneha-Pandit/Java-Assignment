import java.util.Scanner;
  
public class AgeCategory {
    public static void main (String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter your age");
 int age= sc.nextInt();
   if (age<18){
    System.out.println("you are minor");
} else if(age<40)
{
     System.out.println("you are adult");

} else if(age<140){
     System.out.println("you are senior citizen");

} else {
    System.out.println("sorry ");

}
  




}


}

  
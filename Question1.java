import java.util.Scanner;
public class Question1{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in)；
    System.out.printIn("Enter an integer: ");
    int num = input.nextInt();
    System.out.printIn("The factors are: ");
    for (int i = 1; i <= num; i++){
      if (num % i == 0){
        System.out.print(i + " ");
      }
    }
    input.close();
  }
}   
    
    

import java.util.Scanner;
public class Question2{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.printIn("Enter an Integer: ");
    int n = input.nextInt();
    int sum = 0;
    for (int i = 0; i <= n; i++){
      for (int j = 0; j <= i; j++){
        sum += j;
      }
    }
    System.out.print("The total number is: " + sum);
    input.close();
  }
}








        
          

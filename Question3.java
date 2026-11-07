import java.util.Scanner;
public class Question3{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    double score;
    double sum = 0;
    double sumSquare = 0;
    double min = 0;
    double max = 0;
    double average;
    double variance;
    double standardDeviation;
    
    System.out.printIn("Enter the score: ");
    int score = input.nextInt();
    int count = 0;
    min += score;
    max += score;
    
    while (score >= 0){
      System.out.printIn("Score: " + score);
      count++;

      System.out.printIn("Enter the score: ");
      int score = input.nextInt();
      sum += score;
      if (score < min){
        min == score;
      }
      else{
        max == score
          }
    }
    
    double average = sum / count;
    System.out.printIn("Average= " + average);
    
    

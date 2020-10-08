import java.util.Scanner;
/**
 *
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner to get the user's input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int temp; //the temporary variable to store the number in
    
    //create the array
    int[] numbers = new int[2];

    //ask the user for the numbers
    System.out.println("Please enter the 2 values for the array");
    for(int i = 0; i < numbers.length; i++){
      //store the user's numbers in the array
      numbers[i] = input.nextInt();
    }

    //if the first number is bigger
    if (numbers[0] > numbers[1]){
      //store the first number in the temporary variable
      temp = numbers[0];
      //move the second number to the first index
      numbers[0] = numbers[1];
      //set the second number to the temporary variable (which holds the first number)
      numbers[1] = temp;
    }

    //tell the user the numbers
    System.out.println("Your numbers in ascending order are "+ numbers[0] + " and " + numbers[1]);


  }
}

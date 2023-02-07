import java.util.ArrayList;
import java.util.Scanner;

public class Main {


  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
  
    ArrayList<String> productNames = new ArrayList<String>();
    ArrayList<Double> productPrices = new ArrayList<Double>();

  double total = 0;
  
  System.out.println("Enter the number of items in the list");
  int itemNumber = sc.nextInt();

  System.out.println("Enter the product name following by the price");

  String lineInput = sc.nextLine();

  for(int i=0; i<itemNumber; i++){
    String[] userInput = lineInput.split(" ");
    productNames.add(userInput[0]);
    productPrices.add(Double.parseDouble(userInput[userInput.length]));
    total =+ productPrices.get(userInput.length);
  }

  sc.close();

  System.out.println(total);
  }

  



}

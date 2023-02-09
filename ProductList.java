/*
 * Write a Java program to accept the names of three items 
 * along with their prices from the user and output them and
 * the average price to a user. 
 */


import java.util.Scanner;

public class ProductList {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String productNames = "";
    Double productPrices = 0.0;

    String finalOutput = "";

    double averagePrice = 0;

    System.out.println("Enter the number of items in the list");
    int itemNumber = sc.nextInt();

    System.out.println("Enter the product name following by the price");

    for (int i = 0; i < itemNumber; i++) {

      productNames = sc.next();  
      productPrices = sc.nextDouble();

      finalOutput += productNames + " " + productPrices + "\n"; 
      averagePrice += productPrices;
    }

    sc.close();

    System.out.println("\n\n************\n" + finalOutput + "--------------\n" + "Average Price:" + averagePrice / itemNumber);

  }

}

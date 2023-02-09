/*
 * Write a Java program to accept three item names, and
 * prices, and output them. Also, output the average price if
 * one of the items is named Peas (not case sensitive)
 * otherwise output: “no average output”.
 */

import java.util.Scanner;

public class ProductListAverage {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String productNames = "";
    Double productPrices = 0.0;

    String finalOutput = "";

    double averagePrice = 0;

    double total = 0;

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

    if (finalOutput.contains("Peas")) {
      total = averagePrice / itemNumber;
      System.out.println("\n\n************\n" + finalOutput + "--------------\n" + "Average Price:" + total);
    } else {
      System.out.println("no average output");
    }

  }

}

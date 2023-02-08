import java.util.Scanner;

public class ReverseProductList {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String finalOutput = "";

    double averagePrice = 0;

    double total = 0;

    System.out.println("Enter the number of items in the list");
    int itemNumber = sc.nextInt();

    String[] productNames = new String[itemNumber + 1];
    Double[] productPrices = new Double[itemNumber + 1];

    System.out.println("Enter the product name following by the price");

    for (int i = 0; i < itemNumber; i++) {

      productNames[i] = sc.next();
      productPrices[i] = sc.nextDouble();

      averagePrice += productPrices[i];
    }

    for (int i = itemNumber - 1; i >= 0; i--) {
      finalOutput += productNames[i] + " " + productPrices[i] + "\n";
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

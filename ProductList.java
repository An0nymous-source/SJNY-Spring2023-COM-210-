import java.util.Scanner;

public class ProductList {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String productNames = "";
    Double productPrices = 0.0;

    String receipt = "";
    double total = 0;
    System.out.println("Enter the number of items in the list");
    int itemNumber = sc.nextInt();

    System.out.println("Enter the product name following by the price");

    for (int i = 0; i < itemNumber; i++) {

      productNames = sc.next();
      productPrices = sc.nextDouble();
      
      receipt += productNames + " " +  productPrices + "\n";
      total += productPrices;
    }

    sc.close();

    System.out.println("\n\n***Receipt***\n" + receipt + "--------------\n" + "Average Price:" + total / itemNumber);

  }

}

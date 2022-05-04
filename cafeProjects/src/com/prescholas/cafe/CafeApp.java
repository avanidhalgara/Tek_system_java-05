package com.prescholas.cafe;

import java.util.Scanner;

public  class CafeApp {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
int quant1, quant2, quant3;
double saleSubTotal, salesTotal;
double salesTax;
char choice;

Product prod1 = new Coffee("coffee",3.67,"Regular dark Cofffee");
Product prod2 = new Espresso("espresso");
Product prod3 = new Cappuccino("cappuccino");


// Assigning prices and description to each instance.
prod1.setPrice(3.67);
prod1.setDescription("Regular dark coffee");
prod2.setPrice(4.99);
prod2.setDescription("Concatrated form of coffee served in small, strong shots");
prod3.setPrice(5.99);
prod3.setDescription("Perfect balance of espresso, steamed milk and foam");

//Getting the quantity for coffee product.
System.out.println("How many coffee would you like:");
quant1 = scan.nextInt();
prod1.setQuantity(quant1);
double coffeeTotal = prod1.calculateProductTotal();
System.out.println("Product name :"+prod1.getName());
System.out.println("Product description: "+prod1.getDescription());
System.out.println("Product subtotal: "+prod1.calculateProductTotal());
System.out.println("-------------");

//Getting the quantity for espresso product.

System.out.println("How many espresso would you like:");
quant2 = scan.nextInt();
prod2.setQuantity(quant2);
System.out.println("Do you like to add extra shot and macchiato");


double espressoTotal = prod2.calculateProductTotal(); System.out.println("Product name :\n"+prod2.getName());
System.out.println("Product description: "+prod2.getDescription());
System.out.println("Product subtotal: "+prod2.calculateProductTotal());
System.out.println("--------------");

//Getting the quantity for cappuccino product.
System.out.println("How many cappuccino would you like:");
quant3 = scan.nextInt();
prod3.setQuantity(quant3);
double cappuccinoTotal = prod3.calculateProductTotal();
System.out.println("Product name :"+prod3.getName());
System.out.println("Product description: "+prod3.getDescription());
System.out.println("Product subtotal:\n "+prod3.calculateProductTotal());
System.out.println("--------------");

//Calculating the sales subtotal.
saleSubTotal = coffeeTotal + espressoTotal +cappuccinoTotal;
System.out.print("The sales subtotal is : " +saleSubTotal);



/*
* System.out.println(prod1.getName()); System.out.println(prod1.getQuantity());
*/

}
}


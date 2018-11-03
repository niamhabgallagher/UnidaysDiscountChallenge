// Niamh Gallagher Program Application
import java.util.*;

public class UnidaysDiscountChallenge {

  //variable to hold the total cart price
  public static int cartPrice = 0;

  //variables for the number of items
  public static int priceA = 0;
  public static int priceB = 0;
  public static int priceC = 0;
  public static int priceD = 0;
  public static int priceE = 0;

  public static void main(String args[]){

    AddToBasket();
    CalculateTotalPrice();
  }

  public static void AddToBasket(){

    Scanner reader = new Scanner(System.in);
    System.out.println("Please enter your order: ");
    String userInput = reader.nextLine();
    reader.close();

    //changing the user input string to an array of char
    char[] orderArray = userInput.toCharArray();
    int arrayLength = orderArray.length;

    for(int i = 0; i < arrayLength; i++){

      //switch statement for the item that they have entered
      switch(orderArray[i]){

        case 'A': priceA++;
                  break;
        case 'B': priceB++;
                  break;
        case 'C': priceC++;
                  break;
        case 'D': priceD++;
                  break;
        case 'E': priceE++;
                  break;
        default:  System.out.println("Error Invalid Input");
                  System.out.println("Must be capital A, B, C, D and/or E");
                  System.exit(1);
                  break;
      }
    }
  }

  public static void CalculateTotalPrice(){

    //adding all the A products prices to the cart
    for(int i = 0; i < priceA; i++){

      cartPrice += 8;
    }

    //checking discounts for B
    //checking if there is more than 2 for discount
    //and adding them to the cost
    while(priceB >= 2){

      cartPrice+= 20;
      priceB -= 2;
    }

    //if only 1 then adding the one to the cost
    if(priceB==1){

      cartPrice+=12;
    }

    //calcualting discounts for c
    while(priceC >= 3){

      cartPrice+=10;
      priceC -= 3;
    }

    if(priceC == 2){

      cartPrice += 8;
    }else if(priceC == 1){

      cartPrice+=4;
    }

    //calculating discountd for D
    while (priceD >= 2){

      cartPrice+=7;
      priceD -= 2;
    }

    if(priceD == 1){

      cartPrice+=7;
    }

    //calculationg discount for E
    while(priceE >= 3){

      cartPrice+=10;
      priceE-=3;
    }

    if(priceE == 2){

      cartPrice += 10;
    }else if(priceE == 1){

      cartPrice+=5;
    }

    System.out.println("Total Cart Price = £" + cartPrice);

    //calculating delivery Charges
    if(cartPrice < 50){

      int moreForDel = 50 - cartPrice;
      System.out.println("You need to spend £" + moreForDel + " more to be eligable for free delivery");
      System.out.println("Delivery is £7");
      cartPrice+=7;
      System.out.println("Total Price - £" + cartPrice);
   }else {

      System.out.println("You have Spent over £50!");
      System.out.println("You are eligable for Free Delivery!");
      System.out.println("Total Price - £" + cartPrice);
  }
 }
}

import java.util.Scanner; // Import Scanner Class

public class CountChange {
  public static void main(String[] args) 
  {
    Scanner inputCost = new Scanner(System.in); // Create Scanner object for cost input
    System.out.print("Enter cost (in cents) for item: ");

    int price = inputCost.nextInt(); // Input the price for the cost of the item

    System.out.println("Cost inputed by user: "+ price + " cents");

    int change, cents, quarters, dimes, nickels, pennies; // Types of numbers used
    cents = 100; // Amount of money to begin with
    if (price > cents){
      System.out.println("Please input a cost less than 100 cents.");
    }
    else{
    System.out.println("Balance = " + cents + " cents"); 
    
    change = cents - price; // Amount of money (in cents) needed to be returned
    System.out.println("INPUT SUCCESSFUL. Amount returned : "+ change + " cents");

    System.out.println("===== CHANGE RETURNED =====");
    quarters = change / 25; // Returns amount of quarters from leftover change
    System.out.println("Quarters: " + quarters);

    change -= 25 * quarters; // Subtracts total cost resulted from the number of quarters from the change needed to be returned
    dimes = change / 10;
    System.out.println("Dimes: " + dimes);

    change -= 10 * dimes; // Subtracts total cost resulted from the number of dimes from the change needed to be returned
    nickels = change / 5; 
    System.out.println("Nickels: " + nickels);

    pennies = change - (5 * nickels);
    System.out.println("Pennies: " + pennies);

    inputCost.close();
    }
    }

  }

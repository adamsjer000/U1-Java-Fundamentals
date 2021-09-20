public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
public static void main (String[] args){

    double gameCost = 60.00;
    double sale = 48;


    double totalPrice = gameCost - sale;

    System.out.println("The total price of the game with the sale is " + totalPrice);
}


}

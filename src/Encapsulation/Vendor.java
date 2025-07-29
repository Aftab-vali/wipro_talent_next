package Encapsulation;

class VendingMachine {
    private int drinkStock = 10;
    private int moneyCollected = 0;
    protected String address="near my home";



    public void buyDrink(int moneyInserted) {
        if (drinkStock > 0 && moneyInserted >= 20) {
            drinkStock--;
            moneyCollected += moneyInserted;
            System.out.println("Here is your cold drink! 🍹");
        } else if (drinkStock <= 0) {
            System.out.println("Sorry, out of stock!");
        } else {
            System.out.println("Please insert at least 20 rupees.");
        }
    }

    private void money(){
        System.out.println("the money collected is:"+ moneyCollected);
    }


    public void checkStock() {
        System.out.println("Drinks left: " + drinkStock);
        System.out.println(address);
    }
}

public class Vendor {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.buyDrink(20);  // buys a drink
        machine.checkStock();
        machine.address="near BITM";
        System.out.println(machine.address);


//        machine.drinkStock = 100;
//        machine.moneyCollected = 0;
    }
}


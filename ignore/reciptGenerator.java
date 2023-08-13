import java.util.Scanner;
class item {
    int takeMoney;
    int giveMoney;
    int [] itemPrice;
    String [] itemList;
    public item(){
        itemPrice = new int[]{20, 100, 50};
       // itemList = new String [100];
        itemList = new String[]{"namkeen" ,"powder" , "choco" };

    }
    public void showAvailableItem() {
        int num = 1;
        for (int i = 0; i < 3; i++, num++) {

            System.out.print(num + ".");
            
            System.out.print(itemList[i]);
            System.out.print("   ");
            System.out.println(itemPrice[i]);

        }
    }

    public int inChange(int x , int y){
        x--;
        int price =itemPrice[x];
        int change = y - price;
        if (y<price){
            System.out.println("please give valid amount of money ");
            return -1 ;
        }else {
            return change;
        }

    }


}
public class reciptGenerator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        item start = new item();
        System.out.println("Company name");
        System.out.println("  items  Price");
        start.showAvailableItem();
        System.out.println("what you want to buy? eg. 1,2,3,..");
        int a = sc.nextInt();
        System.out.println("give money you have ");
        int b = sc.nextInt();
        int change = start.inChange(a,b);
        System.out.println("Processing this transaction. \nthanks you for purchasing from our company.");
        if (change == -1){
            System.out.println("process cancelled and money is being refunded. ");
        }else {
        System.out.println("here are your ₹ " + change + " as change");
        }


    }
}

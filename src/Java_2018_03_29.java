//import java.util.Scanner;
//
//
//class bank {
//   int money;
//
//   bank() {
//
//   }
//
//   bank(int money) {
//    this.money = money;
//   }
//
//   public void despoit(int money){
//       if(money > 0) {
//           this.money += money;
//           this.printing();
//       }
//
//   }
//    public void withdraw(int money){
//        if(money > 0) {
//            this.money -= money;
//            this.printing();
//        }
//    }
//    public void printing() {
//        System.out.println("현재 있는 돈 : " + money);
//    }
//
//}
//
//public class Java_2018_03_29 {
//
//    public static void main(String[] args) {
//        bank myaccount = new bank(5000);
//        myaccount.despoit(500);
//        myaccount.withdraw(1000);
//    }
//}
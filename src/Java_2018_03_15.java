import java.util.Scanner;

public class Java_2018_03_15 {

    public static void main(String[] args) {
//
//        int number;
//        String name;
//
//
//        Scanner scan = new Scanner(System.in);
//        name = scan.next();
//        number = scan.nextInt();
//
//        System.out.println(name);
//
//        String name;
//        String subject;
//        int age;
//        int serial;
//
//        Scanner scan = new Scanner(System.in);
//
//        name = scan.next();
//        subject = scan.next();
//        age = scan.nextInt();
//        serial = scan.nextInt();
//
//        System.out.println(name + " " + subject + " " + age + " " + serial);
//
//        int a;
//        int b;
//
//        Scanner scan = new Scanner(System.in);
//
//        a = scan.nextInt();
//        b = scan.nextInt();
//
//        if(a >= 6) {
//            System.out.println("a는 무료커피");
//        } else if(a >= 4) {
//            System.out.println("a는 무료쿠키");
//        } else if(a >= 0) {
//            System.out.println("a는 서비스X");
//        }
//
//        if(b >= 6) {
//            System.out.println("b는 무료커피");
//        } else if(b >= 4) {
//            System.out.println("b는 무료쿠키");
//        } else if(b >= 0) {
//            System.out.println("b는 서비스X");
//        }

        int time;

        Scanner scan = new Scanner(System.in);

        time = scan.nextInt();

        if(time > 8) {
            System.out.println(8 * 9000 + ((time - 8) * 9000 * 1.5) + "원");
        } else {
            System.out.println(time * 9000 + "원");
        }
    }
}
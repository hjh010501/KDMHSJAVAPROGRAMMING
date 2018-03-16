import java.util.Scanner;

public class Java_2018_03_16 {

    public static void main(String[] args) {
//        int a;
//
//        Scanner scan = new Scanner(System.in);
//
//        a = scan.nextInt();
//
//        switch (a) {
//            case 2:
//                System.out.println("28일");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("30일");
//                break;
//            default:
//                System.out.println("31일");
//        }

//        int n;
//        int b = 1;
//
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();10
//
//        for(int i = 1; i <= n; i++) {
//            b *= i;
//        }
//        System.out.println(b);

//        Scanner scan = new Scanner(System.in);
//
//        int a = scan.nextInt();
//        int count = 1;
//
//        while(count <= 10) {
//            System.out.println(a + " x " + count + " = " + a*count);
//            count++;
//        }

//        Scanner scan = new Scanner(System.in);
//
//        int answer = scan.nextInt();
//        int a;
//
//        do {
//            a = scan.nextInt();
//            if(a > answer) {
//                System.out.println("정답보다 큼");
//            } else if(a < answer) {
//                System.out.println("정답보다 작음");
//            } else if(a==answer) {
//                System.out.println("정답");
//                break;
//            }
//        } while(true);

        int count = 1;

        System.out.println("2");
        for(int i = 2; i < 100; i++) {
            for(int j = 2; j < i; j++ ) {
                if(i % j == 0) {
                    break;
                } else if(j == i-1) {
                    System.out.println(i);
                    count++;
                }
            }
        }

        System.out.println(count + "개");

        Scanner scan = new Scanner(System.in);

        String operation = scan.next();

        int a = scan.nextInt();
        int b = scan.nextInt();

        if(operation.equals("+")) {
            System.out.println(a+b);
        } else if(operation.equals("-")) {
            System.out.println(a-b);
        } else if(operation.equals("*")) {
            System.out.println(a*b);
        } else if(operation.equals("/")) {
            if(b == 0) {
                System.out.println("나누는 수 0 ㅡㅡ");
            } else {
                System.out.println(a / b);
            }
        }

    }
}
public class Java_2018_03_13 {

    public static void main(String[] args) {
        // ㅁㅁㅁ
        // ㅁㅁㅁ
        // : 2행 3열
        // 123
        // 456

        // && 앞에께 false 면 뒤에꺼 수행 X
        // || 앞에께 true 면 뒤에꺼 수행 X

//        int x = 1;
//        int y = 1;
//
//        int nextx = ++x;
//        int nexty = y++; // y 가 증가되는거임ㅋ
//
//        System.out.println(nextx);
//        System.out.println(nexty);

        // & 두 비트가 모두 1 일때만 1, 하나라도 0이면 0
        // | 두 비트중 하나라도 1이면 1
        // ^ XOR 연산 (0 1, 1 0 만 1)


//        int a = 10;
//        int b = 23;
//
//        System.out.println("몫 : " + ((a>b) ? a / b : b / a) + " 나머지 : " + ((a>b) ? a % b : b % a));
//
//        int key = 172;
//        int fit = 12;
//        double inch = 2.54;
//
//        System.out.println((key / fit) + "피트 " + (key - (key / fit) * fit) / inch + "인치 ");
//
//        double max = 165;
//        double perfit = 13;
//        double perinch = 3;
//
//        System.out.println((perfit * 12 + perinch * inch) + "cm" + (((perfit * 12 + perinch * inch) > max) ? "가능" : "불가능"));

//        String target = "Here is Korea Digital Media High School";
//
//        System.out.println(target.concat("and Here is Ansan"));
//        System.out.println(target.substring(11));
//        System.out.println(target.substring(11, 16));
//        System.out.println(target.replace('o', '0'));
//        System.out.println(target.replace("Here", "My Name"));
//        System.out.println(target.toLowerCase());
//        System.out.println(target.toUpperCase());

        String coffee1 = "Americano";
        String coffee2 = "Americano";
        System.out.println("coffee1 and coffee2 : " + ((coffee1 == coffee2) ? "same" : "not same"));

        String coffee3 = new String("Americano");
        String coffee4 = new String("Americano");
        System.out.println("coffee3 and coffee4 : " + ((coffee3 == coffee4) ? "same" : "not same"));

        System.out.println(coffee1 +"," + System.identityHashCode(coffee1));
        System.out.println(coffee2 +"," + System.identityHashCode(coffee2));
        System.out.println(coffee3 +"," + System.identityHashCode(coffee3));
        System.out.println(coffee4 +"," + System.identityHashCode(coffee4));

        // 1순위 함수, 괄호, 배열 ()[].
        // 2순위 전치 ++ == ~ !
        // 3순위 * / %
        // 4순위 기강 + -


    }
}
//import java.util.Scanner;
//
//class Animal {
//    public void eat () {
//
//    }
//
//    public void sleep() {
//        System.out.println("animal");
//    }
//}
//
//class Dog extends Animal {
//    public void sleep() {
//        System.out.println("dog");
//    }
//
//    public void run() {
//
//    }
//}
//
//public class Java_2018_04_06 {
//
//    // 묵시적 형 변환 == UpCasting
//    // 명시적 형 변환 == DownCasting
//
//    // 업 캐스팅은 특정 객체가 하위 클래스의 형에서 상위 클래스의 형으로 변환되는것으로 형만 정확하다면 묵시적으로 형 변환된다.
//    // 다운 캐스팅은 업 캐스팅 한 것을 다시 원래의 형으로 복구 시켜 주는 것으로 업 캐스팅된 것만 다운 캐스팅 시킬 수 있다 다운 캐스팅은 강제 캐스팅을 원칙으로 한다.
//
//    // animal 을 참조하는 서브 클래스인 dog을 animal a = new dog() 으로 선언하였는데,animal 에 없고 dog 에만 (서브클래스) 있다면 오류나고 (다운 캐스팅하면 잘 됨), 같은 메소드가 각각 있다면 dog의 메소드가 실행된다.
//
//    public static void main(String[] args) {
//
//        Animal ani = new Dog(); // 업 케스팅
////        Dog dg = (Dog)ani; // 다운 캐스팅
//
//        ani.eat();
//        ani.sleep(); // dog 출력됨, 서브 클래스에 있는게 오버라이딩 됨
//        ani.run(); // error (Animal, 즉 클래스 타입 기준으로 하위 클래스에 해당 메소드가 있어도 상위에 없으면 undefined error 됨
//
//        // 형변환 할 때 상위 클래스 = 하위클래스, 하위클래스 = (하위클래스) 상위클래스 로만 가능
//    }
//}
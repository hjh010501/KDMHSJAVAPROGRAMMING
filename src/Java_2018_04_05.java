//class Car {
//    String carName;
//    String color;
//    int velocity;
//
//    public void speedUp() {
//        velocity += 5;
//        System.out.println("속도는 " + velocity);
//    }
//
//    public void speedDown() {
//        velocity -= 5;
//        System.out.println("속도는 " + velocity);
//    }
//
//}
//
//class Truck extends Car {
//    int ton;
//
//    public void speedUp() {
//        velocity += 10;
//        System.out.println("속도는 " + velocity);
//    }
//
//}
//
//public class Java_2018_04_05 {
//
//    // 메소드 오버라이딩의 조건
//    // - 상위 클래스 메소드의 이름, 인자반환형에 대해서 완전히 같아야 한다
//    // - static , final, private 메소드의 경우에는 오버라이딩을 할 수 없다
//
//    // 오버라이딩은 내부에서의 내용이 달라지면 쓰는 것 (자식 클래스에서만 가능)
//    // 오버로딩은 매개변수의 갯수와 타입도 바낄 수 있음
//    public static void main(String[] args) {
//
//        Truck t1 = new Truck();
//        t1.speedUp();
//        t1.speedDown();
//    }
//}
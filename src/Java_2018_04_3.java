////class Student {
////
////    int serial;
////    String name;
////
////
////    Student() {
////
////    }
////
////    Student(int S, String N) {
////        this.serial = S;
////        this.name = N;
////    }
////
////    void print() {
////        System.out.println(serial + " " + name);
////    }
////
////}
////
////class School extends Student {
////
////    String subject;
////
////}
////
////public class Java_2018_04_3 {
////
////
////    // 1. 상속 받는 클래스 = 서브 클래스, 하위 클래스, 자식 클래스
////    // 2. 상속 하는 클래스 = 슈퍼 클래스, 상위 클래스, 부모 클래스
////    public static void main(String[] args) {
////
////        School awd = new School();
////        awd.serial=2436;
////        awd.name="함종현";
////        awd.subject = "Web programming";
////        awd.print();
////        System.out.println(awd.subject);
////    }
////}
//
//// 1. 자바의 최상위 클래스는 Object, 모든 클래스는 Object 를 상속받는다.
//
//
//
//class circle {
//
//    double radius;
//    String color;
//
//    final double pie = 3.14;
//
//    circle() {
//
//    }
//
//    circle(double r, String c) {
//        this.radius = r;
//        this.color = c;
//    }
//
//    double getRadius() {
//        return radius;
//    }
//
//    double getArea() {
//        return pie * radius * radius;
//    }
//
//}
//
//class Cylinder extends circle {
//
//    double height;
//
//    Cylinder() {
//
//    }
//
//    Cylinder(double r) {
//        this.radius = r;
//
//    }
//
//    Cylinder(double r, double h) {
//        this.radius = r;
//        this.height = h;
//    }
//
//    double getHeight() {
//        return height;
//    }
//
//    double getVolume() {
//        return getArea() * height;
//    }
//
//
//}
//
//public class Java_2018_04_3 {
//    public static void main(String[] args) {
//        Cylinder cylinder = new Cylinder();
//        cylinder.radius = 5;
//        cylinder.height = 2;
//        System.out.println(cylinder.getVolume());
//    }
//}
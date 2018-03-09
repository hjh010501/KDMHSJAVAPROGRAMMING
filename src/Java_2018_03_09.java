public class Java_2018_03_09 {

    public static void main(String[] args) {

//        int[] a = new int[3];
//        a[0] += 1;
//        a[1] += 2;
//        a[2] += 3;
//        for(int i = 0; i < a.length; i++) {
//            System.out.println("a[" + i + "] = " + a[i]);
//        }
//
//        int[] b = new int[5]{10,20,30,40,50}; // 안되는 이유: 크기나 내용 둘중에 하나만 넣어야 함
//
//

        int a[];
        int[] b;
        int[] c = {31,32,33};
        a = new int[4];
        b = new int[]{21,22,23,24};
        c = b;
        System.out.println(a.length + " " + b.length + " " + c.length);
    }

}


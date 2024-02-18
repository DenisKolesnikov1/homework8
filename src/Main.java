import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("hm8");

        //Задача1
        int[] massiv1 = {-1,-2,-3};
        System.out.println(Arrays.toString(massiv1));

        double[] tiger = {1.57, 7.654, 9.986};
        for (int i = tiger.length - 1; i >= 0 ; i--) {
            System.out.print(tiger[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        String[] employeeNames = {"Ron", "Bob", "Alex"};

        int[] employeeAges = {17, 25, 31};

        double[] employeeSalarys = new double[3];
        employeeSalarys[0] = 1700.0;
        employeeSalarys[1] = 2500.0;
        employeeSalarys[2] = 3100.0;

        System.out.println(Arrays.toString(employeeSalarys));


        //Задача2
        int[] s = {1,2,3,4,5,3,4,5,6};
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            if (i != s.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        //Задача3
        int[] ints ={1,2,3,4,5,3,4,5,6};
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print( ints[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача4
        int[] ints1 ={1,2,3};
        for (int i = 0; i < ints1.length; i++) {
            if (ints1[i] % 2 != 0) {
                ints1[i] = ints1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(ints1));
    }
}

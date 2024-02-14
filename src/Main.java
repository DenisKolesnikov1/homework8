import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //1
        int[] massiv1 = {1, 2, 3};
        System.out.println(Arrays.toString(massiv1));

        int[] s = {-1, -2, -3, -4, -5, -6};
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            if (i != s.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        //2
        int[] massiv;
        massiv = new int[]{1, 2, 3};
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        System.out.println(Arrays.toString(massiv));

        double[] tiger = {1.57, 7.654, 9.986};
        for (int i = tiger.length - 1; i >= 0 ; i--) {
            System.out.print(tiger[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        //3
        int[] ints ={1, 2, 3, 4, 5, 6};
        for (int i = 0; i < ints.length; i++) {
            System.out.print( ints[i]);
            if (i != ints.length - 1 ) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //4
        int[] ints1 ={1, 2, 3, 4, 5, 6};
        for (int i = ints1.length -1; i >= 0; i--) {
            System.out.print(ints1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] dog = {1.57, 7.654, 9.986};
        for (int i = 0; i < dog.length; i++) {
            System.out.print(dog[i]);
            if (i != ints.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
//
    }
}

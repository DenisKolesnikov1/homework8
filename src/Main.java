import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //
        int[] massiv;
        massiv = new int[]{1, 2, 3};
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;

        System.out.println(Arrays.toString(massiv));

        double[] deimals = {1.57, 7.654, 9.986};

        String[] namesOfAnimals = {"TigerCub", "Calf", "Wolf"};
        int[] ageOfTheAnimals = {10, 20, 15};

        double[] weightOfTheBeast = new double[3];
        weightOfTheBeast[0] = 100.0;
        weightOfTheBeast[1] = 150.0;
        weightOfTheBeast[2] = 200.0;

        System.out.println(Arrays.toString(weightOfTheBeast));


        //
        int[] ints =new int[]{-1, -2, -3, -4, -5, -6};
        for (int i = 0; i < ints.length; i++) {
            System.out.print( ints[i]);
            if (i != ints.length - 1 ) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = ints.length-1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        //
        {
            System.out.println();
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] % 2 != 0) {
                    ints[i] = ints[i] + 1;
                }
            }
            System.out.println(Arrays.toString(ints));

        }
    }
}

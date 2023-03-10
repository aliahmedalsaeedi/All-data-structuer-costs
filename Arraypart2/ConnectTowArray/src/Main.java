import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] Array1 = {10 , 11 , 12};
        int[] Array2 = {13 , 14 , 15};
        int Before = Array1.length;
        int After = Array2.length;
        int[] result = new int[After + Before];

        System.arraycopy(Array1,0, result, 0, Before);
        System.arraycopy(Array2, 0, result, Before, After);

        System.out.println(Arrays.toString(result));
    }
}
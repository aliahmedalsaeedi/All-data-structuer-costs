import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] originalArray;    //الافتراضي
        int[] cloneArray;   // النسخة
        int size;   //ححجم المصفوفة

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of thr array :");

        size = in.nextInt();

        originalArray = new int[size];
        cloneArray = new int[size];

        System.out.println("Enter elements of the original :" + " ");
        for (int i = 0; i < size; i++) {
            originalArray[i]=in.nextInt();
        }

        in.close();
        for (int i = 0; i<originalArray.length ; i++) {
            cloneArray[i]=originalArray[i];
        }

        System.out.print("\nElement of the original array : \n");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i]+ " ");
        }

        System.out.print("\nElement of the clone array : \n");
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }

    }
}

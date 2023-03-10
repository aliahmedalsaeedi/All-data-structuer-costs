public class Main {
    public static void main(String[] args) {
        int intArray[] = {10 , 20 ,30 ,40};


        System.out.println("Contents of intArray[] before assignment:");
        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");


        int copyArray[] = new int[intArray.length];

        copyArray = intArray;

        copyArray[1]++;

        System.out.println("\n\nContents of intArray[]:");
        for (int i=0; i<intArray.length; i++)
            System.out.print(intArray[i] + " ");

        System.out.println("\n\nContents of copyArray[]:");
        for (int i=0; i<copyArray.length; i++)
            System.out.print(copyArray[i] + " ");
    }
}
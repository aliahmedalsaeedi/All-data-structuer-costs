public class Main {
    public static void main(String[] args)
    {
        int [] inArray={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Original Array : ");

        for (int i = 0; i < inArray.length; i++) {
            System.out.print(inArray[i]+" ");
        }

        System.out.println("\n");


        System.out.println("Original Array Printed in reveres order : ");
        for (int i = inArray.length-1; i >=0 ; i--) {
            System.out.print(inArray[i]+ " ");
        }
        System.out.println("\n");
        }

    }
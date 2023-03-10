import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StuClass[]copy=new StuClass[3];

        copy[0]=new StuClass(1,"Ali");
        copy[1]=new StuClass(2,"Ahmed");
        copy[2]=new StuClass(3,"AL_Saeedi");
        StuClass copy2[]=copy.clone();
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy2));
    }

}
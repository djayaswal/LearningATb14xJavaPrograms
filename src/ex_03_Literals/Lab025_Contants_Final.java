package ex_03_Literals;

public class Lab025_Contants_Final {
    public static void main(String[] args) {
        final int a =10;

        a = a*10;  // this is not a vaid - a final becomes constant and cannot be assigned another value
        System.out.println("Value of a is : "+a);
    }
}

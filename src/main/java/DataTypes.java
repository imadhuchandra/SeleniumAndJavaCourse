public class DataTypes {
    static char c='M'; //Instance/Class Variable - The Scope of "c" is within in this CLass - DataTypes
    public static void main(String arg[]){
        boolean b=true;
        System.out.println("Inside main Method boolean b is "+b);

        System.out.println("Inside main Method - "+c+" able to access Instance Variable");
        localVariable(); }

    public static void localVariable() {
        System.out.println("Inside localVariable Method - "+c +" able to access Instance Variable");

        int i =5;//Local Variable - The Scope of "i" is within in this localVariable method
        String a="Madhu";
        boolean b=false;
        System.out.println("Inside localVariable Method boolean b is "+b);
        long number=9490143414L; // at end of int we must to use "L"
        System.out.println("Inside localVariable Method long number is "+number);
        double decimal=3.14D; // at end of int we may use "D"
        System.out.println("Inside localVariable Method double decimal is "+decimal);
        System.out.println("Inside localVariable Method String a is "+a);
        System.out.println("Inside localVariable Method int i is "+i);
         }


}

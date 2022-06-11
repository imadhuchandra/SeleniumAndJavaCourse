public class constructorClass {

    public constructorClass(){
        System.out.println("Hi, I am inside constructor");

        System.out.println("Hi, I am secound Method");
    }

    int rollNumber;
    String name;

    public constructorClass(int i, String n){

        rollNumber = i;
        name =n;

    }

    public void display(){
        System.out.println("Roll Number is : " + rollNumber + " and Name is : " + name );
    }

    public static void main(String[] args) {
        constructorClass std = new constructorClass();

        constructorClass std1 = new constructorClass(10, "Madhu");
        constructorClass std2 = new constructorClass(20, "Chandra");

        std1.display();
        std2.display();

    }
}

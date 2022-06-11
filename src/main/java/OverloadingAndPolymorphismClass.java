public class OverloadingAndPolymorphismClass {
    public void addValues(int a, int b){ // same name with different parameters(signature)
        int c = a + b;
        System.out.println("Addition is : " + c);
    }

    public void addValues(int a, int b, int c){// same name with different parameters(signature)
        int d = a + b + c ;
        System.out.println("Addition is : " + d);
    }

    public double addValues(double a, double b){// same name & parameter size but different dataType
        double c = a + b;
        return c;
    }

    public static void main(String[] args) {
        OverloadingAndPolymorphismClass add = new OverloadingAndPolymorphismClass();
        add.addValues(11, 11);
        add.addValues(11, 11, 11);

        add.addValues(22, 22);

        double d = add.addValues(11.1, 22.2);
        System.out.println(d);

    }
}

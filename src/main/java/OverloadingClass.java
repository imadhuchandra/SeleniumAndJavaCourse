public class OverloadingClass {
    public void addValues(int a, int b){ // same name with different parameters(signature)
        int c = a + b;
        System.out.println("Addition is : " + c);
    }

    public void addValues(int a, int b, int c){// same name with different parameters(signature)
        int d = a + b + c ;
        System.out.println("Addition is : " + d);
    }

    public double addValues(double a, double b){// same name with different parameters(signature)
        double c = a + b;
        return c;
    }
}

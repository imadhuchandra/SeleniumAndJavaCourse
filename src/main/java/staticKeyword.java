public class staticKeyword {
    int i = 0;
    static int j = 0;

    public staticKeyword(){
        i++;
        j++;

        System.out.println("Value of i : " + i);
        System.out.println("Value of j : " + j);
    }



    public static void main(String args[]){

        staticKeyword s1 = new staticKeyword();
        staticKeyword s2 = new staticKeyword();
        staticKeyword s3 = new staticKeyword();

//      System.out.println(s1.i);
//		System.out.println(s2.i);
//		System.out.println(s3.i);
//
//        System.out.println(staticKeyword.j);



    }
}

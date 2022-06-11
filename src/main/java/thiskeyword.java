public class thiskeyword {
    int rollnumber;
    String name;
    String Standard;

    public thiskeyword(int rollnumber, String name, String Standard){
        this.rollnumber = rollnumber;
        this.name = name;
        this.Standard = Standard;
    }

    public void display(){
        System.out.println("Student Roll Number : " + rollnumber + " name is :" + name + " and in class :" + Standard);
    }

    public static void main(String[] args) {

        thiskeyword std = new thiskeyword(10, "Madhu", "2nd");

        thiskeyword std1 = new thiskeyword(20, "Chandra", "5th");

        std.display();
        std1.display();

    }
}

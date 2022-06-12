public class StringMethodClass {
    public static void main(String[] args) {
		System.out.println("**********************************************************************");
method1();
		System.out.println("**********************************************************************");
stringBuggermethod();
		System.out.println("**********************************************************************");
        String text = "Hi We are leaning from madhu.com";

		char ch = text.charAt(12);

		System.out.println(text.charAt(5));
		System.out.println(ch);

//		System.out.println(text.charAt(50)); // Throws java.lang.StringIndexOutOfBoundsException: Index 50 out of bounds for length 32

		String text2 = text.concat(" to sucess").concat(" and we learning Java");
		System.out.println(text2);

        System.out.println(text.contains("Key1"));

        System.out.println("Message ending with .com: " + text.endsWith("m") );
		System.out.println("**********************************************************************");
		method2();
		System.out.println("**********************************************************************");
		method3();
		System.out.println("**********************************************************************");
		method4();System.out.println("**********************************************************************");
    }

	private static void stringBuggermethod() {
		String name = "Madhu";
		name.concat(" Chandra");

		System.out.println(name);

		StringBuffer name1 = new StringBuffer("AABBAA");
		name1.append(" Chandra");

		name1.insert(4, "Chandra");

		name1.replace(1, 3, " chandra");

		name1.delete(1, 10);

		name1.reverse();
		System.out.println(name1);
	}

	private static void method1() {
		String name = "Madhu Chandra";
		String name1 = "Madhu Chandra";
		String name2 = "madhu chandra";

		String country = new String("India");
		String country1 = new String("India");

		System.out.println(name.equals(name1));
		System.out.println(name.equals(name2));

		System.out.println(name.equalsIgnoreCase(name2));

		System.out.println(country.equals(country1));

		System.out.println(name == name1);
		System.out.println(country ==  country1);

		String finalString = name + name1 + name2;
		System.out.println(finalString);

		String secString = name.concat(name1).concat(name2);
		System.out.println(secString);
	}

	private static void method4() {
		String text = "India is my Country";

		System.out.println(text.substring(5));
		System.out.println(text.substring(5, 9));

//		System.out.println(text.substring(5, 20)); // java.lang.StringIndexOutOfBoundsException: Range [5, 20) out of bounds for length 19

		char[] charArray = text.toCharArray();

		System.out.println("Main Strng is : " + text );

		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}

		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());

		String text1 = "My name is            ";
		String text2 = "               Madhu";

		System.out.println(text1+text2);
		System.out.println(text1.trim() + text2);
		System.out.println(text1.trim() + text2.trim());
	}

	private static void method3() {
		String text = "Hello Team";
		String sample = "His name is Madhu and he is a good man";

		String text1 = text.replace("e", "a");
		String sample2 = sample.replace("is", "was");

		System.out.println(text1);
		System.out.println(sample2);

		String[] sampletest = sample.split("John");

		System.out.println(sample);

		for (int i = 0; i < sampletest.length; i++) {
			System.out.println(sampletest[i]);
		}

		System.out.println(sample.startsWith("name"));
	}

	public static void method2(){
		String text1 = "TechTraining";

		String text2 = "TechTraining";

		String text3 = "techtraining";

		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));

		System.out.println(text1.equalsIgnoreCase(text3));

		System.out.println(text1.indexOf("h"));

		System.out.println(text1.lastIndexOf("i"));

		System.out.println(text1.length());
	}
}

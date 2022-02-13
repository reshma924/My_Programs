package Java_Programs;

public class string_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="World";
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(s2));
		String name="hello, what are you doing";
		System.out.println(name.contains("hello"));
		System.out.println(name.contains("doing"));
		System.out.println(name.contains("Iam fine"));
		String str="hello";
		String str1="hello";
		String str2="heluo";
		String str4="apple";
		System.out.println(str.compareTo(str1));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str4));
		String str5="hello world";
		String str7="All the well";
		System.out.println(str5.toUpperCase());
		System.out.println(str7.toLowerCase());
		String str8="Java is a oops concept";
		System.out.println(str8.replace("oops", "plateform independent"));
		String str9="Good morning";
		System.out.println(str9.replace("m", "n"));
	}

}

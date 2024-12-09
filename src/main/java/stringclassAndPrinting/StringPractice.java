package stringclassAndPrinting;

public class StringPractice {
	
	public static void main(String[] args) {
		
		String str = "Java";
		System.out.println(str);
		
		
		String str1= new String("Java");
		System.out.println(str1);
		
		
		char c[] = {'H', 'E', 'L', 'L', 'O'};
		//String str2=new String(c);
		String str2 =new String(c,2,3);
		System.out.println(str2);
		
		
		byte b[]= {65,66,67,68};
		//String str3=new String(b);
		String str3=new String(b,1,3);
		System.out.println(str3);
		
		String str4="Java";
		//String str5="Java";
		String str5=new String("Java");
		System.out.println(str4=str5);
		
		
	}

}

package operators;

public class IncrementDecrement {

	public static void main(String[] args) {

		int x = 5, y = 4, z;
		//z = 2 * x++ + 3 * ++y;
		z = 2 * x++ + 3 * ++x;//31
		
		System.out.println(z);//25
		System.out.println(x + " " + y);//6,5
		
		int a=3, b=4 ,c;
		
		//c= 2* a-- +3 * --b;//15
		c= 2* a-- +3 * --a;//9
		
		System.out.println(a+ " "+b);//2,3
		System.out.println(c);//15
	}
}

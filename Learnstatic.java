package week4.day2;

public class Learnstatic {
int a=10;//non static method
 static int b=6;//static means single refrence //static method
	
	
		public void print() { //nonstaic
			System.out.println("printmethod");
		}
public static void scan() { //static
	System.out.println("scanmethod");
}
public static void main(String[] args) {
	 Learnstatic learn=new  Learnstatic();//object name
	 System.out.println(learn.a);
	 System.out.println(b);
	 learn.print();
	 scan();
	}

}

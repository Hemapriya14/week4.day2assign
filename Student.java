package week4.day2;
//exist method of learnstatic
public class Student {

	public static void main(String[] args) {
		Learnstatic learn=new  Learnstatic();
		 System.out.println(learn.a);//CURRENT OBJECTNAME
		 System.out.println(Learnstatic.b);//PREVIOUS CLASS NAME
		 learn.print();
		 Learnstatic.scan();// 
	}

}

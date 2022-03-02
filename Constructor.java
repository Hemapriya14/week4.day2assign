package week4.day2;

public class Constructor {
	 String employname;
     String companyname;
     int employid;
    double employsalary;
    boolean isActive;
    Constructor(){
    	System.out.println("default constructor");
    }
 
    Constructor(String employname, String companyname,int employid,double employsalary){
    this();
    this.employname=employname;
    this.companyname=companyname;
    this.employid=employid;
    this.employsalary=employsalary;
    }
    
	public static void main(String[] args) {
		Constructor construct=new Constructor("Hema","capgemini",5133,100000);
		System.out.println("construct.employname");
		System.out.println("construct.companyname");
		System.out.println("construct.employid");
		System.out.println("construct.employsalary");
		
		//Constructor construct1=new Constructor();
		//System.out.println("construct1.employname");
		///System.out.println("construct1.companyname");
		//System.out.println("construc1t.employid");
		//System.out.println("construct1.employsalary");
		
	}

}

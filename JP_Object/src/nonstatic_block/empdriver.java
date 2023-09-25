package nonstatic_block;

 class emp {
	String eid;
	String name;
	double sal;
	String comp="QSP";
	static int count=100;
	{
		eid=comp+ ++count;
	}
	public void displaydetails()
	{
		System.out.println("Employee id "+eid);
		System.out.println("Employee name "+name);
		System.out.println("Employee sal "+sal);
		System.out.println("*************************");
	}
}
class empdriver{
	public static void main(String[] args) {
		emp e1=new emp();
		e1.name="Smith";
		e1.sal=25000;
		emp e2=new emp();
		e2.name="miller";
		e2.sal=21000;
		emp e3=new emp();
		emp e4=new emp();
		e1.displaydetails();
		e2.displaydetails();
		e3.displaydetails();
		e4.displaydetails();
	}
}

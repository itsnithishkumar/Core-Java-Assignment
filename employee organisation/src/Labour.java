
public class Labour extends Employee {
	int overtime_hrs=1;
	public double getSalary()
	{
		Labour l1=new Labour();
		return(l1.basic_pay+l1.hra-l1.tax+(l1.overtime_hrs)*1000);
	}

}

class Main{
	public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println(m.getSalary());
		Labour l=new Labour();
		System.out.println(l.getSalary());
	}
}

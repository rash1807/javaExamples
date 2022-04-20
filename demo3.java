package week2;
class A
{
	private int id;
	String name;
	void setId(int id) {
		this.id=id;
	}
	int getId()
	{
		return id;
	}
}
public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.setId(100);
		System.out.println(a.getId());
		}

}
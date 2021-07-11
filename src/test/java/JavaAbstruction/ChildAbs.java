package JavaAbstruction;

public class ChildAbs extends AbsClass{
	public static void main(String[] args) {
		ChildAbs obj1= new ChildAbs();
		obj1.Abs();
		obj1.nonAbs();
	}

	
	public void Abs() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method-Child");
	}
	
	public void nonAbs(){
		System.out.println("Non Abstract child");
	}
	
	
	

}

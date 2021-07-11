package JavaAbstruction;

public abstract class AbsClass {
	int a=10;
	final int b=4;
	static{
		 int v=34;
	}
	
	public void nonAbs(){
		System.out.println("Non Abstract Parent");
	}
	
	public abstract void Abs();

}

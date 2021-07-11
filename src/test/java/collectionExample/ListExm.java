package collectionExample;

import java.util.ArrayList;

public class ListExm {
	
	
	public static void main(String[] args) {
		ListExm obj=new ListExm();
		System.out.println(obj.arrayListExm());
		System.out.println(obj.arrayListExm().size());
		System.out.println(obj.arrayListExm().get(1));
		//System.out.println(obj.arrayListExm().retainAll());
		
		
	}
	
	public ArrayList arrayListExm(){
		
		ArrayList L = new ArrayList();
		L.add(null);
		L.add("String content");
		L.add(10);
		return L;	
	}
	
	
	
	
	
	
	
	

}




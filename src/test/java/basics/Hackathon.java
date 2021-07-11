package basics;

public class Hackathon {
	
	public static void main(String[] args) {		
			for(int i=1; i<=123; i++){
			System.out.println(Solve(i,"OXOOOXOXOXOXOXXXOOXOOOXOXOXOXOXXXOOXOOOXOXOXOX"));
			}
}
	
	public static char toggle(char T){
		if (T=='X'){
			T='O';
		}
		else{
			T='X';
		}
		return T;
	}
	
	
	public static String Solve(int K, String input){
	
		for (int i=0; i<K; i++){
			if(input.charAt(0)=='X'){
				input=toggle(input.charAt(0))+input.substring(1);
		} 
			else{
				input=toggle(input.charAt(0))+input.substring(1);
				for(int j=0;j<input.length()-1;j++){
					if(input.charAt(j)=='X'){
						input=input.substring(0, j+1)+toggle(input.charAt(j+1))+input.substring(j+2);
					}
				}
		
			}
		}
		
		
		 return input;
	}
	
	
}

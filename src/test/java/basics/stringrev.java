package basics;

public class stringrev {
public static void main(String[] args) {
	System.out.println("String is Pallindrome? :"+RevStr("fnjzxnxnjplfwzowfdrhrvhegkmoncbkembjoudteqchjwqfzlofyflkmxnooasxulwofjzknthqqxgshvwxdvhdnlzjzdjdiifg"));
}

public static boolean RevStr(String S){
	boolean result=false;
	char Actual[]=S.toCharArray();
	char rev[]=new char[S.length()];
	
	for(int i=0;i<S.length();i++){
		rev[i]=Actual[S.length()-1-i];
	}
	
	String A = new String(rev);
	
	if(S.equals(A)){
		result=true;
	} 
	
	return result;
}




}

package basics;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    //System.out.println("Please Enter the number: ");
	    //System.out.println("Entered number is Prime: "+checkPrime(sc.nextInt()));
	    //System.out.println(ReverseNum(1233243));
	    //System.out.println(stropr("Sushobhan Das"));
		
		fibo(10);
	}
	
	public static int[] fibo(int range){
		//int[] sr = null;
		int sr[] = new int[range];
		
		sr[0]=0;
		sr[1]=1;
		//System.out.println(sr.length);
		for(int i=2; i<range; i++){
			sr[i]=sr[i-1]+sr[i-2];
		}
		
		for(int j=0;j<sr.length;j++){
			System.out.print(sr[j]+" ");
		}
		
		
		return sr;
		
	}
	
	
	
	

	public static int ReverseNum(int num){
		int rev=0;
		while(num%10!=0){
			rev=rev*10+num%10;
			num=num/10;
		}
    return rev;
	}
	
	public static String stropr(String a){
		
		a=a.substring(0, 4)+a.substring(4, 5).toUpperCase()+a.substring(6);
		a=a.replace(" ", "_");
		System.out.println(a.split("_")[0]+"_"+a.split("_")[1]);
		return a;
	
	
	}
	
	
	
	
	
	
	
	public static boolean checkPrime(int a){
		boolean result = true;
		if(a==0 || a==1){
			result = false;			
		}else{
			
			for(int i=2;i<=a-1;i++){
				if(a%i==0){
					result=false;
					break;
				}
			}
	
		}
		return result;
		
	}
	
}

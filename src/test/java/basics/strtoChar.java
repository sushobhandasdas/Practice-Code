package basics;

public class strtoChar {
	public static void main(String[] args) {
		String A="Sushobhan";
		char[] result = A.toCharArray();
		char[] target = {'A','V','F','E','W','R','W','W','A'};
		for(int i=0; i<result.length;i++)
		{
			
			target[i]=result[i];
		}
		
		for(int j=0; j<target.length;j++)
		System.out.println(target[j]		
				);
		
		
	}
}

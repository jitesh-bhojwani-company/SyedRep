

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int[] a = {10,11,12,13,54,67,44,12,32};
		int i;
		int val = a[0];
		
		for(i = 0; i<a.length; i++)
		{
			if(a[i]<val)
			{
				val = a[i];
			}
		}
		
		System.out.println("Biggest value is " +val);
		
		
		/*String s = "ABCD";
		
		String reverse = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			reverse = reverse+s.charAt(i);
		}
		
		System.out.println(reverse);
		
		
		StringBuffer sb = new StringBuffer("NEHA");
		System.out.println(sb.reverse());
		
		
		String input = "EFGH";
		StringBuilder input1 = new StringBuilder();
		input1=input1.append(input);
		input1 = input1.reverse();
		
		for(int i=0; i<input1.length(); i++)
		{
			System.out.print(input1.charAt(i));
		}*/
		
//1		
//1 2
//1 2 3		
//1 2 3 4
//1 2 3 4 5
		
		
		for(int i = 5; i>=1; i--)
		{
			for(int j = i; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		

	}

}

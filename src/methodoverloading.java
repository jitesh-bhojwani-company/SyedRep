
public class methodoverloading extends overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodoverloading mol = new methodoverloading();
		overriding ovr = new overriding();
		
		System.out.println(mol.sum(5, 7));
		System.out.println(mol.sum(10, 5, 8));
		mol.print();
		
		
		
		

	}
	
	
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	
	
	

}

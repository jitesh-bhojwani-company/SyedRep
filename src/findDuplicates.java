import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicates {
	
	public static void main(String[] args)
	{
		
		ArrayList<String> list = new ArrayList<String>();
		
		//adding 0 to 9 in the list declared
		for(int i =0; i<=9; i++)
		{
			list.add(String.valueOf(i));
		}
		
		//adding 5 to 9 in the list declared
		for(int i =5; i<=9; i++)
		{
			list.add(String.valueOf(i));
		}
		
		System.out.println("List before filtering duplicates:" +list);
		System.out.println("list after filtering duplicates:" +processList(list));
		
		
		
	}

	public static Set<String> processList(List<String> listContainingDuplicates) {
		// TODO Auto-generated method stub
		final Set<String> result = new HashSet<String>();
		final Set<String> temp = new HashSet<String>();
		
		for(String myint : listContainingDuplicates)
		{
			if(!temp.add(myint))
			{
				result.add(myint);
			}
		}
		
		return result;
	}
}
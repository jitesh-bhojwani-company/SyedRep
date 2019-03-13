import java.util.Arrays;

public class SortTheListOfString {

	public static void main(String[] args) throws Exception {

		String[] InputList = {"Jan", "Feb" , "Saturday", "Monday", "Oct", "Week", "Year", "Day", "month", "date", "year"};
	
	//Display the unsorted list
		System.out.println("----------------Unsorted List---------------");
		showList(InputList);
		
		//call to sort the array list
		Arrays.sort(InputList);
		
		//printing the sorted list
		System.out.println("-----------------Sorted List------------------");
		showList(InputList);
		
		//call to sort the case sensitive list
		System.out.println("---------------Case Sensitive List----------------");
		Arrays.sort(InputList, String.CASE_INSENSITIVE_ORDER);
		
		//Display the final sorted list
		showList(InputList);
		
	
	
	}

	public static void showList(String[] array) {
		// TODO Auto-generated method stub
		
		for(String str : array)
		{
			System.out.print(str + " ");
		}
		
		System.out.println();
		System.out.println();
	}
	
}
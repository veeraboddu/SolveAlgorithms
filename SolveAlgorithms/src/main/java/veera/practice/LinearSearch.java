package veera.practice;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int linearArray[] ={11,99,8,22,33,44,66,77};
		int search =33;
		
		for(int i:linearArray) {
			if(search == i)
				System.out.println("Element present at the index position "+i);
			//
				//System.out.println("Element does not exist in the given array");
				
		}
	}

}

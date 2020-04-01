package veera.practice;

public class MaxArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,22,34,44,56,76,11,33,99,67,31};
		int temp =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}	
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println("\n Max array value: "+ a[a.length-1]);

	}

}

package veera.learning.hackerrank;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int a1[] = {3,1,5};
        int a2[] = {10,0,-1};
        // merging a1 and a2 
        
      //   mergeArray(a1);
     //    mergeArray(a2);
     
     int[]a3 = new int[a1.length+a2.length];
     int count = 0;
     
     for(int i = 0; i < a1.length; i++) { 
        a3[i] = a1[i];
        count++;
     } 
     for(int j = 0; j < a2.length;j++) { 
        a3[count++] = a2[j];
     } 
        
      //  int a3[] = {3,1,5,10,0,-1};
        // bubble sort technic to sort the given array
        int temp=0;
        for(int i=0;i<a3.length;i++){
            for(int j=0;j<a3.length-1;j++){
                if(a3[j]>a3[j+1]){
                    temp = a3[j];
                    a3[j]=a3[j+1];
                    a3[j+1]= temp;
                }
            }
        }
        
        for(int i=0; i<a3.length;i++){
            System.out.print( a3[i]+" ");
        }
        
        
    }
    
  /*  static int  mergeArray(int a[],int count){
       // int a3[];
        for(int i =0; i<a.length;i++){
            a[count++] = a[i];
        }
        
        return a;
    }*/
	}


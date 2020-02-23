package veera.learning.hackerrank;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = {{1,2,3},{1,2,3},{1,2,3}};
		int diag1=0,diag2=0;
		for(int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]);
				if( i == j)
					diag1 =diag1 + matrix[i][j];
				//if ((i == 2 && j ==0) ||(i == 0 && j ==2) || (i == 1 && j ==1))
					//diag2 =diag2 + matrix[i][j];
				if (i == (matrix.length) - j - 1) 
					diag2 =diag2 + matrix[i][j];
			}
			
			System.out.println();
		}
		
		System.out.println("sum Diag 1: sum Diag 2 :"+ diag1+ " "+ diag2);
		System.out.println(diag1 - diag2);
		
	}

}

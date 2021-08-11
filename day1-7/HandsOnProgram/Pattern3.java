package HandsOnProgram;

public class Pattern3 {
	
	public static void main(String arg[]) {
		
		int i,j,k=1;
		for( i=1; i<=3;i++)
		{
			for(j=1; j<i+1;j++)
			{
				System.out.print(k++ +"");
			}
			System.out.println();
		}
		
	}

}

package test;

public class Array {

	public static void main(String[] args) 
	{
		
		int a[];
		a=new int[3];
		a[0]=11;
		a[1]=22;
		a[2]=33;
		
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	
	
	System.out.println("array values using(loop)are:");
	for(int i=0; i<a.length;i++)
		System.out.println(a[i]+"\t");


	

	}

}

import java.util.Scanner;
class Main
{
	public static void main(String path[])
	{
		try
		{
			Scanner vc = new Scanner(System.in);
			System.out.println("Enter array size:");
			int n=vc.nextInt();
			System.out.println("Enter "+n+" elements:");
			int[] array = new int[n];
			for(int i=0;i<n;i++)
			{
				array[i]=vc.nextInt();
			}
			System.out.println("Enter array index to access element:");
			int index=vc.nextInt();
			System.out.println("Element at index "+index+" is "+array[index]);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Accessing unallocated memory");
		}
	}
}
public class commandline2
{
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			sum=sum+Integer.parseInt(args[i]);//integer class parsing to integer
		}
		System.out.println("Sum ="+sum);
	}
}
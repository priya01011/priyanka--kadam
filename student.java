import java.util.*;

public class student
{
	public static void main(String[] arg)
	{
		int s1,s2,s3,s4,s5,total;
		float per;
	
		Scanner n1= new Scanner(System.in);
		
		System.out.println("enter the subject marks OUT OF 100\n");
		s1= n1.nextInt();
		s2= n1.nextInt();
		s3= n1.nextInt();
		s4= n1.nextInt();
		s5= n1.nextInt();
		total= s1+s2+s3+s4+s5;
		per= (total*100)/500;
		System.out.println("percentege="+per);
		
		
		if(per>=80)
		{
			System.out.println("A grade");
		}
		
		else if(per<=79 && per>=60)
		{
			System.out.println("B grade");
		}
		
		else if(per<=59 && per>=35)
		{
			System.out.println("C grade");
		}
		
		else
		{
			System.out.println("fail");
		}
		
		
	}
}
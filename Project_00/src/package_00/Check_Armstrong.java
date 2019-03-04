package package_00;

public class Check_Armstrong 
{
	public static void main(String[] args) 
	{
		int num,ll=1,ul=1000000,temp1,temp2,n=0,result=0;
		num=ll;
		temp1=num;
		while(num<=ul)
		{
			temp2=num;
			while(temp1>0)
			{
				while(temp2>0)
				{
					temp2/=10;
					n++;
				}
				temp2=num;
				temp2=(temp2%10);
				while(n>0)
				{
					temp2*=1;
					n--;
				}
				result+=temp2;
				temp2/=10;
			}
			if(result==num)
				System.out.println(num+" is an Armstrong number");
			num++;
		}
	}
}

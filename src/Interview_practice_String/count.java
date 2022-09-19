package Interview_practice_String;

public class count {
	
	public static void main(String[] args) {
		
//		String s="abcdefghigkl";
//	   String []s1=s.split("");
//	   
//	   for(int i=6;i<s.length();i++)
//	   {
//		   System.out.print(s1[i]);
//	   }
		
		int a[]= {11,54,75,10,54,115,45,75,95};
		
		int max=0;
		int secmax=0;
		int thmax=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max && a[i]>secmax)
			{
				thmax=secmax;
				secmax=max;
				max=a[i];
			}
			else if(secmax<a[i] && thmax<a[i])
			{
				thmax=secmax;
				secmax=a[i];
			}
			else if(thmax<a[i])
			{
				thmax=a[i];
			}
				
		}
		System.out.println(max);
		System.out.println(secmax);
		System.out.println(thmax);
		
	}

}

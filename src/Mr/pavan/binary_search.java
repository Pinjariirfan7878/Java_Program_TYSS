package Mr.pavan;

public class binary_search {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,6,8,9,10,12,14,15,17,18,24,25,29,30,31};
		
		int search=24;
		int l_i=0;
		int m_i=a.length/2;
		int h_i=a.length-1;
		
		while(l_i<=h_i)
		{
			if(a[m_i]==search)
			{
				System.out.println("the element at "+m_i+" position");
				break;
			}
			else if(a[m_i]<search)
			{
				l_i=m_i+1;
			}
			else
			{
				h_i=m_i-1;
			}
			m_i=(l_i+h_i)/2;
		}
		
		
		
	}

}

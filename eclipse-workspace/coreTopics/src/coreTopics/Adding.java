package coreTopics;

public class Adding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adding a = new Adding();
		a.add(10,20);

	}

	private int  add(int i, int j) {
		// TODO Auto-generated method stub
  while(j!=0) {
			int carry = i&j;
			System.out.println(carry);
			i = i^j;
			System.out.println(i);
			j = carry << 1;
			//System.out.println(j);
			
			
			
			
		}	return i;
		
		
	}

}

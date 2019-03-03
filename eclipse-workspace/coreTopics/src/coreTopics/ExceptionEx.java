package coreTopics;

public class ExceptionEx  extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		
		
		try {
			int i =10/0;
		System.out.println(i);	
		}catch (Exception e) {
			// TODO: handle exception
System.out.println(e.getClass());
e.printStackTrace();
System.out.println(e.getMessage());
System.out.println(e.toString());

		
		
		}finally {
			System.out.println("job");
		}
		
	}

}

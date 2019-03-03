package coreTopics;

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InnerClassEx ic =new InnerClassEx(){
	public void taste()
	{
		System.out.println("hot");
	}
};
ic.taste();

InnerClassEx ic1 = new InnerClassEx();
ic1.taste();
	}

}

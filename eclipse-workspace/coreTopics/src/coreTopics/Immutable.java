 package coreTopics;

public final class Immutable {
private int i;
public Immutable(int i) {
	// TODO Auto-generated constructor stub
	this.i=i;
}Immutable modify( int i )
{
	if(i==this.i)
		return this ;
	return (new Immutable(i));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immutable i= new Immutable(10);
		Immutable i1= new Immutable(100);
		Immutable i2= new Immutable(10);
		System.out.println(i==i2);

	}

}

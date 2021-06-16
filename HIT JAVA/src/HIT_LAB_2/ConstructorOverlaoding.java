package HIT_LAB_2;

class CS{
	int p,q;
	public CS() {
		}
	
	public CS(int x, int y) {
		p=x;
		q=y;
		
	}

public int add(int i, int j)
{
	return (i+j);
	
}
public int add(int i,int j,int k) {
	return(i+j+k);
}
public float add(float f1, float f2) {
	return (f1+f2);
}
class ConstructorOverlaoding {
	public static void main(String[] args) {
		int x=2, y=3,z=4;
		CS c1=new CS();
		CS c2 = new CS(x,z);	
		c2.printData();
		float m=8.2f,n=5.2f;
		int add= c1.add(x,y);
		int Add2= c1.add(x,y,z);
		float fl=c1.add(m,n);
		System.out.println("add: "+ add);
		System.out.println("Add2: "+Add2);
		System.out.println("fl: "+fl);
	
	}

}
public void printData() {
	System.out.println("p = "+p);
	System.out.println("q = "+q);
	
}
}



public class forwhiledowhile21 {

	public static void main(String[] args) {
		for(int a=1,b=1;a<10||b<10;a++,b++)
		{
			b++;
			System.out.println("a="+a+" and b="+b);
		}
		int a=1,b=1;
		while(a<10||b<10)
		{
			System.out.println("a="+a+" and b="+b);
		}
		do
		{
		a++;
		b++;
		System.out.println("a="+a+" and b="+b);
		}
		while(a<10||b<10);
		
		// TODO Auto-generated method stub

	}

}

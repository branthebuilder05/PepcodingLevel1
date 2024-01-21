
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//int a=4623517;
		int a= 21453;
		int place=1,res=0;
		while(a>0){
		    int temp=a%10;
		    res+= (place* Math.pow(10,temp-1));
		    a/=10;
		    place++;
		    System.out.println(res);
		}
		
	}
}

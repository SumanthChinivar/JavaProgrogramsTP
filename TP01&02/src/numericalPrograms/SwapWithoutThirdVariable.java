package numericalPrograms;

public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Before Swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println("==============");
		System.out.println("After swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}

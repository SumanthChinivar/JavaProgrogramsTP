package conditionalOP;
/*
 * a=10
 * b=5
 * op:5,10
 * 
 * a=5
 * b=10
 * op:5,10
 * 
 * a+","+b
 * b+","+a
 * 
 */
public class P1 {
public static void main(String[] args) {
	int a=5;
	int b=10;
	String res=a<b?(a+","+b):(b+","+a);
	System.out.println(res);
}
}

package testing;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string k = new string();
       k.method("hi");
       k.method1(2);
       k.method2(true);
       k.method3(.12346);
       k.method3(0.2);
       k.method("hell");
       k.method1(12);
       k.method2(false);
       k.method3(.123456);
       k.method3(0.2);
	}
	private Object system;
	public void method (String x) {
		System.out.println(x);
	}
	public void method1 (int x) {
		System.out.println(x);
	}
	public void method2 (boolean x) {
		System .out.println(x);
	}
	public void method3 (double d) {
		System.out.println(d);
	}
	public void method4 (float x) {
		System.out.println(x);
	}

}

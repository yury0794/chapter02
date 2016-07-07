package chapter02;

public class Sqwp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a + "," + b);
		swap(a, b);
		System.out.println(a + "," + b);
		
		System.out.println("------");
		
		Value v1 = new Value();
		v1.setVal(10);
		
		Value v2 = new Value();
		v2.setVal(20);
		
		System.out.println(v1.getVal() + "," + v2.getVal());
		swap(v1, v2);
		System.out.println(v1.getVal() + "," + v2.getVal());
	}

	public static int add(int i, int j) {
		int result = i + j;
		return result;
	}
	
	public static void swap(int i, int j){
		int temp = i;
		i = j;
		j = temp;
		System.out.println(i + "," +j);
	}
	
	public static void swap(Value val1, Value val2){
		int temp1 = val1.getVal();
		int temp2 = val2.getVal();
		val1.setVal(temp2);
		val2.setVal(temp1);
	}
}
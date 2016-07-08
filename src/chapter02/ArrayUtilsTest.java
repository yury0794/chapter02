package chapter02;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		int[] arrayInt = {10, 20, 30, 40, 50};
		
		// 1. ArrayUtils.intToDouble(...) 테스트
		double[] arrayDouble = ArrayUtils.intToDouble(arrayInt);
		for(double d : arrayDouble){
			System.out.print(d+" ");
		}
		
		System.out.println();
		
		// 2. ArrayUtils.doubleToInt(...) 테스트
		arrayInt = ArrayUtils.doubleToInt(arrayDouble);
		for(int i : arrayInt){
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// 3. ArrayUtils.concat(...) 테스트
		int[] arrayInt1 = {10, 20, 30};
		int[] arrayInt2 = {40, 50, 60};
		
		int length = arrayInt1.length + arrayInt2.length;
		int[] arrayInt3 = ArrayUtils.concat(arrayInt1, arrayInt2);
		for(int i : arrayInt3){
			System.out.print(i+" ");
		}
		
		
	}
}
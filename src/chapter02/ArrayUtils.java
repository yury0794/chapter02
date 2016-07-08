package chapter02;

public class ArrayUtils {
	public static double[] intToDouble(int[] arrayInt){
		if(arrayInt == null){
			return null;
		}
		
		int length = arrayInt.length;
		double[] arrayDouble = new double[length];
		for(int i=0;i<length;i++){
			arrayDouble[i] = arrayInt[i];
		}
		return arrayDouble;
	}
	
	public static int[] doubleToInt(double[] arrayDouble){
		if(arrayDouble == null){
			return null;
		}
		
		int length = arrayDouble.length;
		int[] arrayInt = new int[length];
		for(int i=0;i<length;i++){
			arrayInt[i] = (int) arrayDouble[i];
		}
		return arrayInt;
	}
	
	public static int[] concat(int[] arrayInt1, int[] arrayInt2){
		if(arrayInt1 == null || arrayInt2 == null){
			return null;
		}
		
		int[] arrayInt3 = new int[arrayInt1.length + arrayInt2.length];
		int index = 0;
		for(int i=0;i<arrayInt1.length;i++){
			arrayInt3[index] = arrayInt1[i];
			index++;
		}
		
		for(int i=0;i<arrayInt2.length;i++){
			arrayInt3[index] = arrayInt2[i];
			index++;
		}
		
		return arrayInt3;
	}
}
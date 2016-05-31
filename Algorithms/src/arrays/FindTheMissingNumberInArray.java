package arrays;

public class FindTheMissingNumberInArray {
	
	public int returnMisingNumber(int [] theArray, int n) {
		
		
		// XOR all the array elements
		int x1 = theArray[0];
		for(int i=1;i<n;++i) {
			x1 = x1 ^ theArray[i];
		}
		
		//XOR all numbers from 1 to n+1
		int x2 = 1;
		for ( int i=2; i <=n+1; ++i) {
			x2 = x2 ^ i;
		}
		
		return (x1 ^ x2);
		
		
	}
	
	public static void main(String [] args) {
		
		int [] inputArray = {1,2,3,5};
		
		FindTheMissingNumberInArray testObj = new FindTheMissingNumberInArray();
		
		System.out.println(testObj.returnMisingNumber(inputArray, inputArray.length));
		
		
	}

}

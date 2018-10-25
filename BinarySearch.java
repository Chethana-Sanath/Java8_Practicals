//Watch video at https://www.youtube.com/watch?v=j5uXyPJ0Pew and write this code
//Time complexity would be O(logn) - this is very much efficient than O(n) which is the case for linear search.
//Note that for binary search precondition is to have array sorted, either is ascending  order.

public class BinarySearch {

	public static int binarySearch(int findElement) {
		//int[] A = {61,43,24,9,2};
		int[] A = {2,9,24,43,61};
		int start, end, mid;
		
		start = 0;
		end = A.length-1;			
		while(start<=end) {
			mid = (start+end)/2;
			if(findElement == A[mid]) {
				return mid;
			}
			else if(findElement > A[mid]) {
				start = mid+1;
				
			}
			else {
				
				end=mid-1;
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = binarySearch(61);
		if(x!=-1)
			System.out.println("The given element is found at location "+x+" in the array");
		else
			System.out.println("The given element is not found in the array");
	}

}

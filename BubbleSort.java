
//Bubblesort algorithm is not an efficient way of sorting.
//Time complexity is O(n square) times - suitable for smaller length arrays only
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,1,4,6};
		arr = bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	
	public static int[] bubbleSort(int[] arr) {
		int i,j,temp=0;
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

}

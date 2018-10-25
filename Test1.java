import java.util.HashSet;
import java.util.Set;


public class Test1 {
	
	static String name = "Chethana";
	
	  // Complete the alternatingCharacters function below.
    static void findDuplicateChars(String s) {
        char[] charArr = s.toCharArray();
        String s1;
        for(int i=0;i<charArr.length;i++) {
        	for(int j=i+1;j<charArr.length;j++) {
        		
        	}
         
        }
        
    }
    
    static void findAvergeOfStudents() {
    	String scores[][] = {
    			{"Bobby"},
    			{"charles"},
    			{"Eric","chethana"},
    			{"charles"}};
    	for(int i=0;i<scores.length;i++){
    		for(int j=0;j<scores[i].length;j++) {
    			System.out.println(scores[i][j]);
    		}
    	}
    }
    
    static void iterateThrough2DArray() {
    	int Scores[][] = {{1,2,3},
    						{4,5},
    						{7}	};
    	for(int row=0;row<Scores.length;row++) {
    		for(int col=0;col<Scores[row].length;col++) {
    			System.out.println(Scores[row][col]);
    		}
    	}
    }
    
    static void leftRotate(int n,int shift) {
    	int arr[] = {1,2,3,4,5};
    	for(int i=0;i<shift;i++) {
    		arr = rotateArray(arr, n);
    	}
//    	int ar1[] = rotateArray(arr,n);
//    	int ar2[] = rotateArray(ar1,n);    
    	
    	System.out.println(arr[0]);
    	System.out.println(arr[1]);
    	System.out.println(arr[2]);
    	System.out.println(arr[3]);
    	System.out.println(arr[4]);
    }
    
    public static void findNumOfSwaps() {
    	//int ar1[] = {2,1,5,3,4};
    	int ar1[] = {1,2,5,3,7,8,6,4};
    	int temp=0;
    	int count = 0;
    	
    	count = sortAscending(ar1);
    	//boolean trueAscending = truelyAscending(ar1);
//    	while(!trueAscending)
//    		sortAscending(ar1);
//    	
    	//return ar1;
    	//System.out.println(count);
        if(ar1[0]>ar1[1])
            System.out.println("Too chaotic");
    	//System.out.println(count);
    	System.out.println(ar1[0]);
    	System.out.println(ar1[1]);
    	System.out.println(ar1[2]);
    	System.out.println(ar1[3]);
    	System.out.println(ar1[4]);
    	System.out.println(ar1[5]);
    	System.out.println(ar1[6]);
    	System.out.println(ar1[7]);
    }
    
    static boolean truelyAscending(int[] ar1) {
    	boolean trueAscending = true;
    	int temp=0;
    	for(int i=0;i<ar1.length;i++) {
    		if(ar1[i]>ar1[i+1]) {
    			temp=ar1[i];
    			ar1[i]=ar1[i+1];
    			ar1[i+1]=temp;
    			trueAscending =false;
    		}
    		else {
    			
    		}
    	}
    	return trueAscending;
    }
    
    static int sortAscending(int[] ar1) {
    
    	int temp=0;
    	int count=0;
    	boolean trueAscending = true;
    	for(int j=0;j<ar1.length-1;j++) {
	    	for(int i=0;i<ar1.length-1;i++) {
	    		if(ar1[i]>ar1[i+1]) {
	    			trueAscending = false;
	    			temp=ar1[i];
	    			ar1[i]=ar1[i+1];
	    			ar1[i+1]=temp;
	    			count++;	    			
	    		}
	    
	    	}
    	}
    	return count;
    }
    
    public static int[] rotateArray(int arr[],int n) {
    	//int arr[]=new int[n]; 
    	int temp =arr[0];
    	for(int i=0;i<n-1;i++) {
    		arr[i] = arr[i+1];
    		
    	}
    	arr[n-1]=temp;
    	return arr;
    }
    
    public void String checkForCommonChars() {
    	
    	
    	
    	//Put s1 chars in a set.length of Set=length of s1(without dups)
    	//Put s2 chars in a set. length of set = length of s1+length of s2(if it is less it means chars are 
    	//common
//    	Set<Character> set1 = new HashSet<Character>();
//    	char[] charArray1 = s1.toCharArray();
//    	for(int i=0;i<charArray1.length;i++) {
//    		set1.add(charArray1[i]);
//    	}
//    	int initialLength = set1.size();
//    	//Set<Character> set2 = new HashSet<Character>();
//    	char[] charArray2 = s2.toCharArray();
//    	for(int i=0;i<charArray2.length;i++) {
//    		set1.add(charArray2[i]);
//    	}
//    	if(set1.size()==initialLength+s2.length()) {
//    		return "NO";
//    	}
//    	else {
//    		return "YES";
//    	}
    }
    
    public static void main(String argu[]) {

    	String returnVal = checkForCommonChars();
//    	System.out.println(returnVal);
    	//findAvergeOfStudents();
    	//iterateThrough2DArray();
    	//leftRotate(5,2);
    	//findNumOfSwaps();
    	  /*String str = "w3schools";
    	  int cnt = 0;
    	  char[] inp = str.toCharArray();
    	  System.out.println("Duplicate Characters are:");
    	  for (int i = 0; i < str.length(); i++) {
    	   for (int j = i + 1; j < str.length(); j++) {tr
    	    if (inp[i] == inp[j]) {
    	     System.out.println(inp[j]);
    	     cnt++;
    	     break;
    	    }
    	   }
    	  }*/
    	 }
}

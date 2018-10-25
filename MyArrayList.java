
/**
 * Below class is an arraylist that supports, adding elements
 * to the array, remove a specified element and fetching elements 
 * at given index
 */
public class MyArrayList {

	private static final int SIZEFACTOR=5;
	
	private Object data[];
	
	private int index;
	
	private int size;
	
	public MyArrayList(){
		this.data=new Object[SIZEFACTOR];
		this.size=SIZEFACTOR;
	}
	
	/**
	 * Below method adds elements to MyArrayList
	 * 
	 */
	public void add(Object obj){
		System.out.println("index is: "+this.index+" data size is: "+this.data.length);
		if(this.index==this.size-1){
			//we need to increase the size of data[]
			increaseSizeAndReallocate();
		}
		data[this.index]=obj;
		this.index++;
		
	}
	
	/**
	 * Below method increases and reallocates the size of MyArrayList
	 * 
	 */
	private void increaseSizeAndReallocate() {
		this.size=this.size+SIZEFACTOR;
		Object newData[]=new Object[this.size];
		for(int i=0; i<data.length;i++){
			newData[i]=data[i];
		}
		
		this.data=newData;
		System.out.println("***index is: "+this.index+" data size is: "+this.data.length);
	}
	
	/**
	 * Below method returns element in MyArrayList, at the specified index
	 * 
	 */
	public Object get(int i) throws Error {
		if(i>this.index-1){
			throw new Error("ArrayIndexOutOfBound");
		}
		if(i<0){
			throw new Error("Negative Value");
		}
		return this.data[i];
		
	}
	
	/**
	 * Below method removes element at the specified index, from MyArrayList
	 * 
	 */
	public void remove(int i) throws Exception{
		if(i>this.index-1){
			throw new Exception("ArrayIndexOutOfBound");
		}
		if(i<0){
			throw new Exception("Negative Value");
		}
		System.out.println("Object getting removed:"+this.data[i]);
		for(int x=i; x<this.data.length-1;x++){
			data[x]=data[x+1];
		}
		this.index--;
	}

}

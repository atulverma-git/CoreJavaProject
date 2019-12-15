package sorting;

public class SelectionSort {

// in Selection Sort, left most element get sorted at every iteration
	public static void main(String[] args) {
		
SelectionSortArray array = new SelectionSortArray(6);
		
		array.insertElement(8);
		array.insertElement(3);
		array.insertElement(2);
		array.insertElement(4);
		array.insertElement(7);
		array.insertElement(1);
		
		System.out.println("before Sorting:");
		array.display();
		
		array.selectionSort();
		
		System.out.println("after sorting");
		array.display();
		/*int arr[] = {9,2,6,4,8,3,10,0};
		int ln = arr.length;
		// selection sort...
		for(int i=0; i<ln;i++){
			int iMin = i;			// starting index of iMin to i
			//System.out.println("starting Min Index: "+iMin+" and value: "+arr[iMin]);
			for(int j=i+1;j<ln;j++){
				if(arr[j]<arr[iMin]){
					iMin=j;			// new min index
					//System.out.println("new Min Index: "+iMin+" and value: "+arr[iMin]);
				}
			}
			int temp = arr[i];
			arr[i]=arr[iMin];
			arr[iMin]=temp;
		}
		
		for(int i:arr){
			System.out.print(i+", ");
		}*/
	}

}

class SelectionSortArray{
	private int[] arr;
	private int index=0;
	private int ln = 0;
	
	public SelectionSortArray(int size) {
		ln=size;
		arr = new int[size];
	}
	
	public void insertElement(int i){
		arr[index++]=i;
	}
	
	public void selectionSort(){
		for(int outer=0; outer<ln-1; outer++){
			int min=outer;
			for(int inner=outer+1; inner<ln;inner++){
				if(arr[min]>arr[inner]){
					min=inner;
				}
			}
			swap(min,outer);
		}
		
	}

	private void swap(int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1]=arr[pos2];
		arr[pos2]=temp;
	}
	
	public void display(){
		for(int i:arr){
			System.out.println(i);
		}
	}
	
}

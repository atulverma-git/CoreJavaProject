package sorting;

public class BubbleSort {

// in bubble sort, right most elements get sorted at every iteration.
	public static void main(String[] args) {
		/*int arr[]={4,3,10,1,9,2,5};
		int ln = arr.length;
		for(int i=ln-1;i>0;i--){
			boolean flag = true;
			for(int k=0;k<i;k++){
				System.out.println("arr[k]="+arr[k]);
				System.out.println("arr[k+1]="+arr[k+1]);
				if(arr[k]>arr[k+1]){
					int temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
					flag = false;
				}
			}
			if(flag){
				break;
			}
		}
		System.out.println("bubble sort: .........");
		for(int val:arr){
			System.out.print(val+", ");
		}*/
		
		BubbleSortArray array = new BubbleSortArray(6);
		
		array.insertElement(8);
		array.insertElement(3);
		array.insertElement(2);
		array.insertElement(4);
		array.insertElement(7);
		array.insertElement(1);
		
		System.out.println("before Sorting:");
		array.display();
		
		array.bubbleSort();
		
		System.out.println("after sorting");
		array.display();
	}

}

class BubbleSortArray{
	private int[] arr;
	private int index=0;
	
	public BubbleSortArray(int size) {
		arr = new int[size];
	}
	
	public void insertElement(int i){
		arr[index++]=i;
	}
	
	public void bubbleSort(){
		for(int outer=index-1; outer>0; outer--){
			for(int inner=0;inner<outer;inner++){
				if(arr[inner]>arr[inner+1]){
					swap(inner,inner+1);
				}
			}
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

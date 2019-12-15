package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]={4,3,10,9,2,5,100,99,4,1};
		
		int len = arr.length;
		
		for(int i=1;i<=len-1;i++){
			int val = arr[i];
			int emptyIndex = i;
			while(emptyIndex>0 && arr[emptyIndex-1]>val){
				arr[emptyIndex]=arr[emptyIndex-1];
				emptyIndex--;
				System.out.println("valIn inside while: "+emptyIndex);
			}
			arr[emptyIndex]=val;
			System.out.println("valIn: "+emptyIndex+" val: "+arr[emptyIndex]);
			
		}
		
		System.out.println("Insertion Sort.........");
		for(int val:arr){
			System.out.print(val+", ");
		}

	}

}

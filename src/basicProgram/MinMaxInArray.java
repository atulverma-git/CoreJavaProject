package basicProgram;

public class MinMaxInArray {

	public static void main(String[] args) {
		int arr[]={4,3,10,9,2,5,100,99,4,1};
		int min=arr[0];
		int minIndex=0;
		int max=arr[0];
		int maxIndex=0;
		int ln = arr.length;
			for(int i=0;i<=ln-1;i++){
				if(arr[i]<min){
					min=arr[i];
					minIndex=i;
				}else if(arr[i]>max){
					max=arr[i];
					maxIndex=i;
				}
			}
			
			System.out.println("min: "+min+" at index: "+minIndex);
			System.out.println("max: "+max+" at index: "+maxIndex);
	}

}

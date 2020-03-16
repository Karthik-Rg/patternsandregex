
public class BubbleSortProb1 {

	static int bubbleSort(int arr[], int count) {
		int n = arr.length;
		int temp;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
		}
		return count;
	}
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
        
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {56, 784, 8561, 5676, 49};
		int count=0;
		count=bubbleSort(arr, count);
		printArray(arr);
		System.out.println(count);
	}

}

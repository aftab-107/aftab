import java.util.Scanner;
public class Array{
	static void sweapArray(int []arr,int n){
		int temp = 0 ;
		int j = n-1;
		for(int i = 0 ; i < j ; i++){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
	}
	
static void ArrayPrinter(int []arr,int n){
	for(int i = 0 ; i < n ; i++){
		System.out.print(arr[i]+" ");
	}
} 

public static void main(String[] args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter size of array : ");
int n = sc.nextInt();
int [] arr = new int[n];
System.out.println("Enter element of array : );
for(int i = 0 ; i < n ; i++){
arr[i] = sc.nextInt();
}
System.out.print(arr[i] +" ");
sweapArray(arr,n);
ArrayPrinter(arr,n);
}
}
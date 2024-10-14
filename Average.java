import java.util.*;

class Average{
	public static double avgArray(int[] array){
   	 int sum=0;
	 double avg=0;
	 for(int i=0;i<array.length;i++){
   	  sum+=array[i];
	 }

	 avg=(double)(sum/array.length);
 	 return avg;
	}

	public static void main(String[] args){
	 int[] array={1,2,3,4,5,6};
	 for(int i=0;i<array.length;i++){
	  if(array[i]%2==0){
	   System.out.println(array[i]+" ");
 	  }
	 }

	 System.out.println(avgArray(array));
	}
}
package array;

public class SortArray {
//	 public static void main (String [] args) {
//		   int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
//		   int temp;
//		   for (int i = 1; i < array.length; i++) {
//		    for (int j = i; j > 0; j--) {
//		     if (array[j] < array [j - 1]) {
//		      temp = array[j];
//		      array[j] = array[j - 1];
//		      array[j - 1] = temp;
//		     }
//		    }
//		   }
//		   for (int i = 0; i < array.length; i++) {
//		     System.out.println(array[i]);
//		   }
//		  }
	//withaut using sort.array
	public static void main(String[] args) 
	{     // Insertion Sort....
	      int[] arr2 = new int[] { 5, 4, 3, 8, 32, 768, 564, 95, 172, 1500, 859, 754 };
	      int number = arr2.length;
	      for(int a = 1; a < number; a++)
	      {
	         int keyValue = arr2[a];
	         int b = a - 1;
	         while(b >= 0 && arr2[b] > keyValue)
	         {
	            arr2[b + 1] = arr2[b];
	            b = b - 1;
	         }
	         arr2[b + 1] = keyValue;
	      }
	         //printing inserion sort............................
	         for (int i = 0; i < arr2.length; i++) 
	         {     
	           System.out.println(arr2[i]);  
	         }
	}
}

package Day3;

public class largestelementarr {  
    public static void main(String[] args) {  
  
         
        int [] arr = new int [] {55, 10, 27, 70, 42, 49, 7, 1};  
         
        int max = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
             
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in the given array: " + max);  
    }  
}  
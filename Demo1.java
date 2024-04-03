import java.util.ArrayList;
import java.util.Arrays;

package demo1;

/**
 *
 * @author lamvuhoang
 */
public class Demo1 {
    
    public static void main(String[] args) {
        int[] arr1= {1,3,4,5,6,7};
        int[] arr2 = {2,3,5,7};
        
        ArrayList<Integer> intersection = new ArrayList<>();
        
        for(int i= 0; i<arr1.length;i++){
            if (binarySearch(arr2, arr1[i])){
                intersection.add(arr1[i]);
            }
        }
        System.out.println( Arrays.toString(intersection.toArray()));
    }
    public static boolean binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left) /2;
            if (arr[mid] == target){
                return true;
            }else if (arr[mid]<target){
                left = mid+1;
            }else{
                right = mid -1;
            }
        }
        return false;
    }  
}

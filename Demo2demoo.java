package demo2demoo;

/**
 *
 * @author lamvuhoang
 */ 
public class Demo2demoo {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        int l = firstPos(nums, target);
        int r = lastPos(nums, target);
        
        if (l <= r) {
            result[0] = l;
            result[1] = r;
        }
        return result;
    }
    
    public static int firstPos(int[] nums, int target) {
        int res = -1; 
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l+r) / 2;
            if (nums[m] == target) {
                res = m;
                r = m - 1;
            } else if (nums[m] < target){
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return res;
    }
    
    public static int lastPos(int[] nums, int target) {
        int res = -1;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l+r) / 2;
            if (nums[m] == target) {
                res = m;
                l = m + 1;
            } else if (nums[m] < target){
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,8};
        int target = 3;
        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}

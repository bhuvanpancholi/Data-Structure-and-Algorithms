public class SortedArrayBinarySearchWithRecursiveFunction  {

    // BIG O NOTATION IS O(log n)
    public static int binarySearch(int[] nums, int target, int left, int right) {

        int steps = 0;
                // Recursive function:
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Steps take by Binary: " + steps);
                return mid;

            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid+1, right);
            } else {
                return binarySearch(nums, target, left, mid-1);
            }
            
        }
 



        // int left = 0;
        // int right = nums.length - 1;

        // while (left <= right) {
        //     steps++;
        //     int mid = (left + right) / 2;

        //     if (nums[mid] == target) {
        //         System.out.println("Steps take by Binary: " + steps);
        //         return mid;
        //     } else if (nums[mid] < target) {
        //         left = mid + 1;
        //     } else {
        //         right = mid -1 ;
        //     }
            
        // }
        System.out.println("Steps take by Binary: " + steps);
        return -1;
        
    }

    public static void main(String[] args) {
        int nums[] = {5, 7, 9, 11, 13};
        int target = 13;


        int result = binarySearch(nums, target, 0 , nums.length-1);

        // int result = binarySearch(nums, target);

        if (result !=-1){
            System.out.println("Element Found @ Index " + result);
        } else {
            System.out.println("Element not Found");
        }


    }

}


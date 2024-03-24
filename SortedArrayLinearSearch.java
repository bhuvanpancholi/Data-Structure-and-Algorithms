public class SortedArrayLinearSearch {

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;


        for (int i=0 ; i<nums.length;i++ ){
            steps++;
            if(nums[i] == target){
                System.out.println("Steps take by Linear: " + steps);
                return i;
            }
        }

        return -1;
        
    }

    // public void binarySearch(String[] args) {
        
    // }

    // // here the time complexity is O(n) and n=1, O(1) as the CPU knows the memory address, 
    // // and how to locate to that memory directly
    // public void read(String[] args) {
        
    // }


    public static void main(String[] args) {
        int nums[] = {5, 7, 9, 11, 13};
        int target = 13;

        int result = linearSearch(nums, target);

        if (result !=-1){
            System.out.println("Element Found @ Index " + result);
        } else {
            System.out.println("Element not Found");
        }


    }

}


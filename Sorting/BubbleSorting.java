public class BubbleSorting {

    public static void main(String[] args) {
        int nums[] = {2, 8, 6 , 4, 12, 10};
        int size = nums.length;
        int temp = 0;

        // code for before Sorting
        System.out.println("before Sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }

        for(int i=0 ; i<size ; i++){
            for(int j=0 ; j<size-i-1 ; j++){
                // switch the > or < signs for ascending or descending orders
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums [j+1];
                    nums[j+1] = temp;
                    
                }
            }
        }

        System.out.println("");
        // code for after Sorting
        System.out.println("after Sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }

    }
}

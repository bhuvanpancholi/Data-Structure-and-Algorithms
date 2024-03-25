public class SelectionSorting {

    public static void main(String[] args) {
        int nums[] = {2 , 7, 8, 6, 4, 12, 10};
        int size = nums.length;
        int temp = 0;
        int minIndex = 0;

                // code for before Sorting
                System.out.println("before Sorting");
                for(int num : nums){
                    System.out.print(num + " ");
                }

                // logic of Selection Sorting (Iteration and Swapping in OuterLoop)

                for(int i=0 ; i<size-1 ; i++){

                    minIndex = i;

                    for (int j = i+1 ; j<size ; j++){

                        if( nums[minIndex] > nums[j] ){
                            minIndex = j;
                        }
                    }

                    temp = nums[minIndex];
                    nums[minIndex] = nums[i];
                    nums[i] = temp;
                }

                System.out.println("");
                // code for after Sorting
                System.out.println("after Sorting");
                for(int num : nums){
                    System.out.print(num + " ");
                }

    }


}

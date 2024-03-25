SORTING

Types of Sorting :

            1. Bubble Sorting -->
                "Not Efficient, but easy to understand
                Step 1 : take an element in the array,
                consider it as bubble and shift it to the end"

                Step 2: Task is "ASCENDING SORTING" --> compare two values at a time.
                "Sort & SWAP"

                Step 3: Say the pointer at 2 values @ index 0 and 1, compare the two values (if first value is greater than 2nd value --> SWAP, else don't)

                Step 4: now, shift the pointer at 2 values @ index 1 and 2, compare the two values (if the value at index 1 is > than value at index 2 --> SWAP, else don't)

                Step 5: Repeat the steps till the pointer shifts to last values @ index n-1 and n, if the value at n-1 > n, the --> SWAP, else don't)

                -------This is the 1st iteration--------
                -------repeat it in 2nd Iteration-------
                -------repeat it in 3rd Iteration-------
                ----Till the whole array is sorted------

            "The time Complexity of Bubble sort is 
            O(n^2), because we use two loops, one for iteraton and the inner loop is for comparing and swapping the values"


            2. Selection Sorting --> 
                The main issue with bubble sorting is swapping and number of iteration and SWAPPING... here lets reduce that

                "Here do not actually swap every time after comparison."
        
                Step 1 : From the entire array, find either min or max, value and make sure the value stays at starting or ending of the array respectively.

                Step 2: Expect that one placement of array at starting or ending as one part, and the other part is remaining elements in array. So, now the scan is goinf to be done in unsorted array

                Step 3: Do the steps again for 1st and 2nd value as a part sorted array, or last and second last value as part of sorted array, the remaining will be unsorted array part.

                Step 4: Here the swapping of values are done in outer loop, which significantly reduces the number of swapping.  

                Step 5: In the array, let's assume  first value or Index[0] is the biggest value, check it with the next values, if index[0] > index [1, 2, 3, 4] else, swap. as soon as it gets the value bigger than itself, the value is sent to the index[n] and the value at index[n] will swapped and go to index[n-1].

                Step 6: repeat these steps

                -------This is the 1st iteration--------
                -------repeat it in 2nd Iteration-------
                -------repeat it in 3rd Iteration-------
                ----Till the whole array is sorted------

            "The time Complexity of Selection sort is-------------------

            3. Insertion Sorting -->
            4. Merge Sorting -->
            5. Quick Sorting -->
            6. Counting Sorting -->
            7. Radix Sorting -->
            8. Heap Sorting -->
            9. Bucket Sorting -->
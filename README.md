# merge-sort

Merge sort example.

Merge sort is a popular sorting algorithm that follows the divide-and-conquer
strategy to efficiently sort a list or an array of elements. It works as follows:

1. Divide: The list to be sorted is divided into two halves recursively until
   each sublist contains only one element.
2. Conquer: After dividing the list into its smallest parts (single-element lists),
   these smaller lists are then merged back together in a sorted manner.
3. Merge: During the merge phase, pairs of smaller sorted lists are merged into
   larger sorted lists. This process continues until there is only one sorted
   list remaining, which is the sorted version of the original list.

The key operation in the merge phase is comparing elements from the two smaller
lists and merging them into a single sorted list. This is done by comparing the
elements at the beginning of each sublist and selecting the smaller one to be
placed in the merged list. The process continues until all elements from both
sublists have been merged into the final sorted list.

The merge sort algorithm has a time complexity of O(n log n) for average, best,
and worst cases, making it efficient for sorting large datasets. However, it
requires additional space proportional to the size of the input array for the
temporary storage of elements during the merge phase, which makes it less
memory-efficient compared to some other sorting algorithms.

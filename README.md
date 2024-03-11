# Exercise D:

**Greedy Choice:** Choose the next egg if it doesn't exceed the max weight and number of eggs that can be put in the bowl. This is done in the loop checking if `counter + a[i] <= q && i + 1 <= p`.

**Optimal Substructure:** The solution involves solving subproblems, which are finding the max number of eggs that can be boiled given a certain max weight and number of eggs for each subset of the eggs.

**Proof of Greedy Algorithm:** The greedy algorithm can be proven correct by contradiction. If there's an optimal solution that doesn't make the greedy choice at some step, this means there's an egg that could be added to the bowl without exceeding the max weight and number of eggs, but the optimal solution doesn't add it. Adding this egg would increase the number of eggs that can be boiled, contradicting the assumption that the solution is optimal.

**Time Complexity:** O(n), where n is the number of eggs. The algorithm goes through each egg once to check if it can be added to the bowl.

---

# Coco's Theme Party:

**Greedy Choice:** Always choose the smallest and the largest guest in the sorted list of guests and calculate the absolute difference between them. This is done in the loop where it calculates the difference between `guests.get(i)` and `guests.get(guestAmount - 1 - i)`.

**Optimal Substructure:** The solution involves solving subproblems, which are finding the absolute difference between the smallest and the largest guest for each subset of the guests.

**Time Complexity:** O(n log n), where n is the number of guests. The algorithm sorts the guests which takes O(n log n) time and then goes through each guest once to calculate the absolute difference which takes O(n) time. Therefore, the overall time complexity is dominated by the sorting operation, making it O(n log n).

---

# Coco's Birthday:

**Greedy Choice:** Always choose the highest happiness value from the priority queue. This is done in the loop where it polls the highest happiness value from the queue.

**Optimal Substructure:** The solution involves solving subproblems, which are finding the highest happiness value for each subset of the queue.

**Time Complexity:** O(n log n), where n is the number of elements in the queue. The algorithm adds elements to the priority queue which takes O(log n) time and it does this n times. Therefore, the overall time complexity is O(n log n).

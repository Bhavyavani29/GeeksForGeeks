<h2><a href="https://www.geeksforgeeks.org/problems/distribute-n-candies/1">Distribute n Candies Among k People</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given two integers <strong>n</strong> and <strong>k</strong>, where <strong>n</strong> represents the total number of candies and <strong>k</strong> represents the number of people, distribute the candies in rounds.</span></p>
<ul>
<li><span style="font-size: 18px;">In the first round, the first person receives 1 candy, the second person receives 2 candies, and so on until the kth person receives k candies.</span></li>
<li><span style="font-size: 18px;">In the next round, the first person receives k + 1 candies, the second person receives k + 2 candies, and this pattern continues.</span></li>
</ul>
<p><span style="font-size: 18px;">If the remaining candies are fewer than the required candies for a person, that person receives all the remaining candies.</span></p>
<p><span style="font-size: 18px;">Return an array arr of size k, where arr[i] represents the total candies received by the ith person.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 7, k = 4<strong>
Output: </strong>[1, 2, 3, 1]<strong>
Explanation: </strong>The first person receives 1 candy, the second receives 2 candies, and the third receives 3 candies. Only 1 candy remains for the fourth person, so they receive the remaining candy. Therefore, the final distribution is [1, 2, 3, 1].</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 10, k = 3<strong>
Output: </strong>[5, 2, 3]<strong>
Explanation: </strong>In the first round, the three people receive 1, 2, and 3 candies respectively. In the next round, the first person receives 4 candies, exhausting all the remaining candies. Therefore, the final distribution is [5, 2, 3].</span><span style="font-size: 18px;"> </span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>8</sup><br>1 ≤ k ≤ 100</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Mathematics</code>&nbsp;<code>Binary Search</code>&nbsp;
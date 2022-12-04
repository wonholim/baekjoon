# [Gold IV] Word Tree - 25777 

[문제 링크](https://www.acmicpc.net/problem/25777) 

### 성능 요약

메모리: 39956 KB, 시간: 548 ms

### 분류

그래프 이론(graphs), 최소 스패닝 트리(mst), 문자열(string)

### 문제 설명

<p>Given a set of n words, each of the same length, we can form a tree structure between the words by connecting pairs of words with an edge. In particular, we must add exactly n-1 edges and make sure that there is a single simple path from every word to every other word.</p>

<p>We define the cost of an edge between two words as the sum of the costs between each pair of corresponding letters of the two words. We define the cost between two letters as being the absolute value of the difference between their Ascii values. For example, the cost of an edge between "CAMP" and "BEAR" would be 1 + 4 + 12 + 2 = 19 because |'C' - 'B'| = 1, |'A' - 'E'| = 4, |'M' - 'A'| = 12, and |'P' - 'R'| = 2.</p>

<p>Here is an illustration of a word tree with the words BEAM, BEAR, BEAT, CAMP and CART:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/713271fc-7e87-4098-93b4-140a2bbd2a26/-/preview/" style="width: 355px; height: 229px;"></p>

<p>Finally, because we like only connecting words that are "similar", our goal is to minimize the value of the maximum edge cost of the tree. In the example above, it is impossible to connect the words in a tree structure where each edge has a cost of less than 19.</p>

<p>Note that there are no constraints on the tree structure, i.e., any word can be listed as the child of any other node. For example, it does not have to be a binary search tree. The structure must, of course, be a tree and the cost is as defined above.</p>

<p>Given a set of n words, each consisting of k uppercase letters, of all possible word trees that could be formed with those words, determine the minimum possible value of the maximum edge cost.</p>

### 입력 

 <p>The first input line contains two integers: n (2 ≤ n ≤ 1000), indicating the number of words, and k (1 ≤ k ≤ 20), indicating the length of each of the words. Each of the following n input lines contains one of the words. These words are guaranteed to be distinct, consist of exactly k uppercase letters, and start in column one.</p>

### 출력 

 <p>Print the minimum value of the maximum edge cost over all possible word trees for the set of input words.</p>


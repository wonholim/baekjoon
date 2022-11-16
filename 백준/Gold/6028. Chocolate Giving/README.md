# [Gold IV] Chocolate Giving - 6028 

[문제 링크](https://www.acmicpc.net/problem/6028) 

### 성능 요약

메모리: 55744 KB, 시간: 640 ms

### 분류

다익스트라(dijkstra), 그래프 이론(graphs)

### 문제 설명

<p>Farmer John is distributing chocolates at the barn for Valentine's day, and B (1 <= B <= 25,000) of his bulls have a special cow in mind to receive a chocolate gift.</p>

<p>Each of the bulls and cows is grazing alone in one of the farm's N (2*B <= N <= 50,000) pastures conveniently numbered 1..N and connected by M (N-1 <= M <= 100,000) bidirectional cowpaths of various lengths. Some pastures might be directly connected by more than one cowpath. Cowpath i connects pastures R_i and S_i (1 <= R_i <= N; 1 <= S_i <= N) and has length L_i (1 <= L_i <= 2,000).</p>

<p>Bull i resides in pasture P_i (1 <= P_i <= N) and wishes to give a chocolate to the cow in pasture Q_i (1 <= Q_i <= N).</p>

<p>Help the bulls find the shortest path from their current pasture to the barn (which is located at pasture 1) and then onward to the pasture where their special cow is grazing. The barn connects, one way or another (potentially via other cowpaths and pastures) to every pasture.</p>

<p>As an example, consider a farm with 6 pastures, 6 paths, and 3 bulls (in pastures 2, 3, and 5) who wish to bestow chocolates on their love-objects:</p>

<pre>                     *1  <-- Bull wants chocolates for pasture 1 cow
             [4]--3--[5]  <-- [5] is the pasture ID
            /  |
           /   |
          4    2          <-- 2 is the cowpath length
         /     |               between [3] and [4]
      [1]--1--[3]*6
     /   \    /
    9     3  2
   /       \/
 [6]      [2]*4</pre>

<p>The Bull in pasture 2 can travel distance 3 (two different ways) to get to the barn then travel distance 2+1 to pastures [3] and [4] to gift his chocolate. That's 6 altogether.</p>

<p>The Bull in pasture 5 can travel to pasture 4 (distance 3), then pastures 3 and 1 (total: 3 + 2 + 1 = 6) to bestow his chocolate offer.</p>

<p>The Bull in pasture 3 can travel distance 1 to pasture 1 and then take his chocolate 9 more to pasture 6, a total distance of 10.</p>

### 입력 

 <ul>
	<li>Line 1: Three space separated integers: N, M, and B</li>
	<li>Lines 2..M+1: Line i+1 describes cowpath i with three space-separated integers: R_i, S_i, and L_i</li>
	<li>Lines M+2..M+B+1: Line M+i+1 contains two space separated integers: P_i and Q_i</li>
</ul>

<p> </p>

### 출력 

 <ul>
	<li>Lines 1..B: Line i should contain a single integer, the smallest distance that the bull in pasture P_i must travel to get chocolates from the barn and then award them to the cow of his dreams in pasture Q_i</li>
</ul>

<p> </p>


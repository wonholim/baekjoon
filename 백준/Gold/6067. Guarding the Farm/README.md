# [Gold V] Guarding the Farm - 6067 

[문제 링크](https://www.acmicpc.net/problem/6067) 

### 성능 요약

메모리: 46608 KB, 시간: 568 ms

### 분류

너비 우선 탐색(bfs), 깊이 우선 탐색(dfs), 그래프 이론(graphs), 그래프 탐색(graph_traversal)

### 문제 설명

<p>The farm has many hills upon which Farmer John would like to place guards to ensure the safety of his valuable milk-cows.</p>

<p>He wonders how many guards he will need if he wishes to put one on top of each hill. He has a map supplied as a matrix of integers; the matrix has N (1 < N <= 700) rows and M (1 < M <= 700) columns. Each member of the matrix is an altitude H_ij (0 <= H_ij <= 10,000). Help him determine the number of hilltops on the map.</p>

<p>A hilltop is one or more adjacent matrix elements of the same value surrounded exclusively by either the edge of the map or elements with a lower (smaller) altitude. Two different elements are adjacent if the magnitude of difference in their X coordinates is no greater than 1 and the magnitude of differences in their Y coordinates is also no greater than 1.</p>

### 입력 

 <ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..N+1: Line i+1 describes row i of the matrix with M space-separated integers: H_ij</li>
</ul>

<p> </p>

### 출력 

 <ul>
	<li>Line 1: A single integer that specifies the number of hilltops</li>
</ul>

<p> </p>


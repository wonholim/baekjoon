# [Gold IV] Cow Hurdles - 6135 

[문제 링크](https://www.acmicpc.net/problem/6135) 

### 성능 요약

메모리: 32172 KB, 시간: 480 ms

### 분류

플로이드–와샬(floyd_warshall), 그래프 이론(graphs)

### 문제 설명

<p>Farmer John wants the cows to prepare for the county jumping competition, so Bessie and the gang are practicing jumping over hurdles. They are getting tired, though, so they want to be able to use as little energy as possible to jump over the hurdles.</p>

<p>Obviously, it is not very difficult for a cow to jump over several very short hurdles, but one tall hurdle can be very stressful. Thus, the cows are only concerned about the height of the tallest hurdle they have to jump over.</p>

<p>The cows' practice room has N (1 <= N <= 300) stations, conveniently labeled 1..N. A set of M (1 <= M <= 25,000) one-way paths connects pairs of stations; the paths are also conveniently labeled 1..M. Path i travels from station S_i to station E_i and contains exactly one hurdle of height H_i (1 <= H_i <= 1,000,000). Cows must jump hurdles in any path they traverse.</p>

<p>The cows have T (1 <= T <= 40,000) tasks to complete. Task i comprises two distinct numbers, A_i and B_i (1 <= A_i <= N; 1 <= B_i <= N), which connote that a cow has to travel from station A_i to station B_i (by traversing over one or more paths over some route). The cows want to take a path the minimizes the height of the tallest hurdle they jump over when traveling from A_i to B_i. Your job is to write a program that determines the path whose tallest hurdle is smallest and report that height.</p>

### 입력 

 <ul>
	<li>Line 1: Three space-separated integers: N, M, and T</li>
	<li>Lines 2..M+1: Line i+1 contains three space-separated integers: S_i, E_i, and H_i</li>
	<li>Lines M+2..M+T+1: Line i+M+1 contains two space-separated integers that describe task i: A_i and B_i</li>
</ul>

### 출력 

 <ul>
	<li>Lines 1..T: Line i contains the result for task i and tells the smallest possible maximum height necessary to travel between the stations. Output -1 if it is impossible to travel between the two stations.</li>
</ul>


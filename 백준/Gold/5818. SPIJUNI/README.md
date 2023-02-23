# [Gold II] SPIJUNI - 5818 

[문제 링크](https://www.acmicpc.net/problem/5818) 

### 성능 요약

메모리: 126316 KB, 시간: 1324 ms

### 분류

그래프 이론(graphs), 최소 스패닝 트리(mst)

### 문제 설명

<p>You are M, the head of the intelligence agency which employs N spies with codenames from 1 to N. </p>

<p>Each of the spies has been assigned a different country and obtained an important piece of informationthere. Your task is the following: </p>

<ol>
	<li>Organize meetings between some of the spies. In each meeting, exactly two spies meet and exchange all information that they have obtained themselves or learned from other spies in previous meetings. Organizing a top-secret meeting between two spies in different countries is difficult, so each potential meeting has a price. </li>
	<li>After all the meetings have concluded, select a subset of spies and send them together on the world-saving (and woman-romancing) assignment. Sending a spy k on the assignment costs M<sub>k</sub>. For the assignment to succeed, it is important that the spies together know all the information obtained by the remaining spies. </li>
</ol>

<p>Find the minimum total price of preparing and executing this assignment. </p>

### 입력 

 <p>The first line of input contains the positive integer N, the number of spies (2 ≤ N ≤ 1000). </p>

<p>Each of the following N lines contains N positive integers not exceeding 10<sup>6</sup>. The number in row k and column m represents the price of a meeting between spies k and m and, of course, equals the number in row m and column k (for k = m the number will be 0). </p>

<p>The following line contains N positive integers M<sub>k</sub> (1 ≤ M<sub>k</sub> ≤ 10<sup>6</sup>), the prices of sending each spy on the assignment, in order for spies 1, 2, ..., N. </p>

### 출력 

 <p>The first and only line of output must contain the required minimum total price. </p>


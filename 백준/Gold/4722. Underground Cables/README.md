# [Gold III] Underground Cables - 4722 

[문제 링크](https://www.acmicpc.net/problem/4722) 

### 성능 요약

메모리: 96236 KB, 시간: 1504 ms

### 분류

그래프 이론(graphs), 최소 스패닝 트리(mst)

### 문제 설명

<p>A city wants to get rid of their unsightly power poles by moving their power cables underground. They have a list of points that all need to be connected, but they have some limitations. Their tunneling equipment can only move in straight lines between points, and they only have room for one underground cable at any location except at the given points so no two cables can cross.</p>

<p>Given a list of points, what is the least amount of cable necessary to make sure that every pair or points is connected, either directly, or indirectly through other points?</p>

### 입력 

 <p>There will be several test cases in the data file. Each test case will begin with an integer N (2 ≤ N ≤ 1, 000), which is the number of points in the city. On each of the next N lines will be two integers, X and Y (−1, 000 ≤ X, Y ≤ 1, 000), which are the (X, Y ) locations of the N points.</p>

<p>The data file will end with a line with a single 0.</p>

### 출력 

 <p>For each test case, output a line containing single real number, representing the least amount of cable the city will need to connect all of its points. Print this number with to two decimal places precision.</p>


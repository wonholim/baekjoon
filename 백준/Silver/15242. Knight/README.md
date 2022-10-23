# [Silver I] Knight - 15242 

[문제 링크](https://www.acmicpc.net/problem/15242) 

### 성능 요약

메모리: 14328 KB, 시간: 124 ms

### 분류

너비 우선 탐색(bfs), 그래프 이론(graphs), 그래프 탐색(graph_traversal), 파싱(parsing), 문자열(string)

### 문제 설명

<p>In Chess, the knight is the weirdest of all the pieces. To begin with, the piece is actually a horse without any human riding it. The second reason is its movement pattern. It can move 2 cells forward and one to the side. Below you can see all the possible destinations of a knight.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15242/1.gif" style="height:126px; width:126px"></p>

<p>With a movement pattern so weird, it is complicated to know what’s the shortest path between two board squares. Can you write a program that computes the minimum number of movements needed to move a knight from one square to another? Remember that a chessboard has 8 rows and 8 columns. Also in the standard notation, the columns are represented by letters from a to h.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15242/2.gif" style="height:186px; width:186px"></p>

### 입력 

 <p>The input will contain 2 lines. The first line will be the starting position of the knight and the second line will specify its final position.</p>

### 출력 

 <p>Output a single integer specifying the minimum number of moves for the knight to get from it’s starting position to it’s final position on the board.</p>


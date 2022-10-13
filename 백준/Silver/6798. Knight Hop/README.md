# [Silver III] Knight Hop - 6798 

[문제 링크](https://www.acmicpc.net/problem/6798) 

### 성능 요약

메모리: 15732 KB, 시간: 136 ms

### 분류

너비 우선 탐색(bfs), 그래프 이론(graphs), 그래프 탐색(graph_traversal)

### 문제 설명

<p>Below is an 8 × 8 chessboard on which we will designate square locations using the ordered pairs as indicated. For example, notice that piece A is at position (2, 2) and piece B is at position (4, 3).</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/6798/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-03-24%20%EC%98%A4%ED%9B%84%202.17.58.png" style="height:275px; width:359px"></p>

<p>A knight is a special game piece that can leap over other pieces, moving in the “L” pattern. Specifically, in the diagram below, K represents the knight’s starting position and the numbers 1 through 8 represent possible places the knight may move to.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/6798/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-03-24%20%EC%98%A4%ED%9B%84%202.18.32.png" style="height:280px; width:359px"></p>

<p>Your program will read the starting location of the knight and output the smallest number of jumps or moves needed to arrive at a location specified in the second input.</p>

### 입력 

 <p>Your program will read four integers, where each integer is in the range 1...8. The first two integers represent the starting position of the knight. The second two integers represent the final position of the knight.</p>

### 출력 

 <p>Your program should output the minimum (non-negative integer) number of moves required to move the knight from the starting position to the final position. Note that the knight is not allowed to move off the board during the sequence of moves.</p>


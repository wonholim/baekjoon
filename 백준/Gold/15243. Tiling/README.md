# [Gold V] Tiling - 15243 

[문제 링크](https://www.acmicpc.net/problem/15243) 

### 성능 요약

메모리: 14432 KB, 시간: 128 ms

### 분류

다이나믹 프로그래밍(dp)

### 문제 설명

<p dir="ltr">Domino tiles (or dominoes) are rectangular pieces of size 2x1. Each square contains a number from 1 to 6. These pieces are used to play a game but in this problem we are going to use them for something different.</p>

<p dir="ltr">We can build rectangles of certain width W and height 3 using dominoes. We are wondering how many ways of creating such rectangles are possible.</p>

<p>Below you can see the three possible ways of creating a rectangle of width 2 and height 3.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15243/1.png" style="height:83px; width:245px"></p>

<p>As you see there are many ways of tiling the rectangle. For example this is a possible solution with width 12:</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15243/2.gif" style="height:80px; width:273px"></p>

<p>Your task is to write a program that computes the number of possible ways of tiling a rectangle of width W and height 3.</p>

### 입력 

 <p dir="ltr">A single line with an integer W. The width of the rectangle.</p>

<p dir="ltr">The value of W will be between 1 and 1000.</p>

### 출력 

 <p dir="ltr">A single line with the number of possible ways. The numbers can be large so print the solution modulo 1000000007 (10<sup>9</sup> + 7).</p>


# [Gold III] Moocast - 14167 

[문제 링크](https://www.acmicpc.net/problem/14167) 

### 성능 요약

메모리: 35496 KB, 시간: 556 ms

### 분류

그래프 이론(graphs), 최소 스패닝 트리(mst)

### 문제 설명

<p>Farmer John's N cows (1≤N≤1000) want to organize an emergency "moo-cast" system for broadcasting important messages among themselves.</p>

<p>Instead of mooing at each-other over long distances, the cows decide to equip themselves with walkie-talkies, one for each cow. These walkie-talkies each have a limited transmission radius, but cows can relay messages to one-another along a path consisting of several hops, so it is not necessary for every cow to be able to transmit directly to every other cow.</p>

<p>The cows need to decide how much money to spend on their walkie-talkies. If they spend <span>$</span>X, they will each get a walkie-talkie capable of transmitting up to a distance of √X. That is, the squared distance between two cows must be at most X for them to be able to communicate.</p>

<p>Please help the cows determine the minimum integer value of X such that a broadcast from any cow will ultimately be able to reach every other cow.</p>

### 입력 

 <p>The first line of input contains N.</p>

<p>The next N lines each contain the x and y coordinates of a single cow. These are both integers in the range 0…25,000.</p>

### 출력 

 <p>Write a single line of output containing the integer X giving the minimum amount the cows must spend on walkie-talkies.</p>


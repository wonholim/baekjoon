# [Gold III] Arctic Network - 4343 

[문제 링크](https://www.acmicpc.net/problem/4343) 

### 성능 요약

메모리: 41856 KB, 시간: 480 ms

### 분류

그래프 이론(graphs), 최소 스패닝 트리(mst)

### 문제 설명

<p>The Department of National Defence (DND) wishes to connect several northern outposts by a wireless network. Two different communication technologies are to be used in establishing the network: every outpost will have a radio transceiver and some outposts will in addition have a satellite channel.</p>

<p>Any two outposts with a satellite channel can communicate via the satellite, regardless of their location. Otherwise, two outposts can communicate by radio only if the distance between them does not exceed D, which depends of the power of the transceivers. Higher power yields higher D but costs more. Due to purchasing and maintenance considerations, the transceivers at the outposts must be identical; that is, the value of D is the same for every pair of outposts.</p>

<p>Your job is to determine the minimum D required for the transceivers. There must be at least one communication path (direct or indirect) between every pair of outposts.</p>

### 입력 

 <p>The first line of input contains N, the number of test cases. The first line of each test case contains 1 <= S <= 100, the number of satellite channels, and S < P <= 500, the number of outposts. P lines follow, giving the (x,y) coordinates of each outpost in km (coordinates are integers between 0 and 10,000). </p>

### 출력 

 <p>For each case, output should consist of a single line giving the minimum D required to connect the network. Output should be specified to 2 decimal points.</p>


# [Gold III] Treehouses - 16405 

[문제 링크](https://www.acmicpc.net/problem/16405) 

### 성능 요약

메모리: 58456 KB, 시간: 724 ms

### 분류

그래프 이론(graphs), 최소 스패닝 트리(mst)

### 문제 설명

<p>In a rainforest there are n treehouses high in the forest canopy on different trees (numbered from 1 to n). The i-th tree’s location is at (x<sub>i</sub>, y<sub>i</sub>). The first e of them in the list are close enough to neighboring open land around the rainforest so that transportation between all of them is easy by foot. Some treehouses may already be connected by direct straight cables through the air that can allow transport between them. Residents want easy transportation between all the treehouses and the open land, by some combination of walking (between those near the open land), and using one or more cables between treehouses. This may require the addition of more cables. Since the cables are expensive, they would like to add the smallest possible length of cable.</p>

<p>The height of a cable up two trees can be set so cables can criss-cross other cables, and not allow any snags or crashes. It is not safe to try to switch between two criss-crossed cables in mid-air!</p>

### 입력 

 <p>The input will start with the three integers n (1 ≤ n ≤ 1 000), e (1 ≤ e ≤ n), and p (0 ≤ p ≤ 1 000), where p is the number of cables in place already.</p>

<p>Next come n lines, each with two real numbers x and y (|x|, |y| ≤ 10 000) giving the location of a treehouse. The i-th coordinate pair is for the treehouse with ID i. All coordinate pairs are unique. Real numbers are stated as integers or include one digit after a decimal point.</p>

<p>Next come p lines, each with two integers a, b, where 1 ≤ a < b ≤ n, giving the two treehouse ids of an existing cable between their trees. No ID pair will be repeated.</p>

### 출력 

 <p>The output is the minimum total length of new cable that achieves the connection goal, expressed with absolute or relative error less than 0.001.</p>


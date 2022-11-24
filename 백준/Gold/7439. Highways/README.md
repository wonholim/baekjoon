# [Gold III] Highways - 7439 

[문제 링크](https://www.acmicpc.net/problem/7439) 

### 성능 요약

메모리: 40308 KB, 시간: 748 ms

### 분류

그래프 이론(graphs), 최소 스패닝 트리(mst)

### 문제 설명

<p>The island nation of Flatopia is perfectly flat. Unfortunately, Flatopia has a very poor system of public highways. The Flatopian government is aware of this problem and has already constructed a number of highways connecting some of the most important towns. However, there are still some towns that you can't reach via a highway. It is necessary to build more highways so that it will be possible to drive between any pair of towns without leaving the highway system.</p>

<p>Flatopian towns are numbered from 1 to <em>N</em> and town <em>i</em> has a position given by the Cartesian coordinates (<em>x<sub>i</sub></em>, <em>y<sub>i</sub></em>). Each highway connects exaclty two towns. All highways (both the original ones and the ones that are to be built) follow straight lines, and thus their length is equal to Cartesian distance between towns. All highways can be used in both directions. Highways can freely cross each other, but a driver can only switch between highways at a town that is located at the end of both highways.</p>

<p>The Flatopian government wants to minimize the cost of building new highways. However, they want to guarantee that every town is highway-reachable from every other town. Since Flatopia is so flat, the cost of a highway is always proportional to its length. Thus, the least expensive highway system will be the one that minimizes the total highways length.</p>

### 입력 

 <p>The input file consists of two parts. The first part describes all towns in the country, and the second part describes all of the highways that have already been built.</p>

<p>The first line of the input file contains a single integer <em>N</em> (1 ≤ <em>N</em> ≤ 750), representing the number of towns. The next <em>N</em> lines each contain two integers, <em>x<sub>i</sub></em> and <em>y<sub>i</sub></em> separated by a space. These values give the coordinates of <em>i</em><sup>th</sup> town (for <em>i</em> from 1 to <em>N</em>). Coordinates will have an absolute value no greater than 10000. Every town has a unique location.</p>

<p>The next line contains a single integer <em>M</em> (0 ≤ M ≤ 1000), representing the number of existing highways. The next <em>M</em> lines each contain a pair of integers separated by a space. These two integers give a pair of town numbers which are already connected by a highway. Each pair of towns is connected by at most one highway.</p>

### 출력 

 <p>Write to the output file a single line for each new highway that should be built in order to connect all towns with minimal possible total length of new highways. Each highway should be presented by printing town numbers that this highway connects, separated by a space.</p>

<p>If no new highways need to be built (all towns are already connected), then the output file should be created but it should be empty.</p>


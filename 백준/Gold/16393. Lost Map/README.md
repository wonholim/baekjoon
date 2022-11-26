# [Gold II] Lost Map - 16393 

[문제 링크](https://www.acmicpc.net/problem/16393) 

### 성능 요약

메모리: 451784 KB, 시간: 4212 ms

### 분류

그래프 이론(graphs), 최소 스패닝 트리(mst)

### 문제 설명

<p>Somewhere in a mountainous region of the world is a collection of n villages. Connecting these villages to one another is a series of roads, always running directly between two villages and allowing travel in both directions. Due to the treacherous landscape, building these roads is expensive, so the minimum number of roads have been constructed such that each village can reach every other village via a sequence of roads.</p>

<p>Trade between these villages is very important, since not every village has access to the same supply of natural resources. Many villages produce the same resource, however, so it is useful for villages to know their relative distance to other villages so that they can choose trading partners to minimize overall trading costs. Note that the distance between two villages a and b is the sum of the lengths of the individual roads on the shortest path that connects a and b.</p>

<p>A project has been underway to compute the distance between every pair of villages. This information has been incorporated in a table, along with a map that shows the layout of villages and roads that run between them. You have been assigned the task of distributing the table and map to all the villages for the betterment of the regional economy.</p>

<p>Unfortunately, not long after you were given this task, a gust of wind blew the map right out of your hand and into the countryside. Despite your best efforts of searching for it, you have been unable to locate it. You know that you could visit all the villages to reconstruct the map and THEN start distributing the map and table, but this will take twice as long as the original task and the villages will be very displeased with you. You wonder, maybe it’s possible to reconstruct the map given only the table?</p>

### 입력 

 <p>The first line of input will contain the integer n (2 ≤ n ≤ 2 500), the number of villages in this region. The next n lines will contain n integers each. The j<sup>th</sup> integer of the i<sup>th</sup> line is the distance from village i to village j. All distances are greater than zero unless i = j, less than 10<sup>7</sup>, and it is guaranteed that the distance from village i to village j is the same as the distance from village j to village i.</p>

### 출력 

 <p>For each test case, output n − 1 lines with two integers u and v on each line, indicating that there is a road connecting villages u and v in this region. Assume the villages are numbered from 1 to n. Any solution that outputs the original set of roads will be accepted.</p>


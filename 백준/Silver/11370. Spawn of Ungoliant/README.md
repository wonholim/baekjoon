# [Silver II] Spawn of Ungoliant - 11370 

[문제 링크](https://www.acmicpc.net/problem/11370) 

### 성능 요약

메모리: 14088 KB, 시간: 124 ms

### 분류

너비 우선 탐색(bfs), 깊이 우선 탐색(dfs), 그래프 이론(graphs), 그래프 탐색(graph_traversal)

### 문제 설명

<p>The spider children of Ungoliant are spreading through Mirkwood. Each of the giant spiders cannot move from the tree which it inhabits; however, each can lay eggs in the trees adjacent to it. Each egg will rapidly hatch and grow into another spider, who will then lay their own eggs.</p>

<p>Given a map of Mirkwood, indicating where spider-filled and spider-free trees are, determine how far the spider infestation will spread.</p>

<p>For this problem, adjacency is one of the four cardinal directions (north, south, east, and west); two trees connected via a diagonal are not considered adjacent.</p>

### 입력 

 <p>The first line of an input case is of the form W H, where W is the width of the map and H is the height. The next H lines contain strings of length W specifying the layout of Mirkwood. An S character represents a spider-infested tree, and an T character represents a spider-free tree. A . (period) signifies open space on the forest floor, where there is no tree.</p>

<p>The end of input is signified by two zero’s, which is a case that should not be processed.</p>

### 출력 

 <p>For each test case, print out the map of Mirkwood once the spiders have spread as far as possible. There should be no blank lines between maps.</p>


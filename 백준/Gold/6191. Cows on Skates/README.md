# [Gold V] Cows on Skates - 6191 

[문제 링크](https://www.acmicpc.net/problem/6191) 

### 성능 요약

메모리: 16428 KB, 시간: 180 ms

### 분류

너비 우선 탐색(bfs), 그래프 이론(graphs), 그래프 탐색(graph_traversal)

### 문제 설명

<p>Finally, after years of pleading, Farmer John relented and has purchased  roller skates for the entire herd of cows. A large bit of the farm is just  great for roller-skating, but several parcels have just way too many rocks  and are unpassable on skates.</p>

<p>The farm is conveniently reprssented as a grid of squares with R (1 <= R  <= 113) rows and C (1 <= C <= 77) columns. Bessie finds herself at square  (1,1) near feeding time and wants to get back to barn which is located at  square (R,C). She knows there is at least one way to do so by skating to  adjacent squares (but not on the diagonal) that don't contain rocks. Find  and display any path that Bessie can follow to get to the barn.</p>

<p>Consider R=5, C=8 farm layout below on the left, where '*' means "too many  rocks here". The right-hand map shows one possible path Bessie might use  to get to the barn in the lower right corner:</p>

<pre>  12345678     12345678
1 B.*...**   1 @@*@@@**
2 *.*.*.**   2 *@*@*@**
3 *...*...   3 *@@@*@@@
4 *.*.*.*.   4 *.*.*.*@
5 ....*.*B   5 ....*.*@</pre>

### 입력 

 <ul>
	<li>Line 1: Two space-separated integers, respectively R and C</li>
	<li>Lines 2..R+1: Each line contains C characters (with no spaces).  Each character is  either a '.' indicating that Bessie can skate on that square or a '*'  indicating that the square has too many rocks.</li>
</ul>

<p> </p>

### 출력 

 <ul>
	<li>Lines 1..?: Each line contains two space-separated integers that are the R,C  coordinates of a square Bessie occupies. The first line should be 1 1; the  last line should be the integers R and C. Intermediate lines show, square by square, the path Bessie takes between squares 1,1 and R,C.</li>
</ul>


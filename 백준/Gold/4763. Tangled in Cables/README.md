# [Gold IV] Tangled in Cables - 4763 

[문제 링크](https://www.acmicpc.net/problem/4763) 

### 성능 요약

메모리: 16644 KB, 시간: 172 ms

### 분류

자료 구조(data_structures), 그래프 이론(graphs), 해시를 사용한 집합과 맵(hash_set), 최소 스패닝 트리(mst)

### 문제 설명

<p>You are the owner of SmallCableCo and have purchased the franchise rights for a small town. Unfortunately, you lack enough funds to start your business properly and are relying on parts you have found in an old warehouse you bought. Among your finds is a single spool of cable and a lot of connectors. You want to figure out whether you have enough cable to connect every house in town. You have a map of town with the distances for all the paths you may use to run your cable between the houses. You want to calculate the shortest length of cable you must have to connect all of the houses together.</p>

### 입력 

 <p>Only one town will be given in an input file.</p>

<ul>
	<li>The first line gives the length of cable on the spool as a real number.</li>
	<li>The second line contains the number of houses, N</li>
	<li>The next N lines give the name of each house’s owner. Each name consists of up to 20 characters {a–z,A–Z,0–9} and contains no whitespace or punctuation.</li>
	<li>Next line: M, number of paths between houses</li>
	<li>next M lines in the form<br>
	 <house name A> <house name B> <distance><br>
	Where the two house names match two different names in the list above and the distance is a positive real number. There will not be two paths between the same pair of houses.</li>
</ul>

### 출력 

 <p>The output will consist of a single line. If there is not enough cable to connect all of the houses in the town, output</p>

<p>Not enough cable</p>

<p>If there is enough cable, then output</p>

<p>Need <X> miles of cable</p>

<p>Print X to the nearest tenth of a mile (0.1).</p>


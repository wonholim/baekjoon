# [Silver III] 순열 - 9742 

[문제 링크](https://www.acmicpc.net/problem/9742) 

### 성능 요약

메모리: 16460 KB, 시간: 336 ms

### 분류

백트래킹(backtracking), 브루트포스 알고리즘(bruteforcing)

### 문제 설명

<p>집합의 순열이란 집합의 서로 다른 원소를 모두 사용해 만들 수 있는 순서이다. 예를 들어, {2,3,5}의 순열은 다음과 같다.</p>

<ol>
	<li>2 3 5</li>
	<li>2 5 3</li>
	<li>3 2 5</li>
	<li>3 5 2</li>
	<li>5 2 3</li>
	<li>5 3 2</li>
</ol>

<p>각각의 순열은 숫자로 나타낼 수 있다. 위의 순열은 사전순으로 쓰여져 있으며, 등장하는 순서를 이용해 나타낸다. 즉, 3 5 2는 위치 4에 있고, 5 3 2는 마지막 위치인 6에 있다.</p>

<p>{b,e,i,n}으로 만들 수 있는 순열은 다음과 같다.</p>

<ol>
	<li>b e i n</li>
	<li>b e n i</li>
	<li>b i e n</li>
	<li>b i n e</li>
	<li>b n e i</li>
	<li>b n i e</li>
	<li>e b i n</li>
	<li>e b n i</li>
	<li>e i b n</li>
	<li>e i n b</li>
	<li>e n b i </li>
	<li>e n i b</li>
	<li>i b e n</li>
	<li>i b n e</li>
	<li>i e b n</li>
	<li>i e n b</li>
	<li>i n b e</li>
	<li>i n e b</li>
	<li>n b e i</li>
	<li>n b i e</li>
	<li>n e b i</li>
	<li>n e i b</li>
	<li>n i b e</li>
	<li>n i e b</li>
</ol>

<p>서로 다른 숫자와 문자로 이루어진 집합과 위치가 주어졌을 때, 그 집합의 순열 중 주어진 위치의 순열을 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있다. 첫 번째 문자열은 서로 다른 숫자와 알파벳으로 이루어져 있으며, 길이는 최대 10이다. 또한, 사전순 순서대로 주어진다. 문자열 다음에는 찾아야 하는 위치가 주어지며, 이 값은 3,628,800보다 작거나 같은 자연수이다.</p>

### 출력 

 <p>각각의 테스트 케이스마다, 입력으로 주어진 위치에 해당하는 순열을 공백없이 출력한다. 만약, 해당하는 순열이 없는 경우에는 "No permutation"을 출력한다.</p>


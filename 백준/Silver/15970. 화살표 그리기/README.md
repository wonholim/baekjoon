# [Silver IV] 화살표 그리기 - 15970 

[문제 링크](https://www.acmicpc.net/problem/15970) 

### 성능 요약

메모리: 16344 KB, 시간: 192 ms

### 분류

브루트포스 알고리즘(bruteforcing), 정렬(sorting)

### 문제 설명

<p>직선 위에 위치를 나타내는 0, 1, 2, ...와 같은 음수가 아닌 정수들이 일정한 간격으로 오른쪽 방향으로 놓여 있다. 이러한 위치들 중 N개의 위치에 하나씩 점들이 주어진다(<그림 1>). 주어진 점들의 위치는 모두 다르다. 두 점 사이의 거리는 두 점의 위치를 나타내는 수들의 차이이다. <그림 1>에서는 4개의 점이 주어지고 점 <em>a</em>와 <em>b</em>의 거리는 3이다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e0b8e883-031b-4550-9afb-90dff9126cd7/-/preview/" style="width: 271px; height: 46px;"></p>

<p style="text-align: center;"><그림 1></p>

<p>각 점은 <em>N</em>개의 색깔 중 하나를 가진다. 편의상, 색깔은 1부터 <em>N</em>까지의 수로 표시한다.</p>

<p>각 점 <em>p</em>에 대해서, <em>p</em>에서 시작하는 직선 화살표를 이용해서 다른 점 <em>q</em>에 연결하려고 한다. 여기서, 점 <em>q</em>는 <em>p</em>와 같은 색깔의 점들 중 <em>p</em>와 거리가 가장 가까운 점이어야 한다. 만약 가장 가까운 점이 두 개 이상이면 아무거나 하나를 선택한다.</p>

<p>모든 점에 대해서 같은 색깔을 가진 다른 점이 항상 존재한다. 따라서 각 점 <em>p</em>에서 시작하여 위 조건을 만족하는 <em>q</em>로 가는 하나의 화살표를 항상 그릴 수 있다.</p>

<p>예를 들어, 점들을 순서쌍 (위치, 색깔) 로 표시할 때, <em>a</em> = (0,1), <em>b</em> = (1, 2), <em>c</em> = (3, 1), <em>d</em> = (4, 2), <em>e</em> = (5, 1)라고 하자. </p>

<p>아래 <그림 2>에서 이 점들을 표시한다. 여기서 흰색은 1, 검은색은 2에 해당된다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/42d4e7c4-f4c8-4234-ad4b-4bcc86f3502e/-/preview/" style="width: 276px; height: 67px;"></p>

<p style="text-align: center;"><그림 2></p>

<p>위의 조건으로 화살표를 그리면, 아래 <그림 3>과 같이 점 <em>a</em>의 화살표는 <em>c</em>로 연결된다. 점 <em>b</em>와 <em>d</em>의 화살표는 각각 <em>d</em>와 <em>b</em>로 연결된다. 또한 점 <em>c</em>와 <em>e</em>의 화살표는 각각 <em>e</em>와 <em>c</em>로 연결된다. 따라서 모든 화살표들의 길이 합은 3 + 3 + 2 + 3 + 2 = 13이다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/157c0a3e-059f-4b1b-a714-39a0081a72b9/-/preview/" style="width: 244px; height: 76px;"></p>

<p style="text-align: center;"><그림 3></p>

<p>점들의 위치와 색깔이 주어질 때, 모든 점에서 시작하는 화살표들의 길이 합을 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>표준 입력으로 다음 정보가 주어진다. 첫 번째 줄에는 점들의 개수를 나타내는 정수 <em>N</em>이 주어 진다. 다음 <em>N</em>개의 줄 각각에는 점의 좌표와 색깔을 나타내는 두 정수 <em>x</em>와 <em>y</em>가 주어진다.</p>

### 출력 

 <p>표준 출력으로 모든 점에서 시작하는 화살표들의 길이 합을 출력한다.</p>


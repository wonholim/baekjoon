# [Gold V] 2,147,483,648 게임 - 23796 

[문제 링크](https://www.acmicpc.net/problem/23796) 

### 성능 요약

메모리: 15840 KB, 시간: 148 ms

### 분류

구현

### 문제 설명

<p data-pm-slice="1 1 []">호준이는 2048 게임을 발전시킨 2,147,483,648 게임을 하고 있다.</p>

<p>2,147,483,648 게임은 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c38"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="3"><mjx-c class="mjx-cD7"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="3"><mjx-c class="mjx-c38"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>8</mn><mo>×</mo><mn>8</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">\(8 \times 8\)</span></mjx-container> 크기의 게임판에서 키보드의 방향키를 통해 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-msup><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c></mjx-mn><mjx-script style="vertical-align: 0.363em;"><mjx-mi class="mjx-i" size="s"><mjx-c class="mjx-c1D458 TEX-I"></mjx-c></mjx-mi></mjx-script></mjx-msup></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mn>2</mn><mi>k</mi></msup></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">\(2^k\)</span></mjx-container> (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D458 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c33"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mi>k</mi><mo>≤</mo><mn>30</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">\(1 \le k \le 30\)</span></mjx-container>)꼴에 해당하는 정수가 쓰여 있는 타일들을 움직이며 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="2"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c34"></mjx-c><mjx-c class="mjx-c37"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="2"><mjx-c class="mjx-c34"></mjx-c><mjx-c class="mjx-c38"></mjx-c><mjx-c class="mjx-c33"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="2"><mjx-c class="mjx-c36"></mjx-c><mjx-c class="mjx-c34"></mjx-c><mjx-c class="mjx-c38"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mo class="mjx-n"><mjx-c class="mjx-c3D"></mjx-c></mjx-mo><mjx-msup space="4"><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c></mjx-mn><mjx-script style="vertical-align: 0.363em;"><mjx-texatom size="s" texclass="ORD"><mjx-mn class="mjx-n"><mjx-c class="mjx-c33"></mjx-c><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-texatom></mjx-script></mjx-msup></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>2</mn><mo>,</mo><mn>147</mn><mo>,</mo><mn>483</mn><mo>,</mo><mn>648</mn><mo stretchy="false">(</mo><mo>=</mo><msup><mn>2</mn><mrow data-mjx-texclass="ORD"><mn>31</mn></mrow></msup></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">\(2,147,483,648(=2^{31}\)</span></mjx-container>)을 만드는 것이 목적인 게임이다. 이 게임은 방향키가 눌렸을 때 다음과 같은 규칙으로 진행된다.</p>

<ol>
	<li>눌린 방향키와 같은 방향으로 타일들을 벽 끝까지 밀어 넣는다.</li>
	<li>만약 밀어넣는 방향으로 같은 수가 두 타일 연속해서 존재한다면 그 두 타일을 합친다. 만약 세 타일 이상 연속해있다면 방향키가 가리키는 쪽의 벽에 가까운 쪽부터 두 개씩 합쳐진다.</li>
	<li>한 번의 방향키 입력에 한 타일이 두 번 이상 합쳐지는 경우는 없다.</li>
</ol>

<p>예를 들어 현재 게임판이 다음 그림과 같은 상태라고 하자.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a789a0cd-95d4-41e5-ae62-fa1869bfdb34/-/preview/"></p>

<p>여기에서 왼쪽 방향키(L)가 눌렸을 때 다음 그림과 같이 게임판이 바뀐다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/20e9ac8f-31fe-41f0-8f9b-3b8899cf2f80/-/preview/"></p>

<p>호준이는 행동 취소 기능도 없는 이 게임을 며칠 동안 밤새 하다 보니 이젠 키 하나를 눌러도 게임판이 어떻게 바뀔지 전혀 감을 잡지 못하는 상태에 이르렀다. 호준이를 위해 현재의 게임판과 누를 방향키를 주면 위 규칙대로 진행했을 때의 게임판을 출력하는 프로그램을 작성하자.</p>

### 입력 

 <p data-pm-slice="1 1 []">8줄에 걸쳐 각 줄마다 8개의 정수가 공백으로 구분되어 들어온다. 0은 빈 칸을 의미하고, 나머지 정수는 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-msup><mjx-mn class="mjx-n"><mjx-c class="mjx-c32"></mjx-c></mjx-mn><mjx-script style="vertical-align: 0.363em;"><mjx-mi class="mjx-i" size="s"><mjx-c class="mjx-c1D458 TEX-I"></mjx-c></mjx-mi></mjx-script></mjx-msup></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><msup><mn>2</mn><mi>k</mi></msup></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">\(2^k\)</span></mjx-container> (<mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mi class="mjx-i" space="4"><mjx-c class="mjx-c1D458 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c33"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>≤</mo><mi>k</mi><mo>≤</mo><mn>30</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">\(1≤k≤30\)</span></mjx-container>)의 꼴을 만족한다.</p>

<p>9번째 줄에는 U, D, L, R 중 하나의 알파벳이 들어온다. 각각 위쪽, 아래쪽, 왼쪽, 오른쪽 방향키를 누른다는 의미이다.</p>

### 출력 

 <p data-pm-slice="1 1 []">주어진 게임판에서 방향키를 눌렀을 때의 결과물을 출력하라. 입력으로 주어지는 게임판과 같은 형태로 출력한다.</p>


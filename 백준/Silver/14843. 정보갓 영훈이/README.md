# [Silver V] 정보갓 영훈이 - 14843 

[문제 링크](https://www.acmicpc.net/problem/14843) 

### 성능 요약

메모리: 18404 KB, 시간: 216 ms

### 분류

임의 정밀도 / 큰 수 연산(arbitrary_precision), 구현(implementation)

### 문제 설명

<p>* 이 문제는 실제 인물, 장소, 상황과는 관련이 없습니다. *</p>

<p>한 고등학생 영훈이가 있다. 영훈이는 자기 학교 같은 학년 중에서 최고로 정보과학을 잘 하는 학생 중 한 명이다. 그러나 영훈이는 자신은 그저 일개 프로그래밍 뉴비일 뿐이라며 현실부정을 하고 있다. 옆에서 본의 아니게 기만당한 우리의 주인공이 영훈이에게 현실을 알려주려고 한다.</p>

<p>과학 공부를 한다고 말해 놓고 오늘도 어김없이 자습 시간에 백준을 풀고 있는 영훈이. 우리의 주인공은 백준 문제들에 점수를 매겨서 그 점수를 가지고 영훈이가 정보갓(정보과학 + god)이라는 것을 증명하고자 마음먹었다.</p>

<p>영훈이를 위해 우리의 주인공은 각 문제들에 1개부터 100개까지의 별을 매겼다. 별 1개짜리가 가장 쉬운 문제, 100개짜리가 가장 어려운 문제이다. 별의 개수는 꼭 정수이지는 않다. 예를 들어, 10826번 문제는 별 35.55개짜리 문제이다. 한 문제를 맞혔을 때의 점수는 다음과 같이 주어진다. S는 각 문제의 별 개수, A는 영훈이의 시도 횟수, T는 영훈이 소스의 구동 시간, M은 그 문제의 해답 소스 중 가장 빠른 것의 구동 시간일 때,</p>

<p><mjx-container class="MathJax" jax="CHTML" display="true" style="font-size: 109%; position: relative;"> <mjx-math display="true" class="MJX-TEX" aria-hidden="true" style="margin-left: 0px; margin-right: 0px;"><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mtext class="mjx-n"><mjx-utext variant="normal" style="font-size: 82.6%; padding: 0.909em 0px 0.242em; font-family: MJXZERO, serif;">점</mjx-utext><mjx-utext variant="normal" style="font-size: 82.6%; padding: 0.909em 0px 0.242em; font-family: MJXZERO, serif;">수</mjx-utext></mjx-mtext><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c3D"></mjx-c></mjx-mo><mjx-mfrac space="4"><mjx-frac type="d"><mjx-num><mjx-nstrut type="d"></mjx-nstrut><mjx-mrow><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="3"><mjx-c class="mjx-c2B"></mjx-c></mjx-mo><mjx-mfrac space="3"><mjx-frac><mjx-num><mjx-nstrut></mjx-nstrut><mjx-mn class="mjx-n" size="s"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-num><mjx-dbox><mjx-dtable><mjx-line></mjx-line><mjx-row><mjx-den><mjx-dstrut></mjx-dstrut><mjx-mi class="mjx-i" size="s"><mjx-c class="mjx-c1D434 TEX-I"></mjx-c></mjx-mi></mjx-den></mjx-row></mjx-dtable></mjx-dbox></mjx-frac></mjx-mfrac><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="3"><mjx-c class="mjx-c2B"></mjx-c></mjx-mo><mjx-mfrac space="3"><mjx-frac><mjx-num><mjx-nstrut></mjx-nstrut><mjx-mi class="mjx-i" size="s"><mjx-c class="mjx-c1D440 TEX-I"></mjx-c></mjx-mi></mjx-num><mjx-dbox><mjx-dtable><mjx-line></mjx-line><mjx-row><mjx-den><mjx-dstrut></mjx-dstrut><mjx-mi class="mjx-i" size="s"><mjx-c class="mjx-c1D447 TEX-I"></mjx-c></mjx-mi></mjx-den></mjx-row></mjx-dtable></mjx-dbox></mjx-frac></mjx-mfrac><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-mrow></mjx-num><mjx-dbox><mjx-dtable><mjx-line type="d"></mjx-line><mjx-row><mjx-den><mjx-dstrut type="d"></mjx-dstrut><mjx-mn class="mjx-n"><mjx-c class="mjx-c34"></mjx-c></mjx-mn></mjx-den></mjx-row></mjx-dtable></mjx-dbox></mjx-frac></mjx-mfrac></mjx-math><mjx-assistive-mml unselectable="on" display="block"><math xmlns="http://www.w3.org/1998/Math/MathML" display="block"><mo stretchy="false">(</mo><mtext>점수</mtext><mo stretchy="false">)</mo><mo>=</mo><mfrac><mrow><mi>S</mi><mo stretchy="false">(</mo><mn>1</mn><mo>+</mo><mfrac><mn>1</mn><mi>A</mi></mfrac><mo stretchy="false">)</mo><mo stretchy="false">(</mo><mn>1</mn><mo>+</mo><mfrac><mi>M</mi><mi>T</mi></mfrac><mo stretchy="false">)</mo></mrow><mn>4</mn></mfrac></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">\[(\text{점수}) = \frac{S(1+\frac{1}{A})(1 + \frac{M}{T})}{4}\]</span> </mjx-container></p>

<p>(예를 들어, S = 75.12, A = 3, T = 68, M = 64일 때 점수는 48.6070588…점이다.)</p>

<p>정보과학 수업 때 배우는 Python이 영훈이가 사용하는 언어인데, Python이 그다지 빠르지 않은 관계로 구동 시간이 0ms로 표시되는 일은 없다.</p>

<p>보고서를 열심히 쓰고 있는 영훈이. 정보과학 숙제인 것 같다. 영훈이에게 다가가는 우리의 주인공.</p>

<ul>
	<li>우리의 주인공 : 이거 벌써 풀었어? 역시 정보갓은 다르구나…</li>
	<li>영훈이 : 내가 정보갓이라니? 나보다 잘하는 사람이 얼마나 많은데… (정보를 잘하는 다른 사람들의 이름을 나열한다)</li>
	<li>우리의 주인공 : 정보갓이 세상에 한 사람인 것도 아니잖아. 그럼 넌 상위 몇 퍼센트 정도 되어야 정보갓이라고 생각하는데?</li>
	<li>영훈이: 믕'''''' 상위 15% 정도? 하지만 난 거기 안 들어간다니까?</li>
</ul>

<p>갓이라는 것을 열심히 부정하는 영훈이. 그럼 영훈이의 기준에 맞춰서 영훈이의 백준 점수 총점이 상위 15% 이내이면 영훈이를 정보갓으로 부르도록 하자.</p>

<p>단, 상위 15% 이내라는 것은 등수가 사람수의 15% 이하라는 것을 의미한다.</p>

### 입력 

 <p>첫째 줄에 영훈이가 푼 문제의 수 N이 주어진다. (N은 자연수, 1 ≤ N ≤ 1,000)</p>

<p>둘째 줄부터 N개의 줄에 걸쳐 S, A, T, M이 공백으로 구분되어 주어진다. S를 제외한 다른 모든 값은 자연수이다. (1 ≤ S ≤ 100, 1 ≤ A ≤ 1,000, 1 ≤ M ≤ T ≤ 10,000)</p>

<p>그 다음 줄에는 비교 대상이 될 사람들의 수 P가 주어진다. (P는 자연수, 6 ≤ P ≤ 1,000)</p>

<p>그 다음 P개의 줄에는 P명의 사람들의 백준 총점 R이 주어진다. (1 ≤ R ≤ 1,000,000)</p>

<p>P명의 사람들 중 영훈이와 총점이 같은 사람은 없다.</p>

### 출력 

 <p>첫째 줄에 영훈이의 점수를 소수점 아래 두 자리까지 나타내어 예제의 형식과 같이 출력한다. 만일 영훈이가 P+1명의 사람들(P명의 비교 대상 + 영훈이) 중에서 상위 15% 이내에 들었다면, Younghoon 대신 Younghoon "The God"이라는 표현을 사용한다.</p>


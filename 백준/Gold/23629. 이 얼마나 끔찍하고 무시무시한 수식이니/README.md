# [Gold V] 이 얼마나 끔찍하고 무시무시한 수식이니 - 23629 

[문제 링크](https://www.acmicpc.net/problem/23629) 

### 성능 요약

메모리: 26652 KB, 시간: 380 ms

### 분류

구현(implementation), 문자열(string)

### 문제 설명

<p>하루 종일 숫자만 보다가 정신이 나가버린 사람이 무시무시한 일을 저질러 버렸다. 숫자가 보기 싫으면 없애면 된다고 생각하며 아래와 같은 무시무시한 문자열을 쓴 것이다.</p>

<p><code>ONETWOTHREEFOUR+TWOTHREEFOURFIVE=</code></p>

<p>그렇다. 숫자만 안 보이면 된다. 그래서, 아래의 표를 보고 숫자를 모두 영단어로 바꾸었다.</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 200px;">
	<tbody>
		<tr>
			<td style="text-align: center;">숫자</td>
			<td style="text-align: center;">영단어</td>
		</tr>
		<tr>
			<td style="text-align: center;"><code>0</code></td>
			<td style="text-align: center;"><code>ZERO</code></td>
		</tr>
		<tr>
			<td style="text-align: center;"><code>1</code></td>
			<td style="text-align: center;"><code>ONE</code></td>
		</tr>
		<tr>
			<td style="text-align: center;"><code>2</code></td>
			<td style="text-align: center;"><code>TWO</code></td>
		</tr>
		<tr>
			<td style="text-align: center;"><code>3</code></td>
			<td style="text-align: center;"><code>THREE</code></td>
		</tr>
		<tr>
			<td style="text-align: center;"><code>4</code></td>
			<td style="text-align: center;"><code>FOUR</code></td>
		</tr>
		<tr>
			<td style="text-align: center;"><code>5</code></td>
			<td style="text-align: center;"><code>FIVE</code></td>
		</tr>
		<tr>
			<td style="text-align: center;"><code>6</code></td>
			<td style="text-align: center;"><code>SIX</code></td>
		</tr>
		<tr>
			<td style="text-align: center;"><code>7</code></td>
			<td style="text-align: center;"><code>SEVEN</code></td>
		</tr>
		<tr>
			<td style="text-align: center;"><code>8</code></td>
			<td style="text-align: center;"><code>EIGHT</code></td>
		</tr>
		<tr>
			<td style="text-align: center;"><code>9</code></td>
			<td style="text-align: center;"><code>NINE</code></td>
		</tr>
	</tbody>
</table>

<p>그런데 이런, 문자열을 보다가 그만 문자열을 적은 사람이 정신을 잃었다. 우리가 문자열을 보고 원래의 식을 계산해서 알려주자. 변환되기 전의 수식을 정확하게 판단하여 정답을 구할 수 있다면, 정답을 출력하자. 만약 변환되기 전의 수식으로 가능한 것이 없다면 <code>"</code><strong>Madness!</strong><code>"</code>를 출력하자.</p>

<p>변환되기 전의 수식은 양의 정수로 시작해서 양의 정수와 연산자가 번갈아서 등장하며, 마지막 연산자는 =이고, =은 수식의 마지막에만 등장한다. 등장하는 연산자는 +, -, x, /, =으로 총 5가지가 있다. 기존의 사칙연산 방식과는 다르게 앞에서부터 순서대로 계산이 이루어지며, / 연산의 결과로 정수가 아닌 수가 나오면 0에 가까운 방향으로 반올림된다. 예를 들어 1.8은 1로, -1.8은 -1로 반올림된다.</p>

### 입력 

 <p>영문 대문자 및 <code>+,-,x,/,=</code>로 이루어진 문자열이 주어진다. 문자열은 =로 끝나며, 연산자로 시작하지 않는다. =은 항상 문자열의 마지막에만 등장한다. 문자열의 시작 또는 연산자의 바로 다음에 <code>"ZERO"</code>가 등장하는 경우는 없다.</p>

<p>주어지는 문자열 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>S</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$S$</span></mjx-container>의 길이는 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c34"></mjx-c></mjx-mn><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c7C"></mjx-c></mjx-mo><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D446 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c7C"></mjx-c></mjx-mo><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c2264"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="4"><mjx-c class="mjx-c31"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="2"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>4</mn><mo>≤</mo><mo data-mjx-texclass="OPEN" fence="false" stretchy="false">|</mo><mi>S</mi><mo data-mjx-texclass="CLOSE" fence="false" stretchy="false">|</mo><mo>≤</mo><mn>100</mn><mo>,</mo><mn>000</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$4 ≤ \lvert S\rvert ≤ 100,000$</span></mjx-container> 이고, 문자열에 포함된 수는 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1$</span></mjx-container> 이상 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="2"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-mn class="mjx-n" space="2"><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c><mjx-c class="mjx-c30"></mjx-c></mjx-mn></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mn>1</mn><mo>,</mo><mn>000</mn><mo>,</mo><mn>000</mn></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$1,000,000$</span></mjx-container> 이하이다.</p>

### 출력 

 <p>변환되기 전의 수식으로 가능한 것이 없는 경우, <strong>Madness!</strong> 를 출력한다.</p>

<p>가능한 수식이 있을 경우, 첫 번째 줄에는 그 수식을 출력하고, 두 번째 줄에는 식의 계산값을 모든 숫자를 다시 영단어로 변환하여 출력한다.</p>


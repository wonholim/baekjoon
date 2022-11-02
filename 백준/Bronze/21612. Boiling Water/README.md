# [Bronze IV] Boiling Water - 21612 

[문제 링크](https://www.acmicpc.net/problem/21612) 

### 성능 요약

메모리: 30840 KB, 시간: 68 ms

### 분류

사칙연산(arithmetic), 구현(implementation), 수학(math)

### 문제 설명

<p>At sea level, atmospheric pressure is 100 kPa and water begins to boil at 100<sup>◦</sup>C. As you go above sea level, atmospheric pressure decreases, and water boils at lower temperatures. As you go below sea level, atmospheric pressure increases, and water boils at higher temperatures. A formula relating atmospheric pressure to the temperature at which water begins to boil is</p>

<p style="text-align: center;">P = 5 × B − 400</p>

<p>where P is atmospheric pressure measured in kPa, and B is the temperature at which water begins to boil measured in <sup>◦</sup>C.</p>

<p>Given the temperature at which water begins to boil, determine atmospheric pressure. Also determine if you are below sea level, at sea level, or above sea level.</p>

<p>Note that the science of this problem is generally correct but the values of 100<sup>◦</sup>C and 100 kPa are approximate and the formula is a simplification of the exact relationship between water’s boiling point and atmospheric pressure.</p>

### 입력 

 <p>The input is one line containing an integer B where B ≥ 80 and B ≤ 200. This represents the temperature in <sup>◦</sup>C at which water begins to boil.</p>

### 출력 

 <p>The output is two lines. The first line must contain an integer which is atmospheric pressure measured in kPa. The second line must contain the integer -1, 0, or 1. This integer represents whether you are below sea level, at sea level, or above sea level, respectively.</p>


# [Silver I] Goldbach’s conjecture - 6718 

[문제 링크](https://www.acmicpc.net/problem/6718) 

### 성능 요약

메모리: 18156 KB, 시간: 952 ms

### 분류

브루트포스 알고리즘(bruteforcing), 수학(math), 정수론(number_theory), 소수 판정(primality_test), 에라토스테네스의 체(sieve)

### 문제 설명

<p>For any even number n greater than or equal to 4, there exists at least one pair of prime numbers p<sub>1</sub> and p<sub>2</sub> such that</p>

<p style="text-align:center">n = p<sub>1</sub> + p<sub>2</sub></p>

<p>This conjecture has not been proved nor refused yet. No one is sure whether this conjecture actually holds. However, one can find such a pair of prime numbers, if any, for a given even number. The problem here is to write a program that reports the number of all the pairs of prime numbers satisfying the condition in the conjecture for a given even number.</p>

<p>A sequence of even numbers is given as input. There can be many such numbers. Corresponding to each number, the program should output the number of pairs mentioned above. Notice that we are interested in the number of essentially different pairs and therefore you should not count (p<sub>1</sub>, p<sub>2</sub>) and (p<sub>2</sub>, p<sub>1</sub>) separately as two different pairs.</p>

### 입력 

 <p>An integer is given in each input line. You may assume that each integer is even, and is greater than or equal to 4 and less than 2<sup>15</sup>. The end of the input is indicated by a number 0.</p>

### 출력 

 <p>Each output line should contain an integer number. No other characters should appear in the output.</p>


# [Silver III] Anagram - 25099 

[문제 링크](https://www.acmicpc.net/problem/25099) 

### 성능 요약

메모리: 125508 KB, 시간: 1080 ms

### 분류

자료 구조(data_structures), 해시를 사용한 집합과 맵(hash_set), 정렬(sorting), 문자열(string)

### 문제 설명

<p>Two words are anagrams if the letters of the first word can be reordered to obtain the second one. An instance of anagrams is the pair “listen” and “silent”.</p>

<p>You are given a list of words, each word consisting of lowercase letters. Your goal is to filter this list by dropping any word whose anagram has already appeared earlier on the list.</p>

### 입력 

 <p>The first line contains <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$n$</span></mjx-container>, the length of the list. This is followed by <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>n</mi></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$n$</span></mjx-container> lines, each containing one word.</p>

### 출력 

 <p>Print out the list of words without anagrams, one word per line. The words should appear in the same order as given in the input.</p>


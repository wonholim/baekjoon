# [Gold V] Length of Bundle Rope - 18149 

[문제 링크](https://www.acmicpc.net/problem/18149) 

### 성능 요약

메모리: 15184 KB, 시간: 172 ms

### 분류

자료 구조(data_structures), 그리디 알고리즘(greedy), 우선순위 큐(priority_queue)

### 문제 설명

<p>Due to the development of online shopping, the logistics industry which is highly connected with goods shipping has been so prosperous that the great amount of employees is needed. Therefore, Alex, a truck driver in this growing industry, was supposed to transport several parcels scattering in the warehouse to other cities in his daily routine.</p>

<p>According to the official safety requirements to the trucks running in the highway, Alex had to tie up all the packages tightly so that he could settle the goods safely on his truck. Alex knew that the length of the cords needed for bundling the packages on the truck was based on the size of the packages themselves. Also, n packages can be tied up well after n − 1 bundles. Moreover, when bundling goods, Alex could only bundle two packages at one time to avoid scattering. Since the daily consumption of the cord was great and Alex was supposed to pay for it, he hopes to bundle all the goods with the shortest cord.</p>

<p>For example, there are 4 parcels in the size of 8, 5, 14, and 26 respectively. If Alex binds the first two together, the needed rope will be in the length of 13 (8+5 = 13) while the needed rope for the latter two packages will be 40 (14 + 26 = 40). If Alex keeps bundling these two items, the rope length he needs will be 53 (13 + 40 = 53). So the total length of the 4 packages will be 106 (13 + 40 + 53 = 106). If Alex tries another way by bundling the first two (8 + 5 = 13), adding up the third one (13 + 14 = 27), and then bundling the last item (27 + 14 = 53), he will only need the cord in the length of 93 (13 + 27 + 53 = 93). Now your mission is to help Alex finding the minimum length of the needed cord.</p>

### 입력 

 <p>The first line contains an integer T indicating the number of test cases. Each test case contains two lines. The first one contains a positive integer n indicating the number of packages. The second one contains n positive integers separated by a space to indicate the size of each parcel.</p>

### 출력 

 <p>For each test case, output the minimum length of the bundle rope required to tie all parcels together in one line.</p>


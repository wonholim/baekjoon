number = int(input())
a = 0

for i in range(1, number + 1):
    if number % i == 0:
        a += i

print(a)

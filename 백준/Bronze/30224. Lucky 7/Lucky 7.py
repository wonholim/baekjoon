n = int(input())
c, d = '7' in str(n), n % 7 == 0
print(3 if c and d else 2 if c else 1 if d else 0)
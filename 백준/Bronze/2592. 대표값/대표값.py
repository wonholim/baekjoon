c = [0] * 10
sum = 0
for x in range(0, 10):
    c[x] = int(input())
    sum += c[x]
print(sum // 10)
print(max(c, key = c.count))

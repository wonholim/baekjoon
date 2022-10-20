a, b = map(int, input().split())
c = [0] * a
for x in range(0, b):
    d, e = map(int, input().split())
    d = d - 1
    e = e - 1
    c[d] = c[d] + 1
    c[e] = c[e] + 1
for x in c:
    print(x)
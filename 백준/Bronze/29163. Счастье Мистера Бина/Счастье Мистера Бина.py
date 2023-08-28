n, a = int(input()), sum(i % 2 for i in map(int, input().split()))
print(["Sad", "Happy"][n > 2 * a])
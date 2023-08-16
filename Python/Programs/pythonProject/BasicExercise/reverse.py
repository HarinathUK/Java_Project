n = int(input())
i = 0
j = 0
while n != 0:
    i = int(n % 10)
    j = j * 10
    j = j + i
    n = int(n / 10)
print(j)
# fibonacci series up to nth term
last_n = int(input())
n1, n2 = 0, 1
count = 0
while count <= last_n:
    print(n1)
    x = n1 + n2
    n1 = n2
    n2 = x
    count += 1

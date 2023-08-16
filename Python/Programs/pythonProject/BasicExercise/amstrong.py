k = input()
len_inp = len(k)
n = int(k)
i = 0
j = 0
while n != 0:
    i = int(n % 10)
    j = i ** len_inp + j
    n = int(n / 10)
print(j)
if int(k) == j:
    print("it is a amstrong number")
else:
    print("it is not a amstrong number")



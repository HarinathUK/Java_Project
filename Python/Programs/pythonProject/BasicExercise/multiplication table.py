# multiplication of any number up to 20
num = int(input())
for i in range(1, 21):
    table = num*i
    print(i, "*", num, "=", table)
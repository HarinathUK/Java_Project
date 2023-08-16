# print all prime numbers with an interval
first_num = int(input())
last_num = int(input())
for i in range(first_num, last_num):
    if i > 1:
        for j in range(2, int(i/2)):
            if int(i%j) == 0:
                break
        else:
            print(i)


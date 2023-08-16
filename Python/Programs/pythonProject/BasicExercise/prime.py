a = int(input())
prime = True
for i in range(2,int(a/2)):
    if int(a%i) == 0:
        prime = False
        break
if prime == True:
    print("it is a prime number")
else:
    print("it is not a prime number")























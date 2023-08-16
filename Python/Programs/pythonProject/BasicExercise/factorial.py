num = int(input())
factorial = 1
if num < 0:
    print("The factorial does not exist with negative number")
elif num == 0:
    print("Factorial number of zero is one")
else:
    for i in range(1, num+1):
        factorial = factorial * i
    print("The factorial of", num, "is:", factorial)
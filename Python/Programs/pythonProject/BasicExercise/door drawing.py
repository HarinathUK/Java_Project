arr = list(map(int, input().split()))
a = arr[0]
b = arr[1]
c = '.|.'
d = '-'
for i in range(a//2):
    print((((((b-3)//2)-(i*(b//a)))*d).ljust((0))+(i*c).rjust(0)+c+(i*c).ljust(0))+((((b-3)//2)-(i*(b//a)))*d).rjust(0))
print((((b-7)//2)*d).ljust(0)+'WELCOME'+(((b-7)//2)*d).rjust(0))
for i in range(a//2):
    print(((((b//(b//3))+(i*(b//a)))*d).ljust(0)+((((a//2-1)-i)*c).ljust(0))+c+(((a//2-1)-i)*c).rjust(0))+(((b//(b//3)+(i*(b//a)))*d).rjust(0)))
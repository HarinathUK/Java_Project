size = int(input())
c = '*'
for i in range(size):
    print((c*i).rjust(size)+c+(c*i).ljust(size))
for i in range(size):
    print(((c*(size-i-2)).rjust(size))+(c*(size-i-1)).ljust(size))
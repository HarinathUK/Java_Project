rows = int(input())
k = rows
for i in range(0, rows):
  for j in range(0, k):
    print(end=" ")
  k = k - 1
  for j in range(0, i+1):
    print('*', end=" ")
  print("")
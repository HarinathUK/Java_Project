rows = int(input())
k = rows
for i in range(0, rows):
  for j in range(0, k-1):
    print(end=" ")
  k = k - 1
  for j in range(0, i+1):
    print('*', end=" ")
  print("")
for i in reversed(range(0, rows)):
  for j in reversed(range(0, k+1)):
    print(end= " ")
  k = k+1
  for j in reversed(range(1, i+1)):
    print('*', end= " ")
  print("")

terms = int(input())
result = list(map(lambda x: 2 ** x, range(terms)))
for i in result:
  print(i)
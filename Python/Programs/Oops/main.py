import textwrap
def wrap(string, max_width):
  s = string
  w = max_width
  list_1 = []
  for i in range(0, len(s), w):
    list_1.append(string[i:i + w])
  for j in range(0,(len(list_1)-1)):
      print(list_1[j])
  return (list_1[len(list_1)-1])


if __name__ == '__main__':
  string, max_width = input(), int(input())
  result = wrap(string, max_width)
  print(result)
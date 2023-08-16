def print_formatted(number):
  l = len((bin(number)[2:]))
  for i in range(1, number + 1):
    a = oct(i)[2:]
    b = hex(i)[2:].upper()
    c = bin(i)[2:]
    print(f'{str(i).rjust(l)} {a.rjust(l)} {b.rjust(l)} {c.rjust(l)}')



if __name__ == '__main__':
  n = int(input())
  print_formatted(n)
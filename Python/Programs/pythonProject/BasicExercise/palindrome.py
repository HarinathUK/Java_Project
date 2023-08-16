# check palindrome number
num = int(input('enter a number: '))
temp = num
rev = 0
while num>0:
    x = num%10
    rev = rev*10+x
    num = num//10
if temp == rev:
        print("it is a palindrome number")
else:
        print("it is not a palindrome number")


# check palindrome name
# name = "madam"
# if name[::-1] == name:
#     print("it is a palindrome word")
# else:
#     print("it is not a palindrome word")

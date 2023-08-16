#operator overloading
# a = 5
# b = 6
# print(int.__add__(a,b))

class Student:
    def __init__(self,m1,m2):
        self.m1 = m1
        self.m2 = m2
    def __add__(self, other):
        m1 = self.m1 + other.m1
        m2 = self.m2 + other.m2
        s3 = Student(m1,m2)
        return s3

s1 = Student(45,48)
s2 = Student(55,67)

s3 = s1 + s2  #Student__add__(s1,s2)
print(s3.m1)


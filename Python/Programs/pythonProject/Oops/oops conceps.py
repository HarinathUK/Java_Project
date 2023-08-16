# class Computer:          # class name
#     def config(self):    # methods(functions)
#         print("i5, 16gb, 1 TB")
#
#
# com1 = Computer()         # com1 is the object
#
#
# com1.config()

#
#
# class Computer:
#
#     def __init__(self):
#         self.name = "navin"
#         self.age = 28
#
#     def compare(self, other):
#         if self.age == other.age:
#             return True
#         else:
#             return False
#
# c1 = Computer()
# c1.age = 30
# c2 = Computer()
# if c1.compare(c2):   # compare(who is calling, whom to compare)
#     print("they are same")
# else:
#     print("they are different")
#
# print(c1.name)
# print(c2.name)


# class Car:
#     wheels = 4     #class variables
#     def __init__(self):
#         self.mil = 10        # instance variables
#         self.com = "BMW"     # instance variables
# c1 = Car()
# c2 = Car()
# c1.mil = 8
#print(c1.com, c1.mil, c1.wheels)
#print(c2.com, c2.mil, c2.wheels)


# methods
# instance methods
# class methods
# static methods
#
# class Student:
#     school = 'Telusko'
#
#
#     def __init__(self,m1,m2,m3):
#         self.m1 = m1
#         self.m2 = m2
#         self.m3 = m3
#
#     def avg(self):        # instance method
#         return (self.m1 + self.m2 + self.m3)/3
#
#     @classmethod
#     def getschool(cls):         # class method
#         return cls.school
#     @staticmethod
#     def info():            # static method
#         print("This is Student class")
#
#     # def get_m1(self):
#     #     return self.m1
#     # def set_m1(self,value):
#     #     self.m1 = value
#
# s1 = Student(55,45,37)
# s2 = Student(89,32,12)
#
#
# print(s1.avg())
# print(Student.getschool())
# Student.info()

# class in class
# you can create object of inner class inside the outer class or
# you can create object of inner class outside the outer class provided you use outer class named to call it
# class Student:
#     def __init__(self,name,rollno):
#         self.name = name
#         self.rollno = rollno
#         self.lap = self.Laptop()
#
#
#     def show(self):
#         print(self.name, self.rollno)
#         self.lap.show()
#
#     class Laptop:
#         def __init__(self):
#             self.brand = 'hp'
#             self.cpu = 'i5'
#             self.ram = 8
#
#         def show(self):
#             print(self.brand, self.cpu, self.ram)
#
# s1 = Student('hari',2,)
# s2 = Student('sai',3)
#
# s1.show()

# inheritance
# Multilevel inheritance

# class A:                  # parent class
#     def feature1(self):
#         print("Feature1 is working")
#     def feature2(self):
#         print("Feature2 is working")
#
# class B(A):               # child class(can access feature of A)
#     def feature3(self):
#         print("Feature3 is working")
#     def feature4(self):
#         print("Feature4 is working")
# class C(B):              # grand child(can access all A,B feature)
#     def feature5(self):
#         print("feature5 is working")
#
# # Multiple inheritance
#
# class B:               # now B also a parent class( can't access from class A)
#     def feature3(self):
#         print("Feature3 is working")
#     def feature4(self):
#         print("Feature4 is working")
# class C(A,B):              # grand child(can access all A,B feature)
#     def feature5(self):
#         print("feature5 is working")
#
#
# a1 = A()
#
# a1.feature1()
# a1.feature2()
#
# b1 = B()
# b1.
# c1 = C()
# c1.

# Constructor in inheritance
# subclass can access all the features of super class but
# super class can not access any feature of subclass
# If you create object of subclass it will first try finds init subclass
# if it is not found then it will call init of superclass
# when you create object of subclass it will call init of subclass first
# you have call super then it will first call init of super class then init of subclass
# if we try using class C with multiple inheritance first prefer to call init of class C and
# it will call init of class A because it prefers left to right this is calling Method Resolution Order.
# class A:
#     def __init__(self):
#         print("In a Init")
#
#     def feature1(self):
#          print("Feature1 is working")
#     def feature2(self):
#          print("Feature2 is working")
#
# class B(A):
#
#     def __init__(self):
#         super().__init__()      # call super class first
#         print("In b Init")
#     def feature3(self):
#          print("Feature3 is working")
#     def feature4(self):
#             print("Feature4 is working")
#
# a1 = B()










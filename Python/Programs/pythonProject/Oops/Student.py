
class Student:

  def __init__(self, name, m1=None, lap=None):
    print("from init")
    self.name = name
    self.m1 = m1
    self.lap = lap

  def showLaptopBrand(self):
    return self.lap.brand

  class Laptop:

    def __init__(self, ram, brand):
      self.ram = ram
      self.brand = brand

class Tablet:

  def __init__(self, ram, brand):
    self.ram = ram
    self.brand = brand

s1 = Student("Hari", 56, Student.Laptop("12GB", "HP"))
print(s1.name, s1.lap.brand)
print(s1.showLaptopBrand())

s2 = Student("Sai", 45, Tablet("2GB", "Apple"))

print(s2.showLaptopBrand())



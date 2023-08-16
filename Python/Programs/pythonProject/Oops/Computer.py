# Class
  # 1. Attiributes/ Fields/ Properties
  # 2. Behaviour/ Methods/ Function

## Class start
class Computer:
  displayType = "LED" #Class variable
  def __init__(self, name, ram):
    print("from parameter init")
    self.name = name # Instance variable
    self.ram = ram

  def show(self):
    header = "OBJ:" # Local variable
    print(header+"{"+self.displayType+"; "+self.name + "; " + self.ram+"}")
    #print(self)

  #def setup(self, name, ram):
  #  self.name = name
  #  self.ram = ram

### Class end

c1 = Computer("Sai", "8GB")
c2 = Computer("Hari", "12GB")
c2.displayType = "LCD"

#Computer.show(c1)
#c1.init();
#c1.setup("HP", "12GB")
c1.show()
c2.show()


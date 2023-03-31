from math import pi
class Circle:
    def __init__(self, radius=1.0, color="red"):
        self.radius = radius
        self.color = color
    
    def getRadius(self):
        return self.radius
    
    def getArea(self):
        return self.radius ** 2 * pi
    
class TestCircle:
    def main(self):
        c1 = Circle()
        print("The circle has radius of " + str(c1.getRadius()) + " and area of " + str(c1.getArea()))

        c2 = Circle(2.0)
        print("The circle has radius of " + str(c2.getRadius()) + " and area of " + str(c2.getArea()))

# create an instance of TestCircle and call its main() method
tc = TestCircle()
tc.main()
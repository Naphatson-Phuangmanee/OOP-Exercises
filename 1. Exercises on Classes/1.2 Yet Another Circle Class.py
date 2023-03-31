class Circle:
    def __init__(self, radius=1.0):
        self.radius = radius

    def getRadius(self):
        return self.radius

    def setRadius(self, radius):
        self.radius = radius
    
    def getArea(self):
        return self.radius ** 2 * 3.14159265358979323846

    def getCircumference(self):
        return self.radius * 2 * 3.14159265358979323846

    def __str__(self):
        return "Circle[radius=" + str(self.radius) + "]"

class TestCircle:
    def main(self):
        # Test Constructors and toString()
        c1 = Circle(1.1)
        print(c1)   # toString()
        c2 = Circle() # default constructor
        print(c2)

        # Test setter and getter
        c1.setRadius(2.2)
        print(c1)      # toString()
        print("radius is:", c1.getRadius())

        # Test getArea() and getCircumference()
        print("area is: {:.2f}".format(c1.getArea()))
        print("circumference is: {:.2f}".format(c1.getCircumference()))

# create an instance of TestCircle and call its main() method
tc = TestCircle()
tc.main()
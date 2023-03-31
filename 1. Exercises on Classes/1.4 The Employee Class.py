class Employee:
    def __init__(self, id, firstName, lastName, salary):
        self.id = id
        self.firstName = firstName
        self.lastName = lastName
        self.salary = salary

    def getID(self):
        return self.id

    def setID(self, id):
        self.id = id

    def getFirstName(self):
        return self.firstName

    def setFirstName(self, firstName):
        self.firstName = firstName

    def getLastName(self):
        return self.lastName

    def setLastName(self, lastName):
        self.lastName = lastName

    def getSalary(self):
        return self.salary

    def setSalary(self, salary):
        self.salary = salary

    def getName(self):
        return f"{self.firstName} {self.lastName}"

    def getAnnualSalary(self):
        return self.salary * 12

    def raiseSalary(self, percent):
        self.salary += ((self.salary * percent) // 100)
        return self.salary

    def __str__(self):
        return f"Employee[id={self.id},name={self.firstName} {self.lastName},salary={self.salary}]"


if __name__ == '__main__':
    # Test constructor and __str__()
    e1 = Employee(8, "Peter", "Tan", 2500)
    print(e1)

    # Test Setters and Getters
    e1.setSalary(999)
    print(e1)
    print("id is:", e1.getID())
    print("firstname is:", e1.getFirstName())
    print("lastname is:", e1.getLastName())
    print("salary is:", e1.getSalary())

    print("name is:", e1.getName())
    print("annual salary is:", e1.getAnnualSalary())  # Test method

    # Test raiseSalary()
    print(e1.raiseSalary(10))
    print(e1)
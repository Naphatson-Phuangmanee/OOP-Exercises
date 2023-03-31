import datetime

class Date:
    def __init__(self, day, month, year):
        self.day = day
        self.month = month
        self.year = year
        
    def getDay(self):
        return self.day
    
    def setDay(self, day):
        self.day = day
        
    def getMonth(self):
        return self.month
    
    def setMonth(self, month):
        self.month = month
        
    def getYear(self):
        return self.year
    
    def setYear(self, year):
        self.year = year
        
    def setDate(self, day, month, year):
        self.day = day
        self.month = month
        self.year = year
        
    def __str__(self):
        date = datetime.date(self.year, self.month, self.day)
        return date.strftime("%d/%m/%Y")

class TestDate:
    def main():
        # Test constructor and __str__()
        d1 = Date(1, 2, 2014)
        print(d1)  # __str__()
        
        # Test setters and getters
        d1.setMonth(12)
        d1.setDay(9)
        d1.setYear(2099)
        print(d1)  # __str__()
        print("Month:", d1.getMonth())
        print("Day:", d1.getDay())
        print("Year:", d1.getYear())
        
        # Test setDate()
        d1.setDate(3, 4, 2016)
        print(d1)  # __str__()

TestDate.main()
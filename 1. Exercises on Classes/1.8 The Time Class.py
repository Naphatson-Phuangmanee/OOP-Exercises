from datetime import datetime, timedelta

class Time:
    def __init__(self, hour, minute, second):
        self.hour = hour
        self.minute = minute
        self.second = second

    def getHour(self):
        return self.hour

    def setHour(self, hour):
        self.hour = hour

    def getMinute(self):
        return self.minute

    def setMinute(self, minute):
        self.minute = minute

    def getSecond(self):
        return self.second

    def setSecond(self, second):
        self.second = second

    def setTime(self, hour, minute, second):
        self.hour = hour
        self.minute = minute
        self.second = second

    def nextSecond(self):
        time = datetime(1, 1, 1, self.hour, self.minute, self.second)
        time += timedelta(seconds=1)
        self.hour = time.hour
        self.minute = time.minute
        self.second = time.second
        return self

    def previousSecond(self):
        time = datetime(1, 1, 1, self.hour, self.minute, self.second)
        time -= timedelta(seconds=1)
        self.hour = time.hour
        self.minute = time.minute
        self.second = time.second
        return self

    def __str__(self):
        timeString = "{:02d}:{:02d}:{:02d}".format(self.hour, self.minute, self.second)
        return timeString


class TestTime:
    def main():
        # Test constructors and toString()
        t1 = Time(1, 2, 3)
        print(t1)

        # Test Setters and Getters
        t1.setHour(4)
        t1.setMinute(5)
        t1.setSecond(6)
        print(t1)
        print("Hour: ", t1.getHour())
        print("Minute: ", t1.getMinute())
        print("Second: ", t1.getSecond())

        # Test setTime()
        t1.setTime(23, 59, 58)
        print(t1)

        # Test nextSecond();
        print(t1.nextSecond())
        print(t1.nextSecond().nextSecond())

        # Test previousSecond()
        print(t1.previousSecond())
        print(t1.previousSecond().previousSecond())

if __name__ == '__main__':
    TestTime.main()
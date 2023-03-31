class InvoiceItem:
    def __init__(self, id, desc, qty, unitPrice):
        self.id = id
        self.desc = desc
        self.qty = qty
        self.unitPrice = unitPrice
    
    def getID(self):
        return self.id
    
    def setID(self, id):
        self.id = id
    
    def getDesc(self):
        return self.desc
    
    def setDesc(self, desc):
        self.desc = desc
    
    def getQty(self):
        return self.qty
    
    def setQty(self, qty):
        self.qty = qty
    
    def getUnitPrice(self):
        return self.unitPrice
    
    def setUnitPrice(self, unitPrice):
        self.unitPrice = unitPrice
    
    def getTotal(self):
        return self.unitPrice * self.qty
    
    def __str__(self):
        return "InvoiceItem[id=" + self.id + ",desc=" + self.desc + ",qty=" + str(self.qty) + ",unitPrice=" + str(self.unitPrice) + "]"

# Test constructor and toString()
inv1 = InvoiceItem("A101", "Pen Red", 888, 0.08)
print(inv1)

# Test Setters and Getters
inv1.setQty(999)
inv1.setUnitPrice(0.99)
print(inv1)
print("id is: " + inv1.getID())
print("desc is: " + inv1.getDesc())
print("qty is: " + str(inv1.getQty()))
print("unitPrice is: " + str(inv1.getUnitPrice()))

# Test getTotal()
print("The total is: " + str(inv1.getTotal()))
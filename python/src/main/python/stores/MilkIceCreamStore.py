from IceCreamStore import IceCreamStore
from icecreams.milk import *

class MilkIceCreamStore(IceCreamStore):

    def __init__(self):
        super().__init__()

    def createIceCream(flavor):
        if flavor == "Strawberry" :
            return StrawberryMilkIceCream()
        elif flavor == "Pineapple" :
            return PineappleMilkIceCream()
        elif flavor == "Mango" :
            return MangoMilkIceCream()
        elif flavor == "Guava" :
            return GuavaMilkIceCream()
        
        return None
    
    def prepareCone(flavor):
        super().prepareCone(flavor)
    
            
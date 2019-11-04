from IceCreamStore import *
from icecreams.milk import *

class MilkIceCreamStore(IceCreamStore):

    def createIceCream(flavor):
        if flavor == "Strawberry" :
            return StrawberryMilkIceCream()
        else if flavor == "Pineapple" :
            return PineappleMilkIceCream()
        else if flavor == "Mango" :
            return MangoMilkIceCream()
        else if flavor == "Guava" :
            return GuavaMilkIceCream()
        
        return None
    
            
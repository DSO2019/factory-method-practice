from IceCreamStore import *
from icecreams.water import *

class WaterIceCreamStore(IceCreamStore):

    def createIceCream(flavor):
        if flavor == "Strawberry" :
            return StrawberryWaterIceCream()
        else if flavor == "Pineapple" :
            return PineappleWaterIceCream()
        else if flavor == "Mango" :
            return MangoWaterIceCream()
        else if flavor == "Guava" :
            return GuavaWaterIceCream()
        
        return None
    
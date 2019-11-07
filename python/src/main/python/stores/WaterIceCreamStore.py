from icecream.water.GuavaWaterIceCream import *
from icecream.water.MangoWaterIceCream import *
from icecream.water.PineappleWaterIceCream import *
from icecream.water.StrawberryWaterIceCream import *
from IceCreamStore import *


class WaterIceCreamStore(IceCreamStore):
    def createIceCream(self, flavor):
        if (flavor == "Strawberry"):
            return StrawberryWaterIceCream()
        elif (flavor == "Pineapple"):
            return PineappleWaterIceCream()
        elif (flavor == "Mango"):
            return MangoWaterIceCream()
        elif (flavor == "Guava"):
            return GuavaWaterIceCream()
        return None

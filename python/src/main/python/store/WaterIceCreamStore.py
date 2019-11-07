from icecream.water.GuavaWaterIceCream import *
from icecream.water.MangoWaterIceCream import *
from icecream.water.PineappleWaterIceCream import *
from icecream.water.StrawberryWaterIceCream import *
from IceCreamStore import *


class WaterIceCreamStore(IceCreamStore):
    def createIceCream(self, selectedFlavor):
        if (selectedFlavor == "Strawberry"):
            return StrawberryWaterIceCream()
        elif (selectedFlavor == "Pineapple"):
            return PineappleWaterIceCream()
        elif (selectedFlavor == "Mango"):
            return MangoWaterIceCream()
        elif (selectedFlavor == "Guava"):
            return GuavaWaterIceCream()
        return None
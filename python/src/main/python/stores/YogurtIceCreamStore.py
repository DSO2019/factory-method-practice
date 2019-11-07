from icecream.yogurt.GuavaYogurtIceCream import *
from icecream.yogurt.MangoYogurtIceCream import *
from icecream.yogurt.PineappleYogurtIceCream import *
from icecream.yogurt.StrawberryYogurtIceCream import *
from IceCreamStore import *


class YogurtIceCreamStore(IceCreamStore):
    def createIceCream(self, flavor):
        if (flavor == "Strawberry"):
            return StrawberryYogurtIceCream()
        elif (flavor == "Pineapple"):
            return PineappleYogurtIceCream()
        elif (flavor == "Mango"):
            return MangoYogurtIceCream()
        elif (flavor == "Guava"):
            return GuavaYogurtIceCream()
        return None

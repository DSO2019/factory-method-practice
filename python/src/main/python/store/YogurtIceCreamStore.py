from icecream.yogurt.GuavaYogurtIceCream import *
from icecream.yogurt.MangoYogurtIceCream import *
from icecream.yogurt.PineappleYogurtIceCream import *
from icecream.yogurt.StrawberryYogurtIceCream import *
from IceCreamStore import *


class YogurtIceCreamStore(IceCreamStore):
    def createIceCream(self, selectedFlavor):
        if (selectedFlavor == "Strawberry"):
            return StrawberryYogurtIceCream()
        elif (selectedFlavor == "Pineapple"):
            return PineappleYogurtIceCream()
        elif (selectedFlavor == "Mango"):
            return MangoYogurtIceCream()
        elif (selectedFlavor == "Guava"):
            return GuavaYogurtIceCream()
        return None
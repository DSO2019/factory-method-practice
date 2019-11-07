from icecreams.MilkIceCreams import *
from icecreams.WaterIceCreams import *
from icecreams.YogurtIceCreams import *
from IceCreamStore import *


class MilkIceCreamStore(IceCreamStore):
    def createIceCream(self, selectedFlavor):
        if (selectedFlavor == "Strawberry"):
            return StrawberryMilkIceCream()
        elif (selectedFlavor == "Pineapple"):
            return PineappleMilkIceCream()
        elif (selectedFlavor == "Mango"):
            return MangoMilkIceCream()
        elif (selectedFlavor == "Guava"):
            return GuavaMilkIceCream()
        return None


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

st = YogurtIceCreamStore()
print(st.createIceCream("Strawberry").getFlavor())

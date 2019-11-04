from IceCreamStore import *
from StrawberryWaterIceCream import *
from PineappleWaterIceCream import *
from MangoWaterIceCream import *
from GuavaWaterIceCream import *


class WaterIceCreamStore(IceCreamStore):

    def createIceCream(self, flavor):
        if flavor == 'Strawberry':
            return StrawberryWaterIceCream()
        elif flavor == 'Pineapple':
            return PineappleWaterIceCream()
        elif flavor == 'Mango':
            return MangoWaterIceCream()
        elif flavor == 'Guava':
            return GuavaWaterIceCream()
        return None

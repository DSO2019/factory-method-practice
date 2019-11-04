from IceCreamStore import *
from StrawberryMilkIceCream import *
from PineappleMilkIceCream import *
from MangoMilkIceCream import *
from GuavaMilkIceCream import *


class MilkIceCreamStore(IceCreamStore):

    def createIceCream(self, flavor):
        if flavor == 'Strawberry':
            return StrawberryMilkIceCream()
        elif flavor == 'Pineapple':
            return PineappleMilkIceCream()
        elif flavor == 'Mango':
            return MangoMilkIceCream()
        elif flavor == 'Guava':
            return GuavaMilkIceCream()
        return None

from IceCreamStore import *
from StrawberryYougurtIceCream import *
from PineappleYougurtIceCream import *
from MangoYougurtIceCream import *
from GuavaYougurtIceCream import *


class YougurtIceCreamStore(IceCreamStore):

    def createIceCream(self, flavor):
        if flavor == 'Strawberry':
            return StrawberryYougurtIceCream()
        elif flavor == 'Pineapple':
            return PineappleYougurtIceCream()
        elif flavor == 'Mango':
            return MangoYougurtIceCream()
        elif flavor == 'Guava':
            return GuavaYougurtIceCream()
        return None

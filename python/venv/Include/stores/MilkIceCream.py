from ..IceCreamStore import *
from ..icecreams.milk.GuavaMilkIceCream import *
from ..icecreams.milk.MangoMilkIceCream import *
from ..icecreams.milk.NoFlavorMilkIceCream import *
from ..icecreams.milk.PineappleMilkIceCream import *
from ..icecreams.milk.StrawberryMilkIceCream import *

class MilkIceCream(IceCreamStore):

    def iceCreamFlavor(self, flavor):
        if(flavor == "Guava"):
            return GuavaMilkIceCream()
        else:
            if(flavor == "Mango"):
                return MangoMilkIceCream()
            else:
                if(flavor == "Pineapple"):
                    return PineappleMilkIceCream()
                else:
                    if(flavor == "Strawberry"):
                        return StrawberryMilkIceCream()
                    else:
                        return NoFlavorMilkIceCream()


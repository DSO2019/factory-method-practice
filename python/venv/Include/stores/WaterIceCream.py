from ..IceCreamStore import *
from ..icecreams.water.GuavaWaterIceCream import *
from ..icecreams.water.MangoWaterIceCream import *
from ..icecreams.water.NoFlavorWaterIceCream import *
from ..icecreams.water.PineappleWaterIceCream import *
from ..icecreams.water.StrawberryWaterIceCream import *

class YogurthIceCream(IceCreamStore):

    def serveCone(self, flavor):
        if(flavor == "Guava"):
            return GuavaWaterIceCream()
        else:
            if(flavor == "Mango"):
                return MangoWaterIceCream()
            else:
                if(flavor == "Pineapple"):
                    return PineappleWaterIceCream()
                else:
                    if(flavor == "Strawberry"):
                        return StrawberryWaterIceCream()
                    else:
                        return NoFlavorWaterIceCream()


from ..IceCreamStore import *
from ..icecreams.yogurth.GuavaYogurthIceCream import *
from ..icecreams.yogurth.MangoYogurthIceCream import *
from ..icecreams.yogurth.NoFlavorYogurthIceCream import *
from ..icecreams.yogurth.PineappleYogurthIceCream import *
from ..icecreams.yogurth.StrawberryYogurthIceCream import *

class YogurthIceCream(IceCreamStore):

    def serveCone(self, flavor):
        if(flavor == "Guava"):
            return GuavaYogurthIceCream()
        else:
            if(flavor == "Mango"):
                return MangoYogurthIceCream()
            else:
                if(flavor == "Pineapple"):
                    return PineappleYogurthIceCream()
                else:
                    if(flavor == "Strawberry"):
                        return StrawberrYogurthIceCream()
                    else:
                        return NoFlavorYogurthIceCream()


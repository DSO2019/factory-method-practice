using factory_method.main.icecreams;
using factory_method.main.icecreams.water;
using System;
using System.Collections.Generic;
using System.Text;

namespace factory_method.main.stores
{
    class WaterStore : IceCreamStore
    {
        /**
         * Implementation of function createIceCream.
         */
    override
    protected IceCream createIceCream(String flavor)
        {
            if (flavor.Equals("Strawberry"))
            {
                return new StrawberryWaterIceCream();
            }
            else if (flavor.Equals("Pineapple"))
            {
                return new PineappleWaterIceCream();
            }
            else if (flavor.Equals("Mango"))
            {
                return new MangoWaterIceCream();
            }
            else if (flavor.Equals("Guava"))
            {
                return new GuavaWaterIceCream();
            }
            return null;
        }
    }
}

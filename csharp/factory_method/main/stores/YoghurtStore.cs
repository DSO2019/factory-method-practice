using factory_method.main.icecreams;
using factory_method.main.icecreams.yoghurt;
using System;
using System.Collections.Generic;
using System.Text;

namespace factory_method.main.stores
{
    class YoghurtStore : IceCreamStore
    {
        /**
         * Implementation of function createIceCream.
         */
    override
    protected IceCream createIceCream(String flavor)
        {
            if (flavor.Equals("Strawberry"))
            {
                return new StrawberryYoghurtIceCream();
            }
            else if (flavor.Equals("Pineapple"))
            {
                return new PineappleYoghurtIceCream();
            }
            else if (flavor.Equals("Mango"))
            {
                return new MangoYoghurtIceCream();
            }
            else if (flavor.Equals("Guava"))
            {
                return new GuavaYoghurtIceCream();
            }
            return null;
        }
    }
}

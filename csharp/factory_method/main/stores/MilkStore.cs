using factory_method.main.icecreams;
using factory_method.main.icecreams.milk;
using System;
using System.Collections.Generic;
using System.Text;

namespace factory_method.main.stores
{
    class MilkStore : IceCreamStore
    {
        /**
         * Implementation of function createIceCream.
         */
        override
        protected IceCream createIceCream(String flavor)
        {
            if (flavor.Equals("Strawberry"))
            {
                return new StrawberryMilkIceCream();
            }
            else if (flavor.Equals("Pineapple"))
            {
                return new PineappleMilkIceCream();
            }
            else if (flavor.Equals("Mango"))
            {
                return new MangoMilkIceCream();
            }
            else if (flavor.Equals("Guava"))
            {
                return new GuavaMilkIceCream();
            }
            return null;
        }
    }
}

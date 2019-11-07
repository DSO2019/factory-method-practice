﻿using factorymethod.main.icecreams;
using factorymethod.main.icecreams.milk;

namespace factorymethod.main.stores
{
    internal class MilkIceCreamStore : IceCreamStore
    {
        override
            protected IceCream createIceCream(string flavor)
        {
            if (flavor.Equals("Strawberry"))
            {
                return new StrawberryMilkIceCream();
            }

            if (flavor.Equals("Pineapple"))
            {
                return new PineappleMilkIceCream();
            }
            if (flavor.Equals("Mango"))
            {
                return new MangoMilkIceCream();
            }
            return flavor.Equals("Guava") ? new GuavaMilkIceCream() : null;
        }

    }
}
}

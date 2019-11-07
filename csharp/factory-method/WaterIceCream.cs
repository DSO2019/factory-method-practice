using factorymethod.main.icecreams;
using factorymethod.main.icecreams.water;

namespace factorymethod.main.stores
{
    internal class WaterceCreamStore : IceCreamStore
    {
        override
            protected IceCream createIceCream(string flavor)
        {
            if (flavor.Equals("Strawberry"))
            {
                return new StrawberryWaterIceCream();
            }

            if (flavor.Equals("Pineapple"))
            {
                return new PineappleWaterIceCream();
            }
            if (flavor.Equals("Mango"))
            {
                return new MangoWaterIceCream();
            }
            return flavor.Equals("Guava") ? new GuavaWaterIceCream() : null;
        }

    }
}
}
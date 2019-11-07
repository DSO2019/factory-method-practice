using factorymethod.main.icecreams;
using factorymethod.main.icecreams.yogurt;

namespace factorymethod.main.stores
{
    internal class YogurtIceCreamStore : IceCreamStore
    {
        override
            protected IceCream createIceCream(string flavor)
        {
            if (flavor.Equals("Strawberry"))
            {
                return new StrawberryYogurtIceCream();
            }

            if (flavor.Equals("Pineapple"))
            {
                return new PineappleYogurtIceCream();
            }
            if (flavor.Equals("Mango"))
            {
                return new MangoYogurtIceCream();
            }
            return flavor.Equals("Guava") ? new GuavaYogurtIceCream() : null;
        }

    }
}
}
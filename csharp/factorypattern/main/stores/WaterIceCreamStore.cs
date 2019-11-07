using factorypattern.main.icecreams;
using factorypattern.main.icecreams.water;

namespace factorypattern.main.stores
{
    internal class WaterIceCreamStore : IceCreamStore
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

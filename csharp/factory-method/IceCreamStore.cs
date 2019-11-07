using System;
using factorymethod.main.icecreams;

namespace factorymethod.main
{
    internal class IceCreamStore
    {
        public Cone prepareCone(string flavor)
        {
            var cone = new Cone();
            var iceCream = createIceCream(flavor);
            cone.addIceCream(iceCream);
            cone.serve();
            return cone;
        }

        protected abstract IceCream createIceCream(string flavor);
    }

}
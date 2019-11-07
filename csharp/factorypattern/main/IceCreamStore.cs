using factorypattern.main.icecreams;

namespace factorypattern.main
{
    internal abstract class IceCreamStore
    {
        public Cone prepareCone(string flavor)
        {
            var cone = new Cone();
            var iceCream = createIceCream(flavor);
            Cone.prepare();
            cone.addIceCream(iceCream);
            cone.serve();
            return cone;
        }

        protected abstract IceCream createIceCream(string flavor);
    }
}

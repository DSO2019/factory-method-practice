using factory_method.main.icecreams;
using System;
using System.Collections.Generic;
using System.Text;

namespace factory_method.main
{
    abstract class IceCreamStore
    {
        /**
         * @return Cone. PrepareCone function.
         * @param flavor IceCream flavor.
         */
        public Cone prepareCone(String flavor)
        {
            IceCream iceCream;
            Cone cone = new Cone();
            iceCream = createIceCream(flavor);
            cone.prepare();
            cone.addIceCream(iceCream);
            cone.serve();
            return cone;
        }
        /**
         * @return IceCream. Creates ice cream of a certain flavor.
         * @param flavor IceCream flavor.
         */
        protected abstract IceCream createIceCream(String flavor);
    }
}

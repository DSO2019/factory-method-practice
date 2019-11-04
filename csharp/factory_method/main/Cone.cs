using factory_method.main.icecreams;
using System;
using System.Collections.Generic;
using System.Text;

namespace factory_method.main
{
    class Cone
    {
        /**
         * IceCream variable.
         */
        IceCream iC;
        /**
         * Prepare method.
         */
        public String prepare()
        {
            Console.WriteLine("Preparing cone");
            return "Preparing cone";
        }
        /**
         * Adding ice cream method.
         * @param iceCream ice cream.
         */
        public void addIceCream(IceCream iceCream)
        {
            this.iC = iceCream;
        }
        /**
         * Serving method.
         */
        public String serve()
        {
            Console.WriteLine("Serving..." + iC.getName());
            return "Serving..." + iC.getName();
        }
        /**
         * @return ice cream. Get ice cream method.
         */
        public IceCream getIceCream()
        {
            return iC;
        }
    }
}

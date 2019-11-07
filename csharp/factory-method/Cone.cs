using System;
using factorymethod.main.icecreams;

namespace factorymethod.main
{
    internal class Cone
    {
        private IceCream ic;

        public static string prepare()
        {
            Console.WriteLine("Preparing Cone");
        }

        public void addIceCream(IceCream iceCream)
        {
            this.ic = iceCream;
        }

        public string serve()
        {
            Console.WriteLine("Sirviendo" );
        }

        public IceCream getIceCream()
        {
            return this.ic;
        }
    }

}
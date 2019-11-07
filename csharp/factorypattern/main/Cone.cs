using System;
using factorypattern.main.icecreams;


namespace factorypattern.main
{
    internal class Cone
    {
        private IceCream _iceCream;

        public static string prepare()
        {
            Console.WriteLine("Preparando cono...");
            return "preparando cono...";
        }

        public void addIceCream(IceCream iceCream2)
        {
            _iceCream = iceCream2;
        }

        public string serve()
        {
            Console.WriteLine("Sirviendo cono... " + _iceCream.getName());
            return "Sirviendo cono... " + _iceCream.getName();
        }

        public IceCream getIceCream()
        {
            return _iceCream;
        }

    }
}

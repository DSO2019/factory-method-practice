using System;
using factorypattern.main;
using factorypattern.main.stores;

namespace factorypattern.test
{
    class IceCreamTestDrive
    {
        public static void main(String[] args)
        {
            MilkIceCreamStore milkIceCreamStore = new MilkIceCreamStore();
            WaterIceCreamStore waterIceCreamStore = new WaterIceCreamStore();
            YogurtIceCreamStore yogurtIceCreamStore = new YogurtIceCreamStore();

            Cone cono = milkIceCreamStore.prepareCone("Guava");

            Console.WriteLine("El primer cono es de: " + cono.getIceCream().getName());
            Console.WriteLine();

            cono = waterIceCreamStore.prepareCone("Pineapple");

            Console.WriteLine("El segundo cono es de: " + cono.getIceCream().getName());
            Console.WriteLine();

            cono = yogurtIceCreamStore.prepareCone("Strawberry");

            Console.WriteLine("El tercer cono es de: " + cono.getIceCream().getName());
            Console.WriteLine();


        }
    }
}

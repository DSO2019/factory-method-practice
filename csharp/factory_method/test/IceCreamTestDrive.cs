using factory_method.main;
using factory_method.main.stores;
using System;
using System.Collections.Generic;
using System.Text;

namespace factory_method.test
{
    class IceCreamTestDrive
    {
        public static void Main(String[] args)
        {
            MilkStore milkStore = new MilkStore();
            WaterStore waterStore = new WaterStore();
            YoghurtStore yoghurtStore = new YoghurtStore();

            Cone cone = milkStore.prepareCone("Mango");

            Console.WriteLine("First cone is: " + cone.getIceCream().getName());
            Console.WriteLine();
            Console.WriteLine();

            cone = waterStore.prepareCone("Strawberry");

            Console.WriteLine("Second cone is: " + cone.getIceCream().getName());
            Console.WriteLine();
            Console.WriteLine();

            cone = yoghurtStore.prepareCone("Guava");
            Console.WriteLine("Third cone is: " + cone.getIceCream().getName());
            Console.WriteLine();
            Console.WriteLine();

            cone = waterStore.prepareCone("Pineapple");
            Console.WriteLine("Fourth cone is: " + cone.getIceCream().getName());
            Console.WriteLine();
            Console.WriteLine();
        }
        
    }
}

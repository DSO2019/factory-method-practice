using factory_method.main;
using factory_method.main.stores;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;

namespace factory_method.test.stores
{
    class WaterStoreTest
    {
        WaterStore waterStore;
        Cone cone;

        [SetUp]
        public void SetUp()
        {
            waterStore = new WaterStore();
            cone = new Cone();
        }
        [TestCase]
        public void MilkTest()
        {
            cone = waterStore.prepareCone("Guava");
            Assert.AreEqual("Guava Water Ice Cream", cone.getIceCream().getName());
            cone = waterStore.prepareCone("Mango");
            Assert.AreEqual("Mango Water Ice Cream", cone.getIceCream().getName());
            cone = waterStore.prepareCone("Pineapple");
            Assert.AreEqual("Pineapple Water Ice Cream", cone.getIceCream().getName());
            cone = waterStore.prepareCone("Strawberry");
            Assert.AreEqual("Strawberry Water Ice Cream", cone.getIceCream().getName());
        }
    }
}

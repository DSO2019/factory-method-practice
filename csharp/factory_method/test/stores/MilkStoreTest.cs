using factory_method.main;
using factory_method.main.stores;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;

namespace factory_method.test.stores
{
    [TestFixture]
    class MilkStoreTest
    {
        MilkStore milkStore;
        Cone cone;

        [SetUp]
        public void SetUp()
        {
            milkStore = new MilkStore();
            cone = new Cone();
        }
        [TestCase]
        public void MilkTest()
        {
            cone = milkStore.prepareCone("Guava");
            Assert.AreEqual("Guava Milk Ice Cream", cone.getIceCream().getName());
            cone = milkStore.prepareCone("Mango");
            Assert.AreEqual("Mango Milk Ice Cream", cone.getIceCream().getName());
            cone = milkStore.prepareCone("Pineapple");
            Assert.AreEqual("Pineapple Milk Ice Cream", cone.getIceCream().getName());
            cone = milkStore.prepareCone("Strawberry");
            Assert.AreEqual("Strawberry Milk Ice Cream", cone.getIceCream().getName());
        }

    }
}

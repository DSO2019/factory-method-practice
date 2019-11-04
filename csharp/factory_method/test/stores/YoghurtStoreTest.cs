using factory_method.main;
using factory_method.main.stores;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;

namespace factory_method.test.stores
{
    class YoghurtStoreTest
    {
        YoghurtStore yoghurtStore;
        Cone cone;

        [SetUp]
        public void SetUp()
        {
            yoghurtStore = new YoghurtStore();
            cone = new Cone();
        }
        [TestCase]
        public void MilkTest()
        {
            cone = yoghurtStore.prepareCone("Guava");
            Assert.AreEqual("Guava Yoghurt Ice Cream", cone.getIceCream().getName());
            cone = yoghurtStore.prepareCone("Mango");
            Assert.AreEqual("Mango Yoghurt Ice Cream", cone.getIceCream().getName());
            cone = yoghurtStore.prepareCone("Pineapple");
            Assert.AreEqual("Pineapple Yoghurt Ice Cream", cone.getIceCream().getName());
            cone = yoghurtStore.prepareCone("Strawberry");
            Assert.AreEqual("Strawberry Yoghurt Ice Cream", cone.getIceCream().getName());
        }
    }
}

using factorypattern.main;
using factorypattern.main.stores;
using NUnit.Framework;

namespace factorypattern.test.stores
{
    internal class MilkIceCreamStoreTest
    {
        private MilkIceCreamStore _milkIceCreamStore;
        private Cone _cono;

        [SetUp]
        public void setUp()
        {
            _milkIceCreamStore = new MilkIceCreamStore();
            _cono = new Cone();
        }

        [TestCase]
        public void yogurtStoreTest()
        {
            _cono = _milkIceCreamStore.prepareCone("Mango");
            Assert.AreEqual("Mango Milk Ice Cream", _cono.getIceCream().getName());
            _cono = _milkIceCreamStore.prepareCone("Pineapple");
            Assert.AreEqual("Pineapple Milk Ice Cream", _cono.getIceCream().getName());
            _cono = _milkIceCreamStore.prepareCone("Strawberry");
            Assert.AreEqual("Strawberry Milk Ice Cream", _cono.getIceCream().getName());
            _cono = _milkIceCreamStore.prepareCone("Guava");
            Assert.AreEqual("Guava Milk Ice Cream", _cono.getIceCream().getName());

        }
    }
}


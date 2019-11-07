using NUnit.Framework;
using factorypattern.main;
using factorypattern.main.stores;

namespace factorypattern.test.stores
{
    internal class WaterIceCreamStoreTest
    {
        private WaterIceCreamStore _waterIceCreamStore;
        private Cone _cono;

        [SetUp]
        public void setUp()
        {
            _waterIceCreamStore = new WaterIceCreamStore();
            _cono = new Cone();
        }

        [TestCase]
        public void waterStoreTest()
        {
            _cono = _waterIceCreamStore.prepareCone("Mango");
            Assert.AreEqual("Mango Water Ice Cream", _cono.getIceCream().getName());
            _cono = _waterIceCreamStore.prepareCone("Pineapple");
            Assert.AreEqual("Pineapple Water Ice Cream", _cono.getIceCream().getName());
            _cono = _waterIceCreamStore.prepareCone("Strawberry");
            Assert.AreEqual("Strawberry Water Ice Cream", _cono.getIceCream().getName());
            _cono = _waterIceCreamStore.prepareCone("Guava");
            Assert.AreEqual("Guava Water Ice Cream", _cono.getIceCream().getName());

        }
    }
}

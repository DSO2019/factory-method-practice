using NUnit.Framework;
using factorypattern.main;
using factorypattern.main.stores;

namespace factorypattern.test.stores
{
    [TestFixture]
    internal class YogurtIceCreamStoreTest
    {
        private YogurtIceCreamStore _yogurtIceCreamStore;
        private Cone _cono;

        [SetUp]
        public void setUp()
        {
            _yogurtIceCreamStore = new YogurtIceCreamStore();
            _cono = new Cone();
        }

        [TestCase]
        public void yogurtStoreTest()
        {
            _cono = _yogurtIceCreamStore.prepareCone("Mango");
            Assert.AreEqual("Mango Yogurt Ice Cream", _cono.getIceCream().getName());
            _cono = _yogurtIceCreamStore.prepareCone("Pineapple");
            Assert.AreEqual("Pineapple Yogurt Ice Cream", _cono.getIceCream().getName());
            _cono = _yogurtIceCreamStore.prepareCone("Strawberry");
            Assert.AreEqual("Strawberry Yogurt Ice Cream", _cono.getIceCream().getName());
            _cono = _yogurtIceCreamStore.prepareCone("Guava");
            Assert.AreEqual("Guava Yogurt Ice Cream", _cono.getIceCream().getName());

        }
    }
}

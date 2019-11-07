using factorypattern.main.icecreams;
using NUnit.Framework;

namespace factorypattern.test.icecreams
{
    internal class IceCreamTest
    {
        private IceCream _iceCream;
        
        [SetUp]
        public void setUp()
        {
            _iceCream = new IceCream();
        }

        [TestCase]
        public void testName()
        {
            Assert.AreEqual("Icecream" , _iceCream.getName());
        }
        

    }
}

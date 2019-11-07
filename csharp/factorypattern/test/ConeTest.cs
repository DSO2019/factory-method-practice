using factorypattern.main;
using NUnit.Framework;

namespace factorypattern.test
{
    [TestFixture]
    internal class ConeTest
    {
        private Cone _cono;
        [SetUp]
        public void setUp()
        {
            _cono = new Cone();
        }

        [TestCase]
        public void prepareTest()
        {
            Assert.AreEqual("Preparando cono...", Cone.prepare());
        }

        [TestCase]
        public void serveTest()
        {
            Assert.AreEqual("Sirviendo cono...", _cono.serve());
        }
    }
}

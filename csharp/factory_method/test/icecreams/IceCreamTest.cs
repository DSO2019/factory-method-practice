using factory_method.main.icecreams;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;

namespace factory_method.test.icecreams
{
    [TestFixture]
    class IceCreamTest
    {
        private IceCream iC;

        [SetUp]
        public void SetUp()
        {
            iC = new IceCream();
        }
        [TestCase]
        public void TestName()
        {
            Assert.AreEqual("Any IceCream", iC.getName());
        }
    }
}

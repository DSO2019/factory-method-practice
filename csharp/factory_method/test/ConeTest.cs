using factory_method.main;
using factory_method.main.icecreams;
using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Text;

namespace factory_method.test
{
    [TestFixture]
    class ConeTest
    {
        IceCream ic;
        Cone cone;

        [SetUp]
        public void SetUp()
        {
            ic = new IceCream();
            cone = new Cone();
        }
        [TestCase]
        public void prepareTest()
        {
            Assert.AreEqual("Preparing cone", cone.prepare());
        }
        [TestCase]
        public void serveTest()
        {
            Assert.AreEqual("Serving...Any IceCream", cone.serve());
        }

    }
}

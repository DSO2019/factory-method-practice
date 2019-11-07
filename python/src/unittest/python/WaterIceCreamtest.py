import unittest
from stores.IceCreamStores import WaterIceCreamStore


class WaterStoreTest(unittest.TestCase):

    def setUp(self):
        self.store = WaterIceCreamStore()

    def testGuavaWaterIceCream(self):
        cone = self.store.prepareCone("Guava")
        self.assertEquals(cone.getIceCream().getFlavor(), "Guava Water")

    def testMangoWaterIceCream(self):
        cone = self.store.prepareCone("Mango")
        self.assertEquals(cone.getIceCream().getFlavor(), "Mango Water")

    def testPineappleWaterIceCream(self):
        cone = self.store.prepareCone("Pineapple")
        self.assertEquals(cone.getIceCream().getFlavor(), "Pineapple Water")

    def testStrawberryWaterIceCream(self):
        cone = self.store.prepareCone("Strawberry")
        self.assertEquals(cone.getIceCream().getFlavor(), "Strawberry Water")

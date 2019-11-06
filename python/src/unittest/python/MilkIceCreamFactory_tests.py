import unittest
from stores.IceCreamStores import MilkIceCreamStore

class MilkStoreTest(unittest.TestCase):

    def setUp(self):
        self.store = MilkIceCreamStore()

    def testGuavaMilkIceCream(self):
        cone = self.store.prepareCone("Guava")
        self.assertEquals(cone.getIceCream().getFlavor(), "Guava Milk")

    def testMangoMilkIceCream(self):
        cone = self.store.prepareCone("Mango")
        self.assertEquals(cone.getIceCream().getFlavor(), "Mango Milk")

    def testPineappleMilkIceCream(self):
        cone = self.store.prepareCone("Pineapple")
        self.assertEquals(cone.getIceCream().getFlavor(), "Pineapple Milk")

    def testStrawberryMilkIceCream(self):
        cone = self.store.prepareCone("Strawberry")
        self.assertEquals(cone.getIceCream().getFlavor(), "Strawberry Milk")

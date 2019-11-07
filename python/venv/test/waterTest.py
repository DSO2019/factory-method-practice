import unittest.mock
from Include.stores.WaterIceCream import *


class waterTest(unittest.TestCase):

    def setUp(self):
        self.store = IceCreamStore()

    def test_GuavaWaterIceCream(self):
        cone = self.store.prepareCone("Guava")
        self.assertEquals(cone.getFlavor(), "Guava water ice cream")

    def test_MangoWaterIceCream(self):
        cone = self.store.prepareCone("Mango")
        self.assertEquals(cone.getFlavor(), "Mango water ice cream")

    def test_NoFlavorWaterIceCream(self):
        cone = self.store.prepareCone("")
        self.assertEquals(cone.getFlavor(), "No flavor water ice cream")

    def test_PineappleWaterIceCream(self):
        cone = self.store.prepareCone("Pineapple")
        self.assertEquals(cone.getFlavor(), "Pineapple water ice cream")

    def test_StrawberryWaterIceCream(self):
        cone = self.store.prepareCone("Strawberry")
        self.assertEquals(cone.getFlavor(), "Strawberry water ice cream")
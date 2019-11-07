import unittest.mock
from Include.stores.WaterIceCream import *


class YogurthTest(unittest.TestCase):

    def setUp(self):
        self.store = IceCreamStore()

    def test_GuavaYogurthIceCream(self):
        cone = self.store.prepareCone("Guava")
        self.assertEquals(cone.getFlavor(), "Guava yogurth ice cream")

    def test_MangoYogurthIceCream(self):
        cone = self.store.prepareCone("Mango")
        self.assertEquals(cone.getFlavor(), "Mango yogurth ice cream")

    def test_NoFlavorYogurthIceCream(self):
        cone = self.store.prepareCone("")
        self.assertEquals(cone.getFlavor(), "No flavor yogurth ice cream")

    def test_PineappleYogurthIceCream(self):
        cone = self.store.prepareCone("Pineapple")
        self.assertEquals(cone.getFlavor(), "Pineapple yogurth ice cream")

    def test_StrawberryYogurthIceCream(self):
        cone = self.store.prepareCone("Strawberry")
        self.assertEquals(cone.getFlavor(), "Strawberry yogurth ice cream")
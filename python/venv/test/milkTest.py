import unittest.mock
from Include.stores.MilkIceCream import *


class milkTest(unittest.TestCase):

    def setUp(self):
        self.store = IceCreamStore()

    def test_GuavaMilkIceCream(self):
        cone = self.store.prepareCone("Guava")
        self.assertEquals(cone.getFlavor(), "Guava milk ice cream")

    def test_MangoMilkIceCream(self):
        cone = self.store.prepareCone("Mango")
        self.assertEquals(cone.getFlavor(), "Mango milk ice cream")

    def test_NoFlavorMilkIceCream(self):
        cone = self.store.prepareCone("")
        self.assertEquals(cone.getFlavor(), "No flavor milk ice cream")

    def test_PineappleMilkIceCream(self):
        cone = self.store.prepareCone("Pineapple")
        self.assertEquals(cone.getFlavor(), "Pineapple milk ice cream")

    def test_StrawberryMilkIceCream(self):
        cone = self.store.prepareCone("Strawberry")
        self.assertEquals(cone.getFlavor(), "Strawberry milk ice cream")
from mockito import mock, verify, when
import unittest
from store.MilkIceCreamStore import *


class MilkIceCreamStoreTest(unittest.TestCase):

    def setUp(self):
        self.store = MilkIceCreamStore()

    def guavaMilkIceCreamTest(self):
        cone = self.store.prepareCone("Guava")
        self.assertEquals(cone.getIceCream().getFlavor(), "Leche -> Guayaba")

    def mangoMilkIceCreamTest(self):
        cone = self.store.prepareCone("Mango")
        self.assertEquals(cone.getIceCream().getFlavor(), "Leche -> Mango")

    def pineappleMilkIceCreamTest(self):
        cone = self.store.prepareCone("Pineapple")
        self.assertEquals(cone.getIceCream().getFlavor(), "Leche -> Piña")

    def strawberryMilkIceCreamTest(self):
        cone = self.store.prepareCone("Strawberry")
        self.assertEquals(cone.getIceCream().getFlavor(), "Leche -> Fresa")
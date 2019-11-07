from mockito import mock, verify, when
import unittest
from store.WaterIceCreamStore import *


class WaterIceCreamStoreTest(unittest.TestCase):

    def setUp(self):
        self.store = WaterIceCreamStore()

    def guavaWaterIceCreamTest(self):
        cone = self.store.prepareCone("Guava")
        self.assertEquals(cone.getIceCream().getFlavor(), "Agua -> Guayaba")

    def mangoWaterIceCreamTest(self):
        cone = self.store.prepareCone("Mango")
        self.assertEquals(cone.getIceCream().getFlavor(), "Agua -> Mango")

    def pineappleWaterIceCreamTest(self):
        cone = self.store.prepareCone("Pineapple")
        self.assertEquals(cone.getIceCream().getFlavor(), "Agua -> Piña")

    def strawberryWaterIceCreamTest(self):
        cone = self.store.prepareCone("Strawberry")
        self.assertEquals(cone.getIceCream().getFlavor(), "Agua -> Fresa")
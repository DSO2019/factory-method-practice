from mockito import mock, verify, when
import unittest
from store.YogurtIceCreamStore import *


class YogurtIceCreamStoreTest(unittest.TestCase):

    def setUp(self):
        self.store = YogurtIceCreamStore()

    def guavaYogurtIceCreamTest(self):
        cone = self.store.prepareCone("Guava")
        self.assertEquals(cone.getIceCream().getFlavor(), "Yogurt -> Guayaba")

    def mangoYogurtIceCreamTest(self):
        cone = self.store.prepareCone("Mango")
        self.assertEquals(cone.getIceCream().getFlavor(), "Yogurt -> Mango")

    def pineappleYogurtIceCreamTest(self):
        cone = self.store.prepareCone("Pineapple")
        self.assertEquals(cone.getIceCream().getFlavor(), "Yogurt -> Piña")

    def strawberryYogurtIceCreamTest(self):
        cone = self.store.prepareCone("Strawberry")
        self.assertEquals(cone.getIceCream().getFlavor(), "Yogurt -> Fresa")
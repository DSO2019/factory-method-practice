from mockito import mock, verify, when
import unittest
from store.YogurtIceCreamStore import *


class YogurtStoreTest(unittest.TestCase):

    def setUp(self):
        self.store = YogurtIceCreamStore()

    def testGuavaYogurtIceCream(self):
        cone = self.store.prepareCone("Guava")
        self.assertEquals(cone.getIceCream().getFlavor(), "Guava Yogurt")

    def testMangoYogurtIceCream(self):
        cone = self.store.prepareCone("Mango")
        self.assertEquals(cone.getIceCream().getFlavor(), "Mango Yogurt")

    def testPineappleYogurtIceCream(self):
        cone = self.store.prepareCone("Pineapple")
        self.assertEquals(cone.getIceCream().getFlavor(), "Pineapple Yogurt")

    def testStrawberryYogurtIceCream(self):
        cone = self.store.prepareCone("Strawberry")
        self.assertEquals(cone.getIceCream().getFlavor(), "Strawberry Yogurt")

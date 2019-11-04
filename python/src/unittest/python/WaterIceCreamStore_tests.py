from mockito import mock, verify, when
import unittest
from WaterIceCreamStore import *


class WaterIceCreamStoreTest(unittest.TestCase):

    def setUp(self):
        self.store = WaterIceCreamStore()

    def testGuavaWaterIceCream(self):
        cone = self.store.prepareCone('water', 'Guava')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Guava Water Ice Cream')

    def testMangoWaterIceCream(self):
        cone = self.store.prepareCone('water', 'Mango')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Mango Water Ice Cream')

    def testPineappleWaterIceCream(self):
        cone = self.store.prepareCone('water', 'Pineapple')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Pineapple Water Ice Cream')

    def testStrawberryWaterIceCream(self):
        cone = self.store.prepareCone('water', 'Strawberry')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Strawberry Water Ice Cream')

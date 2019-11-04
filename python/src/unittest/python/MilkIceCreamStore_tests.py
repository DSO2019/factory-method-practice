from mockito import mock, verify, when
import unittest
from MilkIceCreamStore import *


class MilkIceCreamStoreTest(unittest.TestCase):

    def setUp(self):
        self.store = MilkIceCreamStore()

    def testGuavaMilkIceCream(self):
        cone = self.store.prepareCone('milk', 'Guava')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Guava Milk Ice Cream')

    def testMangoMilkIceCream(self):
        cone = self.store.prepareCone('milk', 'Mango')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Mango Milk Ice Cream')

    def testPineappleMilkIceCream(self):
        cone = self.store.prepareCone('milk', 'Pineapple')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Pineapple Milk Ice Cream')

    def testStrawberryMilkIceCream(self):
        cone = self.store.prepareCone('milk', 'Strawberry')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Strawberry Milk Ice Cream')

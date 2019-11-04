from mockito import mock, verify, when
import unittest
from YougurtIceCreamStore import *


class YougurtIceCreamStoreTest(unittest.TestCase):

    def setUp(self):
        self.store = YougurtIceCreamStore()

    def testGuavaYougurtIceCream(self):
        cone = self.store.prepareCone('yougurt', 'Guava')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Guava Yougurt Ice Cream')

    def testMangoYougurtIceCream(self):
        cone = self.store.prepareCone('yougurt', 'Mango')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Mango Yougurt Ice Cream')

    def testPineappleYougurtIceCream(self):
        cone = self.store.prepareCone('yougurt', 'Pineapple')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Pineapple Yougurt Ice Cream')

    def testStrawberryYougurtIceCream(self):
        cone = self.store.prepareCone('yougurt', 'Strawberry')
        self.assertEquals(cone.getIceCream()
                              .getFlavor(), 'Strawberry Yougurt Ice Cream')

from mockito import mock, verify, when
import unittest

from stores import WaterIceCreamStore

class WaterIceCream_tests(unittest.TestCase):

    def setUp(self):
        self.waterStore = WaterIceCreamStore()
    
    def test_strawberry(self):
        self.assertEqual("Strawberry Water Ice Cream", self.waterStore.prepareCone("Straberry").getCone())

    def test_guava(self):
        self.assertEqual("Guava Water Ice Cream", self.waterStore.prepareCone("Guava").getCone())

    def test_mango(self):
        self.assertEqual("Mango Water Ice Cream", self.waterStore.prepareCone("Mango").getCone())

    def test_pineapple(self):
        self.assertEqual("Pineapple Water Ice Cream", self.waterStore.prepareCone("Pineapple").getCone())
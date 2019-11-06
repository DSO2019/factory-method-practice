from mockito import mock, verify, when
import unittest

from stores import MilkIceCreamStore

class MilkIceCream_tests(unittest.TestCase):

    def setUp(self):
        self.milkStore = MilkIceCreamStore()
    
    def test_strawberry(self):
        self.assertEqual("Strawberry Milk Ice Cream", self.milkStore.prepareCone("Straberry").getCone())

    def test_guava(self):
        self.assertEqual("Guava Milk Ice Cream", self.milkStore.prepareCone("Guava").getCone())

    def test_mango(self):
        self.assertEqual("Mango Milk Ice Cream", self.milkStore.prepareCone("Mango").getCone())

    def test_pineapple(self):
        self.assertEqual("Pineapple Milk Ice Cream", self.milkStore.prepareCone("Pineapple").getCone())
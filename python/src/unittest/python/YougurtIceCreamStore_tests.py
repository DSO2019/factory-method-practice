from mockito import mock, verify, when
import unittest

from stores import YougurtIceCreamStore

class YougurtIceCream_tests(unittest.TestCase):

    def setUp(self):
        self.yougurtStore = YougurtIceCreamStore()
    
    def test_strawberry(self):
        self.assertEqual("Strawberry Yougurt Ice Cream", self.yougurtStore.prepareCone("Straberry").getCone())

    def test_guava(self):
        self.assertEqual("Guava Yougurt Ice Cream", self.yougurtStore.prepareCone("Guava").getCone())

    def test_mango(self):
        self.assertEqual("Mango Yougurt Ice Cream", self.yougurtStore.prepareCone("Mango").getCone())

    def test_pineapple(self):
        self.assertEqual("Pineapple Yougurt Ice Cream", self.yougurtStore.prepareCone("Pineapple").getCone())
from unittest import TestCase
from exercise1 import total_expenses

class TestExercise(TestCase):

    def test_exercise(self):
        result = total_expenses("example.dat", 2020)

        self.assertEqual(result[0]*result[1], 514579)

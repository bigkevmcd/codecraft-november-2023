from unittest import TestCase
from exercise1 import move_submarine

class TestExercise(TestCase):

    def test_exercise(self):
        result = move_submarine("exercise1.dat")

        self.assertEqual(result[0] * result[1], 150)

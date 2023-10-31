import pytest


def multiply(a, b):
    return a * b

@pytest.mark.parametrize('a, b, result', [
    (1, 1, 1),
    (2, -2, -4),
    (3, 3, 9),
    (0, 2, 0)])
def test_multiply(a, b, result):
    assert multiply(a, b) == result

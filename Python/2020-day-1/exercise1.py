def total_expenses(file: str, total: int) -> list[int]:
    """
    Find the two expenses that add up to total in a file of expenses.

    Returns the two expenses that add up to the specified total.
    """
    parsed = parse_expenses(file)

    raise NotImplementedError

def parse_expenses(file: str) -> list[int]:
    """
    Parse a file with integer values separated by newlines into a list of
    integers.
    """
    with open(file) as f:
        parsed = []
        for line in f.readlines():
            parsed.append(int(line))

    return parsed

from collections import namedtuple

Instruction = namedtuple("Instruction", ["op", "delta"])

def move_submarine(file: str) -> tuple[int,int]:
    """
    Process a set of instructions to move a submarine around a playfield.

    Returns the x, y co-ordinates of the submarine after processing the
    instructions in the provided file.
    """
    parsed = parse_instructions(file)

    raise NotImplementedError

def parse_instructions(file: str) -> list[Instruction]:
    """
    Parse a file with instructions in the form of command and distance.
    e.g. forward 5 -> ("forward", 5)
    """
    with open(file) as f:
        parsed = []
        for line in f.readlines():
            elements = line.split()
            parsed.append(Instruction(elements[0], int(elements[1])))

    return parsed

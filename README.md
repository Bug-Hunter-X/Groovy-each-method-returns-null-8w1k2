# Groovy 'each' Method Unexpected Null Return

This repository demonstrates a common unexpected behavior of the `each` method in Groovy.  The `each` method iterates over a collection, but it does not return a modified collection. Instead it returns `null`, often leading to unexpected null pointer exceptions.  This example highlights this behavior and shows a simple solution using `collect`.

## How to Reproduce

1. Clone the repository.
2. Run `bug.groovy` using Groovy. You'll notice that the output is null instead of the expected modified list.
3. Examine `bugSolution.groovy` for a correction using `collect`.

## Solution

Use the `collect` method instead of `each` to create a new list with transformed elements.
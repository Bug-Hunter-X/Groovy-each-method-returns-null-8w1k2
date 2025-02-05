def list = [1, 2, 3, 4, 5]

def newList = list.collect { it * 2 }

println newList

// Expected output: [2, 4, 6, 8, 10]
// Actual output: [2, 4, 6, 8, 10]
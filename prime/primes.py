import time
from math import sqrt

def calculate_primes():
    start = time.time()
    count = 0
    for i in range(1, 10_000_001):
        if is_prime(i):
            count += 1
    print(f"Python:    \tThere are {count} prime numbers between 1 and 10_000_000. It took {time.time() - start} s.")

def is_prime(n: int) -> bool:
    if n <= 1:
        return False
    for i in range(2, int(sqrt(n)) + 2):
        if n % i == 0:
            return False
    return True

if __name__ == "__main__":
    calculate_primes()
    calculate_primes()
    calculate_primes()
    calculate_primes()
    calculate_primes()
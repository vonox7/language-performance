#include <stdio.h>
#include <math.h>
#include <time.h>

int isPrime(int n) {
    if (n <= 1) {
        return 0;
    }
    for (int i = 2; i < sqrt(n) + 1; i++) {
        if (n % i == 0) {
            return 0;
        }
    }
    return 1;
}

void calculatePrimes() {
    clock_t start = clock();
    int count = 0;
    for (int i = 1; i <= 10000000; i++) {
        if (isPrime(i)) {
            count++;
        }
    }
    printf("C:         \tThere are %d prime numbers between 1 and 10_000_000. It took %f s.\n", count, (double)(clock() - start) / CLOCKS_PER_SEC);
}

int main() {
    calculatePrimes();
    calculatePrimes();
    calculatePrimes();
    calculatePrimes();
    calculatePrimes();
    return 0;
}
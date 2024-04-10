function calculatePrimes() {
    const start = Date.now();
    let count = 0;
    for (let i = 1; i <= 10_000_000; i++) {
        if (isPrime(i)) {
            count++;
        }
    }
    console.log(`JavaScript:\tThere are ${count} prime numbers between 1 and 10_000_000. It took ${(Date.now() - start) / 1000} s.`);
}

function isPrime(n) {
    if (n <= 1) {
        return false;
    }
    for (let i = 2; i < Math.sqrt(n) + 1; i++) {
        if (n % i === 0) {
            return false;
        }
    }
    return true;
}

calculatePrimes();
calculatePrimes();
calculatePrimes();
calculatePrimes();
calculatePrimes();
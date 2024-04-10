gcc -O3 primes.c && ./a.out
rustc primes.rs -C opt-level=3 && ./primes
kotlinc-native primes.kt -o primeskt -opt && ./primeskt.kexe Kotlin/Native
kotlinc primes.kt -include-runtime -d output.jar && java -jar output.jar Kotlin/JVM
node primes.js
python3 primes.py
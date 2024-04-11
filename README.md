# Microbenchmark of different programming languages: Testing if a number is prime

Run via `bash benchmark`.

Results on a Macbook M1 Pro with C as baseline (average performance with outliers removed):

The numbers stay comparable, no matter if 1M, 10M or 30M numbers are tested.

* C: 100%
* Rust: 101%
* Kotlin/Native: 102%
* JS/Bun: 107%
* Kotlin/JVM: 141%
* Kotlin/WASM: 151% (Kotlin 2.0-RC1, executed in Chrome)
* JS/Node: 153%
* Python: 5026%

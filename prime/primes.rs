use std::time::Instant;

fn main() {
    calculate_primes();
    calculate_primes();
    calculate_primes();
    calculate_primes();
    calculate_primes();
}

fn calculate_primes() {
    let start = Instant::now();
    let mut count = 0;
    for i in 1..10_000_000 {
        if is_prime(i) {
            count += 1;
        }
    }
    println!("Rust:      \tThere are {} prime numbers between 1 and 10_000_000. It took {:.3} s.", count, start.elapsed().as_secs_f64());
}

fn is_prime(n: i32) -> bool {
    if n <= 1 {
        return false;
    }
    for i in 2..((n as f64).sqrt() as i32 + 1) {
        if n % i == 0 {
            return false;
        }
    }
    true
}

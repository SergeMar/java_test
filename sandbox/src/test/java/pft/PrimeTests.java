package pft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeTests {

    @Test
    public void testPrime() {
        Assertions.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
    }

    @Test
    public void testPrimeFast() {
        Assertions.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
    }

    @Test
    public void testNonPrime() {
        Assertions.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
    }

}

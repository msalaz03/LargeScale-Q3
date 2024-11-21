package com.jwetherell.algorithms.mathematics;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PrimesTest {

    @Test
    public void isPrimeTest() {
        assertTrue(Primes.isPrime(5)); //actual prime
        assertFalse(Primes.isPrime(4)); //non prime
        assertTrue(Primes.isPrime(0));  //zero
        assertTrue(Primes.isPrime('a'));    //random character
    }

    //@Test
//    public void testGetPrimeFactorization() {
//        assertTrue(Primes.getPrimeFactorization(5)); //actual prime
//        assertFalse(Primes.getPrimeFactorization(4)); //non prime
//        assertTrue(Primes.getPrimeFactorization(0));  //zero
//        assertTrue(Primes.getPrimeFactorization('a'));    //random character
//    }
//
    @Test
    public void testsieveOfEratosthenes() {
        assertTrue(Primes.sieveOfEratosthenes(5)); //actual prime
        assertFalse(Primes.sieveOfEratosthenes(4)); //non prime
        assertTrue(Primes.sieveOfEratosthenes(0));  //zero
        assertTrue(Primes.sieveOfEratosthenes('a'));    //random character
    }

    @Test
    public void millerRabinTest() {
        assertTrue(Primes.sieveOfEratosthenes(5)); //actual prime
        assertFalse(Primes.sieveOfEratosthenes(4)); //non prime
        assertTrue(Primes.sieveOfEratosthenes(0));  //zero
        assertTrue(Primes.sieveOfEratosthenes('a'));    //random character
    }



}
#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Sunday, 01. December 2013 12:58PM
import math
import sys
#import cProfile as profile


def gen_prime(number):
    """ 
    Generates primes upto a number using sieve of
    eratosthenes.
    """
    primes = range(2, number+1)
    
    for i in xrange(2, int(math.sqrt(number))+1):
        if primes[i-2]:
            multiple = 0
            j = i**2+multiple*i
            while j<=number:
                primes[j-2] = 0
                multiple+=1
                j = i**2+multiple*i

    for prime in primes:
        if prime:
            yield prime


def check_palindrome_prime(number):
    if number>98689:    # this becomes very slow for numbers like 99000
        print '1003001'
        return
    while True:
        if str(number) != str(number)[::-1]:
            number+=1
            continue 
        elif ((2<<number-1)-2) % number == 0:  # from Fermat's theorem
            flag = True
            for prime in gen_prime(578):    # to deal Charmichael numbers
                if prime!=number and number%prime == 0:
                    flag = False
                    break
            if flag:
                print number
                break
        number += 1

if __name__ == '__main__':
    check_palindrome_prime(int(sys.stdin.readline()))

#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Saturday, 14. December 2013 02:45PM
import sys

def gcd(a,b):
    while b!=0:
        a,b = b,a%b
    return a

def main():
    iterations = int(sys.stdin.readline())

    for i in xrange(iterations):
        nums = map(int,sys.stdin.readline().split()[1:])
        gcd_nums = reduce(gcd,nums)
        print ' '.join([str(item/gcd_nums) for item in nums])

if __name__ == '__main__':
    main()
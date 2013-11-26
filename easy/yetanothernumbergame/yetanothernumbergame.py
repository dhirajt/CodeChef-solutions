#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Monday, 25. November 2013 11:12PM
import sys

def main():
    iterations = int(raw_input())

    for line in xrange(iterations):
        N = int(sys.stdin.readline())

        if N % 2 == 0:
            print 'ALICE'
        else:
            print 'BOB'

if __name__ == '__main__':
    main()
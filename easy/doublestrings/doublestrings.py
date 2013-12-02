#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Monday, 02. December 2013 12:41PM
import sys

def main():
    iterations = int(sys.stdin.readline())

    for iteration in xrange(iterations):
        item = int(sys.stdin.readline())

        if item%2 == 0:
            print item
        else:
            print item-1

if __name__ == '__main__':
    main()
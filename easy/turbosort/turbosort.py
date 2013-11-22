#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Saturday, 23. November 2013 12:16AM
import sys

def main():
    iterations = int(raw_input())

    numbers = [ int(item) for item in sys.stdin ]
    numbers.sort()

    for number in numbers:
        sys.stdout.write(str(number)+'\n')

if __name__ == '__main__':
    main()
#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Sunday, 17. November 2013 11:36PM
from math import factorial

def main():
    iterations = int(raw_input())
    for inp in range(iterations):
        print factorial(int(raw_input()))

if __name__ == '__main__':
    main()
#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Saturday, 21. December 2013 05:39PM

def main():
    iterations = int(raw_input())
    for i in xrange(iterations):
        print int(raw_input())/2+1

if __name__ == '__main__':
    main()
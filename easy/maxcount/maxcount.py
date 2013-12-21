#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Saturday, 14. December 2013 11:21PM
import sys

def main():
    iterations = int(sys.stdin.readline())

    for i in xrange(iterations):
        num_dict = {}
        num = int(sys.stdin.readline())
        array = map(int,sys.stdin.readline().split())
        for j in array:
            if j in num_dict:
                num_dict[j] += 1
            else:
                num_dict[j] = 1
        m = max(num_dict.values())
        for k in sorted(num_dict.keys()):
            if num_dict[k]==m:
                print k,m
                break

if __name__ == '__main__':
    main()
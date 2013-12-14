#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Saturday, 14. December 2013 09:14PM
import sys

def find_j(num,menus):
    for i in menus:
        if num<i:
            return menus[menus.index(i)-1]
    return menus[11]

def main():
    iterations = int(sys.stdin.readline())
    menus = [1,2,4,8,16,32,64,128,256,512,1024,2048]

    for i in xrange(iterations):
        num = int(sys.stdin.readline())

        if num in menus:
            print '1'
            continue

        count = 0
        while num!=0:
            j = find_j(num,menus)
            num -= j
            count += 1
        print count

if __name__ == '__main__':
    main()
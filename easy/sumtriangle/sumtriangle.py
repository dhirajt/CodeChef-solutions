#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Saturday, 23. November 2013 05:33PM
import sys

def main():
    iterations = int(sys.stdin.readline())

    while iterations:
        lines = int(sys.stdin.readline())
        triangle = [[int(sys.stdin.readline())]]

        for i in xrange(1,lines):
            triangle.append(map(int,sys.stdin.readline().split()))


        row = len(triangle)-2 # second last

        while row>=0:
            col = 0
            while col<=row:  # length = row number
                triangle[row][col] += max(triangle[row+1][col],triangle[row+1][col+1])
                col +=1
            row -=1

        print triangle[0][0]
        iterations -= 1
    
if __name__ == '__main__':
    main()
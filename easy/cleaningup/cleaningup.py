#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Sunday, 08. December 2013 08:00PM
import sys

def main():
    iterations = int(sys.stdin.readline())
    
    for m in xrange(iterations):
        ndone,ntobedone = map(int,sys.stdin.readline().split())

        done = map(int,sys.stdin.readline().split())
        jobs = [i for i in range(1,ndone+1) if i not in done]

        chef = [str(j) for index,j in enumerate(jobs) if index%2==0]
        assistant = [str(j) for index,j in enumerate(jobs) if index%2!=0]

        print ' '.join(chef)
        print ' '.join(assistant)


if __name__ == '__main__':
    main()
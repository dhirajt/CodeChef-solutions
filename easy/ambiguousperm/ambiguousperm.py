#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Sunday, 24. November 2013 02:26PM

def main():
    permlength = int(raw_input())

    while permlength:
        perm = map(int,raw_input().split())
        pos = { item : index for index,item in enumerate(perm)}
        
        revperm = [ pos[i]+1 for i in xrange(1,len(perm)+1)]

        if perm == revperm:
            print 'ambiguous'
        else:
            print 'not ambiguous'
        permlength = int(raw_input())

if __name__ == '__main__':
    main()
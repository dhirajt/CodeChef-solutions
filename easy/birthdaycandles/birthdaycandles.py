#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Saturday, 14. December 2013 05:33PM
import sys

def main():
    iterations = int(sys.stdin.readline())

    for i in xrange(iterations):
        nums = map(int,sys.stdin.readline().split())
        min_num = min(nums)
        index = nums.index(min_num)

        result = 1000000000

        for index,num in enumerate(nums):
            if num==min_num:
                if index == 0:
                    result = min(result,int('1'+'0'*(min_num+1)))
                else:
                    result = min(result,int(str(index)*(min_num+1)))
        print result

if __name__ == '__main__':
    main()
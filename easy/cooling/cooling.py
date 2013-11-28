#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Tuesday, 26. November 2013 10:54PM
import sys

iterations = int(sys.stdin.readline())

for iteration in xrange(iterations):
    pies = int(sys.stdin.readline())

    weights = sorted(map(int,sys.stdin.readline().split()))
    weight_limits = sorted(map(int,sys.stdin.readline().split()))

    count = 0
    for weight_limit in weight_limits:
        if weights[count]<=weight_limit:
            count+=1
    print count

    
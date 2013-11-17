#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Sunday, 17. November 2013 02:30PM
import sys


iteration,divisor = map(int,sys.stdin.readline().split())
count = 0
inputs = sys.stdin.readlines()

for inp in inputs:
    if int(inp) % divisor == 0:
        count += 1
print count

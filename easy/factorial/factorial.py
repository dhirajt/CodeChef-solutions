#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Sunday, 17. November 2013 03:44PM
import sys

iterations = int(raw_input())

for i in range(iterations):
    number = int(raw_input())
    power = 1
    zeros = 0
    while 5**power<= number:
        zeros += number/(5**power)
        power += 1
    print zeros

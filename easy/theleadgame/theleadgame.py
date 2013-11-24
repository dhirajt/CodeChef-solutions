#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Sunday, 24. November 2013 10:22PM
import sys


iterations = int(raw_input())

lead = {
    1: 0,
    2: 0
}

score1 = 0
score2 = 0

for i in xrange(iterations):
    scores = map(int,sys.stdin.readline().split())
    score1 += scores[0]
    score2 += scores[1]

    new_lead = score1-score2

    if new_lead < 0:
        if lead[2] < abs(new_lead):
            lead[2] = abs(new_lead)
    elif new_lead>0:
        if lead[1] < abs(new_lead):
           lead[1] = abs(new_lead)
    
if lead[1] < lead[2]:
    print '%s %s' % (2,lead[2])
else:
    print '%s %s' % (1,lead[1]) 

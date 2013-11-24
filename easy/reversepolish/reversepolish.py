#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Sunday, 24. November 2013 11:45AM

iterations = int(raw_input())
num = 0

while num<iterations:
    line = raw_input()
    operators = []
    revpolish = []

    for char in line:
        if 97<=ord(char)<=123:
            revpolish.append(char)
        elif char == ')':
            revpolish.append(operators.pop())
        elif char!='(':
            operators.append(char)
    
    print ''.join(revpolish) 
    num +=1
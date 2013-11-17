#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Sunday, 17. November 2013 01:53PM

def main():
    withdrawl,balance = tuple(raw_input().split())
    withdrawl = int(withdrawl)
    balance = float(balance)
    if withdrawl % 5 == 0 and balance > (withdrawl+0.5):
        print balance - (withdrawl + 0.5)
    else:
        print balance

if __name__ == '__main__':
    main()
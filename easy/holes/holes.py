#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Thursday, 21. November 2013 10:24PM

def main():
    iterations = int(raw_input())
    hole1ascii = [65,68,79,80,81,82]
    hole2ascii = [66]
    while iterations:
        text = raw_input()
        holescount = 0
        for char in text:
            if ord(char) in hole1ascii:
                holescount += 1
            elif ord(char) in hole2ascii:
                holescount += 2
        print holescount 
        iterations -= 1       

if __name__ == '__main__':
    main()
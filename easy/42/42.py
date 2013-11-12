#!/usr/bin/env python
# -*- coding: utf-8 -*-

# started at: Tuesday, 12. November 2013 12:32PM


def main():
    answer = 0
    while answer != 42:
        answer = int(raw_input())
        if answer!=42:
            print answer

if __name__ == '__main__':
    main()

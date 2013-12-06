import sys

iterations = int(sys.stdin.readline())

for i in xrange(iterations):
    ntimes = int(sys.stdin.readline())
    numbers = len(map(int,sys.stdin.readline().split()))-1
    print (numbers*(numbers+1))/2

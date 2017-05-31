CC=gcc
CXX=g++
RM=rm -f

all: main

main: main.cc
    g++ -static -fno-strict-aliasing -DONLINE_JUDGE -lm -s -x c++ -Wl,--stack=67108864 -O2 -o main main.cc
    
#!/bin/bash
mkdir -p out
javac -d out src/figurinhas/*.java && java -cp out figurinhas.Main

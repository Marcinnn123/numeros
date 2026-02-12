# Numeros

Simple Java application that prints the first 21 Fibonacci numbers and computes their mean and median.

## Description

The program generates Fibonacci numbers using an iterative approach:
- F(0) = 0
- F(1) = 1
- F(n) = F(n-1) + F(n-2)

It prints:
- The first 21 Fibonacci numbers
- Their mean
- Their median

## How to run

Using Maven:

```bash
mvn clean package
mvn exec:java -Dexec.mainClass="com.marcin.numeros.Numeros"


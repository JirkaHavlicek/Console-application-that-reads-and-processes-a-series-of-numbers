A console application that reads and processes a series of numbers. The numbers will be read either from a file or from standard input. It will process the read numbers according to the following rules:
- the number of numbers read is an even number, the application prints only even numbers from this series
- the number of numbers read is an odd number, the application prints only odd numbers
The result is written to a file or to standard output. The behavior of the application, from where it reads and writes, will be governed by the parameters at startup. 
The first parameter specifies where the numbers will be read from and is mandatory. The parameter can be a positive integer n (the numbers will be entered from s. input) or the path to the file containing the numbers. The way the numbers are stored in this file is up to you.
The second parameter is optional. If it is not specified, the result will be written to the s. output, otherwise it is a file.
 
Examples of application execution:
 
Application reads numbers from s. input, writes result to s. output:
application 4

Application reads numbers from file, writes result to file:
application input.txt output.txt

Application reads numbers from file, writes result to p. output:
application input.txt

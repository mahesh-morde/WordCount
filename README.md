# WordCount

The code is written in Java and uses standard Java libraries for file handling and string manipulation.
The main logic of the program is implemented in the WordCount.java file.

The program expects the path to a text file as a command-line argument.
It reads the file using the BufferedReader class, which allows efficient reading of large files.
The file is read line by line, and each line is split into words using the split() method from the String class.
A counter variable is initialized to keep track of the word count.
For each word in a line, whitespace characters are removed using the trim() method.
If the resulting word is not empty, the word count is incremented.
Finally, the total word count is printed to the console.

# Here's a summary of the steps performed by the code:

Read the file path from the command-line argument.
Open the file using a BufferedReader.
Initialize a counter variable to zero.
Read each line from the file.
Split the line into words using the split() method.
For each word, remove leading and trailing whitespace.
If the word is not empty, increment the counter.
After reading all lines, close the file.
Print the total word count.
It's important to note that the code assumes that words are separated by whitespace characters. If your text file contains words separated by other delimiters (e.g., punctuation marks), you may need to modify the code accordingly.


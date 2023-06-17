# AUG Compiler

AUG Compiler is a Java-based program that uses ANTLR4 for its grammar. The compiler provides functionality to parse and handle certain grammar expressions.



## Prerequisites

Before you begin, ensure you have met the following requirements:

* You have installed a JDK version 17 or later. If not, you can download it from [here](https://adoptopenjdk.net/)
* You have installed Maven. If not, download and follow the instructions from [here](https://maven.apache.org/download.cgi)

## Installing and Running AUG Compiler

To install AUG Compiler, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/g-terra/aug-compiler.git
   ```
2. Navigate to the project directory:
   ```bash
   cd aug-compiler
   ```
3. Compile and package the project:
   ```bash
    mvn clean compile assembly:single
   ```

4. Now you can run the program using the following command:
    ```bash
    java -jar target/aug-compiler.jar [options]
    ```

The options are:

* `-debug`: If provided, the program will run in debug mode.
* `-prog=[filename]`: The path to the program file you want to parse. For example: `-prog=./program.txt`
* `-sample=[number]`: Number of the sample program to use. For example: `-sample=1`
  * there are currently 4 sample programs available: `1`, `2`, `3` , and `4` (default is `1`)

If no program (`-prog`) or sample (`-sample`) is specified, the default sample program `programs/sample1.txt` will be used.

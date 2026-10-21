# examjava

Java Practicals 1–10 source files, each one a separate file at the root so you can grab any single program with one `curl` command.

## Download one file

```cmd
curl.exe -fL "https://raw.githubusercontent.com/Lakshay5522/examjava/main/Hello.java" -o Hello.java
```

## Files

### Practical 1 — Java Basics

- [DataTypes.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/DataTypes.java)
- [Hello.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Hello.java)
- [Mtable.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Mtable.java)
- [Patterns.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Patterns.java)
- [PyramidPattern.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/PyramidPattern.java)

### Practical 2 — OOP Principles

- [Abs.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Abs.java)
- [Constructor.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Constructor.java)
- [hierarchy.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/hierarchy.java)
- [multilevel.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/multilevel.java)
- [MultipleI.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/MultipleI.java)
- [overload.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/overload.java)
- [overriding.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/overriding.java)
- [single.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/single.java)

### Practical 3 — Packages & Access Specifiers

- [Addition.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Addition.java)
- [DateExample.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/DateExample.java)
- [InputExample.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/InputExample.java)
- [Main.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Main.java)
- [MathExample.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/MathExample.java)
- [Subtraction.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Subtraction.java)

### Practical 4 — Exception Handling

- [ExpHandl.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/ExpHandl.java)

### Practical 5 — Collection Framework

- [CollectionDemo.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/CollectionDemo.java)

### Practical 6 — JFC & Swing

- [CGUI.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/CGUI.java)
- [fact.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/fact.java)

### Practical 7 — JDBC

- [Insert.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Insert.java)

### Practical 8 — Servlets

- [LoginServlet.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/LoginServlet.java)

### Practical 9 — JSP


### Practical 10 — JSON

- [CreateJsonObject.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/CreateJsonObject.java)

## Notes

- The raw URL pattern is `https://raw.githubusercontent.com/Lakshay5522/examjava/main/<FileName>`.
- Compile and run any file with `javac Hello.java` then `java Hello`.
- `Addition.java` and `Subtraction.java` declare `package calculator;`, `Insert.java` declares `package insert;`, `LoginServlet.java` declares `package mypack;` — place them in a matching folder before compiling.
- `Insert.java` needs a MySQL connector jar; `LoginServlet.java` needs the servlet API; `CreateJsonObject.java` needs the `org.json` jar.

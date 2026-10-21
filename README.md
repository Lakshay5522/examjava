# examjava

Java Practicals 1–10 source files. Each file sits at the repo root so you can grab any one with a single `curl` command.

## Download one file

```cmd
curl.exe -fL "https://raw.githubusercontent.com/Lakshay5522/examjava/main/Hello.java" -o Hello.java
```

## Files

### Practical 1 — Java Basics

- [Hello.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Hello.java)
- [DataTypes.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/DataTypes.java)
- [Mtable.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Mtable.java)
- [Patterns.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Patterns.java)
- [PyramidPattern.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/PyramidPattern.java)

### Practical 2 — OOP Principles

- [single.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/single.java)
- [multilevel.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/multilevel.java)
- [hierarchy.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/hierarchy.java)
- [overload.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/overload.java)
- [overriding.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/overriding.java)
- [Constructor.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Constructor.java)
- [Abs.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Abs.java)
- [MultipleI.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/MultipleI.java)

### Practical 3 — Packages & Access Specifiers

- [InputEg.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/InputEg.java)
- [MathEg.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/MathEg.java)
- [DateEg.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/DateEg.java)
- [CAddSub.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/CAddSub.java)

### Practical 4 — Exception Handling

- [Trycatch.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Trycatch.java)

### Practical 5 — Collection Framework

- [CollectionDemo.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/CollectionDemo.java)

### Practical 6 — JFC & Swing

- [CGUI.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/CGUI.java)
- [fact.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/fact.java)

### Practical 7 — JDBC

- [Insert.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Insert.java)

### Practical 8 — Servlets

- [Servlet.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/Servlet.java)

### Practical 9 — JSP

- [jsp.jsp](https://raw.githubusercontent.com/Lakshay5522/examjava/main/jsp.jsp)

### Practical 10 — JSON

- [json.java](https://raw.githubusercontent.com/Lakshay5522/examjava/main/json.java)

## Combined files

- **CAddSub.java** — Practical 3 calculator; addition and subtraction in one file (replaces Addition.java, Subtraction.java, Main.java).
- **Servlet.java** — Practical 8 login servlet with the HTML form inside (replaces LoginServlet.java and the separate form).
- **jsp.jsp** — Practical 9 marks form and grading in one JSP (replaces the separate form and result.jsp).

## Notes

- Raw URL pattern: `https://raw.githubusercontent.com/Lakshay5522/examjava/main/<FileName>`.
- Compile and run with `javac Hello.java` then `java Hello`.
- `Insert.java` declares `package insert;` — put it in an `insert/` folder before compiling. It needs a MySQL connector jar.
- `Servlet.java` needs the servlet API and a servlet container.
- `json.java` needs the `org.json` jar.

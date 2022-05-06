MarkdownParse.class: MarkdownParse.java
	echo: "compiling MarkdownParse.java"
	javac MarkdownParse.java


MarkdownParseTest.class: MarkdownParse.class MarkdownParseTest.java
	echo: "compiling MarkdownParseTest.java"
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java

run: MarkdownParseTest.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest

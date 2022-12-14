If you don't have Maven on your pc:
Install it using instruction: https://phoenixnap.com/kb/install-maven-windows

If you use cmd: DON`T FORGET TO RUN IT AS ADMIN

To compile:
1. Go to folder src -> run "javac -d bin ./com/labs/Additionals/*.java ./Main.java"
2. To compile test check pom.xml if it's the same as you need
3. Run in cmd "mvn clean test"


To run:
1. Go to "bin" folder and type: java -cp . Main
2. To run test
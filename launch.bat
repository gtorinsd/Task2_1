@echo off
path="C:\Program Files\Java\jdk1.8.0_60\bin\";%path%
cls
pushd D:\PROJECTS\java\Courses\Task2_1

java -cp out\production\Task2_1 Task1.Main
java -cp out\production\Task2_1 Task1.Main 1
java -cp out\production\Task2_1 Task1.Main 1 2
java -cp out\production\Task2_1 Task1.Main 1 2 3

popd
pause
@echo off
pushd "%~dp0"

:MENU
cls
echo ===============================================================
echo            Java Queue, Deque & ArrayDeque Resources
echo ===============================================================
echo 1. Stack and Queue using ArrayDeque (GeeksforGeeks)
echo 2. ArrayDeque in Java (Programiz)
echo 3. Queue Interface (Java SE 22 API)
echo 4. Deque Interface (Java SE 8 API)
echo 6. Exit
echo.
set /p choice=Enter your choice [1-6]:

if "%choice%"=="1" start https://www.geeksforgeeks.org/how-to-use-a-stack-and-queue-using-arraydeque-in-java/ & goto MENU
if "%choice%"=="2" start https://www.programiz.com/java-programming/arraydeque & goto MENU
if "%choice%"=="3" start https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Queue.html & goto MENU
if "%choice%"=="4" start https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html & goto MENU
if "%choice%"=="5" goto END

echo.
echo Invalid choice. Please select a number from 1 to 6.
pause
goto MENU

:END
echo Goodbye!
pause

popd

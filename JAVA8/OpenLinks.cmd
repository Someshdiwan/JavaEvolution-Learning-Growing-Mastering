@echo off
pushd "%~dp0"

:MENU
cls
echo ==============================================================
echo                 Java 8 - Optional Class Resources
echo ==============================================================
echo 1. 4 Reasons Why You Should Use Java Optional or Not (Medium)
echo 2. GeeksforGeeks - Java 8 Optional Class
echo 3. Exit
echo.
set /p choice=Enter your choice [1-3]:

if "%choice%"=="1" start https://medium.com/javarevisited/4-reasons-why-you-should-use-java-optional-or-not-4e44d51a9645#:~:text=We%20can%20use%20the%20Optional,in%20performance%20and%20code%20cluttering. & goto MENU
if "%choice%"=="2" start https://www.geeksforgeeks.org/java-8-optional-class/?ref=lbp & goto MENU
if "%choice%"=="3" goto END

echo.
echo Invalid choice. Please select 1 to 3.
pause
goto MENU

:END
echo Goodbye!
pause

popd

@echo off
pushd "%~dp0"

:MENU
cls
echo ===============================================================
echo             Java Tutorial Resources - Conditional Logic
echo ===============================================================
echo 1. Open switch Statement Tutorial
echo 2. Java Language Spec §4.6 - Type Erasure
echo 3. Java Enums Tutorial (Object-Oriented Concepts)
echo 4. Exit
echo.
set /p choice=Enter your choice [1-4]:

if "%choice%"=="1" start https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html & goto MENU
if "%choice%"=="2" start https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.6 & goto MENU
if "%choice%"=="3" start https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html & goto MENU
if "%choice%"=="4" goto END

echo.
echo Invalid choice. Please select 1 to 4.
pause
goto MENU

:END
echo Goodbye!
pause

popd

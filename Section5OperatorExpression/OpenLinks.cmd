@echo off
pushd "%~dp0"

:MENU
cls
echo =====================================================
echo     Java Tutorial - Operators
echo =====================================================
echo 1. Open Oracle Operators Answer Page
echo 2. Exit
echo.
set /p choice=Enter your choice [1-2]:

if "%choice%"=="1" start https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/answers_operators.html & goto MENU
if "%choice%"=="2" goto END

echo.
echo Invalid choice. Please select 1 or 2.
pause
goto MENU

:END
echo Goodbye!
pause

popd

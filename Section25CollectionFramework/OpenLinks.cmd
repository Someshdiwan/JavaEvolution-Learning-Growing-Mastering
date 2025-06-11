@echo off
pushd "%~dp0"

:MENU
cls
echo ==============================================================
echo             Java Collections Framework - Core Interface
echo ==============================================================
echo 1. Collection Interface (Java SE 21 API)
echo 2. Exit
echo.
set /p choice=Enter your choice [1-2]:

if "%choice%"=="1" start https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Collection.html & goto MENU
if "%choice%"=="2" goto END

echo.
echo Invalid choice. Please select 1 or 2.
pause
goto MENU

:END
echo Goodbye!
pause

popd

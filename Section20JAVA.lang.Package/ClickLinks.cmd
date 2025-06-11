@echo off
pushd "%~dp0"

:MENU
cls
echo ===============================================
echo       Oracle Java Article - Reflection API
echo ===============================================
echo 1. Open Java Reflection Article
echo 2. Exit
echo.
set /p choice=Enter your choice [1-2]:

if "%choice%"=="1" start https://www.oracle.com/technical-resources/articles/java/javareflection.html & goto MENU
if "%choice%"=="2" goto END

echo.
echo Invalid choice. Please select 1 or 2.
pause
goto MENU

:END
echo Goodbye!
pause

popd

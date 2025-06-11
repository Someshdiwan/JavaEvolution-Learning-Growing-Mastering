@echo off
pushd "%~dp0"

:MENU
cls
echo ===============================================================
echo               Java Collections - TreeMap & TreeSet
echo ===============================================================
echo 1. TreeMap Class (Java SE 8 API)
echo 2. TreeSet Class (Java SE 8 API)
echo 3. Exit
echo.
set /p choice=Enter your choice [1-3]:

if "%choice%"=="1" start https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html & goto MENU
if "%choice%"=="2" start https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html & goto MENU
if "%choice%"=="3" goto END

echo.
echo Invalid choice. Please select 1 to 3.
pause
goto MENU

:END
echo Goodbye!
pause

popd

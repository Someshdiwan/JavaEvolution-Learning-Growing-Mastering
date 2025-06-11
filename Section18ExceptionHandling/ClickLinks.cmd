@echo off
pushd "%~dp0"

:MENU
cls
echo =========================================================
echo            Java Exception Handling - Helpful Links
echo =========================================================
echo 1. What Is an Exception? (Oracle Tutorial)
echo 2. NullPointerException Class (Java SE 8 API)
echo 3. java.lang Package Summary (Java SE 8)
echo 4. Full Exceptions Tutorial (Oracle Docs)
echo 5. Exit
echo.
set /p choice=Enter your choice [1-5]:

if "%choice%"=="1" start https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html & goto MENU
if "%choice%"=="2" start https://docs.oracle.com/javase/8/docs/api/java/lang/NullPointerException.html & goto MENU
if "%choice%"=="3" start https://docs.oracle.com/javase/8/docs/api/java/lang/package-summary.html#package.description & goto MENU
if "%choice%"=="4" start https://docs.oracle.com/javase/tutorial/essential/exceptions/ & goto MENU
if "%choice%"=="5" goto END

echo.
echo Invalid choice. Please select a number from 1 to 5.
pause
goto MENU

:END
echo Goodbye!
pause

popd

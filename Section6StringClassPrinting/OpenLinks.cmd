@echo off
pushd "%~dp0"

:MENU
cls
echo ============================================================
echo         Java - StringBuilder Documentation Launcher
echo ============================================================
echo 1. StringBuilder Class (Java SE 8 API)
echo 2. Exit
echo.
set /p choice=Enter your choice [1-2]:

if "%choice%"=="1" start https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html & goto MENU
if "%choice%"=="2" goto END

echo.
echo Invalid choice. Please select 1 or 2.
pause
goto MENU

:END
echo Goodbye!
pause

popd

@echo off
pushd "%~dp0"

:MENU
cls
echo ===============================================================
echo          Java Collections Framework - Map, Set & BitSet
echo ===============================================================
echo 1. Map Interface (Java SE 8 API)
echo 2. HashMap Class (Java SE 8 API)
echo 3. HashSet Class (Java SE 8 API)
echo 4. HashSet in Java (GeeksforGeeks)
echo 5. BitSet Class (Java SE 8 API)
echo 6. Exit
echo.
set /p choice=Enter your choice [1-6]:

if "%choice%"=="1" start https://docs.oracle.com/javase/8/docs/api/java/util/Map.html & goto MENU
if "%choice%"=="2" start https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html & goto MENU
if "%choice%"=="3" start https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html & goto MENU
if "%choice%"=="4" start https://www.geeksforgeeks.org/hashset-in-java/ & goto MENU
if "%choice%"=="5" start https://docs.oracle.com/javase/8/docs/api/java/util/BitSet.html & goto MENU
if "%choice%"=="6" goto END

echo.
echo Invalid choice. Please select a number from 1 to 6.
pause
goto MENU

:END
echo Goodbye!
pause

popd

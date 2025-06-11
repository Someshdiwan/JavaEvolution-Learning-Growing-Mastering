@echo off
pushd "%~dp0"

:MENU
cls
echo ===============================================================
echo             Java Collections - List & Linked Structures
echo ===============================================================
echo 1. LinkedList Class (Java SE 8 API)
echo 2. LinkedList Implementation in Java (GeeksforGeeks)
echo 3. List Interface (Java SE 21 API)
echo 4. LinkedHashSet Class (Java SE 8 API)
echo 5. LinkedHashMap Class (Java SE 8 API)
echo 6. Object Class (java.lang)
echo 7. Exit
echo.
set /p choice=Enter your choice [1-7]:

if "%choice%"=="1" start https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html & goto MENU
if "%choice%"=="2" start https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/ & goto MENU
if "%choice%"=="3" start https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html & goto MENU
if "%choice%"=="4" start https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html & goto MENU
if "%choice%"=="5" start https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html & goto MENU
if "%choice%"=="6" start https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html & goto MENU
if "%choice%"=="7" goto END

echo.
echo Invalid choice. Please select 1 to 7.
pause
goto MENU

:END
echo Goodbye!
pause

popd

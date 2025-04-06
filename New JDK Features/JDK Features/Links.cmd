@echo off
pushd "%~dp0"

:MENU
cls
echo =========================================
echo        Java 24 & Resources Menu
echo =========================================
echo 1. OpenJDK 24 Project Page
echo 2. IntelliJ IDEA & Java 24 Blog
echo 3. OpenJDK JEP 0 (Placeholder)
echo 4. Java Almanac Features
echo 5. Exit
echo.
set /p choice=Enter your choice [1-5]:

if "%choice%"=="1" start https://openjdk.org/projects/jdk/24/ & goto MENU
if "%choice%"=="2" start https://blog.jetbrains.com/idea/2025/03/java-24-and-intellij-idea/ & goto MENU
if "%choice%"=="3" start https://openjdk.org/jeps/0 & goto MENU
if "%choice%"=="4" start https://javaalmanac.io/features/ & goto MENU
if "%choice%"=="5" goto END

echo.
echo Invalid choice. Please select 1–5.
pause
goto MENU

:END
echo Goodbye!
pause

popd


REM -----------------------------------------

REM comments:

REM :MENU defines a label for the menu loop.

REM 🧠 What This Does:
REM @echo off hides the command text in the terminal window.
REM start opens the default browser with the URL.
REM pause keeps the command window open after execution.
REM cls clears the screen each time the menu is shown.

REM echo prints the menu text.

REM set /p choice=... reads the user’s selection into %choice%.

REM Each if checks the choice and uses start <URL> to open the link, then returns to :MENU.

REM Choice 5 jumps to :END to exit.

REM Invalid inputs fall through to an error message and loop back.

REM 💡 Bonus Tips:

REM Run this On CMD or Terminal IDE:

REM: cmd.exe /c "C:/Users/somes/Downloads/NoteApp/JavaEvolution-Learning-Growing-Mastering/New JDK Features\JDK Features/Links.cmd"

REM -----------------------------------------
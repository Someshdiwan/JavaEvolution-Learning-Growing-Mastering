#!/bin/bash

while true; do
    clear
    echo "============================================================"
    echo "         Java Exception Handling - Helpful Links"
    echo "============================================================"
    echo "1. What Is an Exception? (Oracle Tutorial)"
    echo "2. NullPointerException Class (Java SE 8 API)"
    echo "3. java.lang Package Summary (Java SE 8)"
    echo "4. Full Exceptions Tutorial (Oracle Docs)"
    echo "5. Exit"
    echo
    read -p "Enter your choice [1-5]: " choice

    case $choice in
        1) open "https://docs.oracle.com/javase/tutorial/essential/exceptions/definition.html" ;;
        2) open "https://docs.oracle.com/javase/8/docs/api/java/lang/NullPointerException.html" ;;
        3) open "https://docs.oracle.com/javase/8/docs/api/java/lang/package-summary.html#package.description" ;;
        4) open "https://docs.oracle.com/javase/tutorial/essential/exceptions/" ;;
        5) echo "Goodbye!"; break ;;
        *) echo "Invalid choice. Please select a number from 1 to 5."; sleep 2 ;;
    esac
done

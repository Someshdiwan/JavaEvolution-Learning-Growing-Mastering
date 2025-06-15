#!/bin/bash
# Navigate to the directory of the script
cd "$(dirname "$0")"

while true; do
    clear
    echo "====================================================="
    echo "    Java Tutorial - Operators Q&A Answer Page"
    echo "====================================================="
    echo "1. Open Oracle Operators Answer Page"
    echo "2. Exit"
    echo
    read -p "Enter your choice [1-2]: " choice

    case "$choice" in
        1)
            open "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/QandE/answers_operators.html"
            ;;
        2)
            echo "Goodbye!"
            break
            ;;
        *)
            echo
            echo "Invalid choice. Please select 1 or 2."
            read -p "Press Enter to continue..."
            ;;
    esac
done

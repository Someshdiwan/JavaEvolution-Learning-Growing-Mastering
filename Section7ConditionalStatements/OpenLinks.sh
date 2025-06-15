#!/bin/bash

# Move to the script’s directory
cd "$(dirname "$0")"

while true; do
  clear
  echo "=============================================================="
  echo "            Java Tutorial Resources - Conditional Logic"
  echo "=============================================================="
  echo "1. Open switch Statement Tutorial"
  echo "2. Java Language Spec §4.6 - Type Erasure"
  echo "3. Java Enums Tutorial (Object-Oriented Concepts)"
  echo "4. Exit"
  echo
  read -p "Enter your choice [1-4]: " choice

  case "$choice" in
    1)
      open "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html"
      ;;
    2)
      open "https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.6"
      ;;
    3)
      open "https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html"
      ;;
    4)
      echo "Goodbye!"
      break
      ;;
    *)
      echo
      echo "Invalid choice. Please select 1 to 4."
      read -p "Press Enter to continue..."
      ;;
  esac
done

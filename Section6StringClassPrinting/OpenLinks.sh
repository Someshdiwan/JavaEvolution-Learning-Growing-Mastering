#!/bin/bash

# Save current directory and move to script's directory
cd "$(dirname "$0")"

while true; do
  clear
  echo "============================================================"
  echo "              Java - StringBuilder Documentation"
  echo "============================================================"
  echo "1. StringBuilder Class (Java SE 8 API)"
  echo "2. Exit"
  echo
  read -p "Enter your choice [1-2]: " choice

  case "$choice" in
    1)
      open "https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html"
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

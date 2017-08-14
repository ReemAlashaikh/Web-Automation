#!/bin/sh
javac -cp ".:../../heliumlib/*" Bing.java
java -cp ".:../../heliumlib/*" Bing
read -p "Press Enter to continue..." prompt
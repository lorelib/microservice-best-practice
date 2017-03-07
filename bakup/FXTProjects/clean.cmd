@echo off
set localdir=%~dp0

echo start clean

call mvn clean -f dependency-parent\pom.xml
call mvn clean -f infrastructure\pom.xml

echo end clean
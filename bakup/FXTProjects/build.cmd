@echo off
set localdir=%~dp0

echo start build

if "%1" == "c" call clean.cmd

call mvn install -f dependency-parent\pom.xml
call mvn package -f infrastructure\pom.xml

echo end build

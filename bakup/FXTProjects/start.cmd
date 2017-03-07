@echo off
echo start
set localdir=%~dp0

if "%1" == "c" call clean.cmd

if "%2" == "b" call build.cmd

start call java -jar infrastructure\services-discovery\target\services-discovery-1.0.jar
echo services-discovery started...

start call java -jar infrastructure\config-server\target\config-server-1.0.jar
echo config-server started...

start call java -jar infrastructure\monitor-admin\target\monitor-admin-1.0.jar
echo monitor-admin started...

echo start success

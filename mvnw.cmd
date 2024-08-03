@echo off
setlocal

set DIRNAME=%~dp0
set APP_BASE_NAME=%~n0%
set APP_HOME=%DIRNAME%..

if not "%JAVA_HOME%" == "" goto findJavaFromJavaHome

set JAVA_EXE=java
goto findJavaExecutable

:findJavaFromJavaHome
set JAVA_EXE=%JAVA_HOME%\bin\java.exe

:findJavaExecutable
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and Java could not be found on your machine.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto :eof

:init
"%JAVA_EXE%" -jar "%APP_HOME%\%APP_BASE_NAME%.jar" %*
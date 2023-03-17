@echo off
set path=C:\Users\Ahmed reda\.m2\repository\allure\allure-2.14.0\bin;C:\Users\Ahmed reda\.jdks\corretto-17.0.2\bin;%path%
allure serve allure-results
pause
exit
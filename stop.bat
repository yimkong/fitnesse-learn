::Usage: java fitnesse.Shutdown [-pa]
::      -h <hostname> {localhost}
::      -p <port number> {80}
::      -c <username> <password> Supply user credentials.  Use when FitNesse has authentication activated.

java -cp 'lib\fitlibrary-2.0.jar;lib\fitnesse-20200501-standalone.jar;lib\fitnesse-learn.jar' fitnesse.Shutdown -h localhost -p 80

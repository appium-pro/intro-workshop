set curdir=%cd%
mkdir apps
bitsadmin /transfer downloadAppsJob /dynamic /download /priority FOREGROUND https://github.com/cloudgrey-io/the-app/releases/download/v1.10.0/TheApp-v1.10.0.apk %curdir%\apps\TheApp.apk

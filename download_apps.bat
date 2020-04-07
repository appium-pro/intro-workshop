mkdir apps
bitsadmin /create downloadAppsJob
bitsadmin /addfile downloadAppsJob https://github.com/cloudgrey-io/the-app/releases/download/v1.10.0/TheApp-v1.10.0.apk apps\TheApp.apk
bitsadmin /resume downloadAppsJob
bitsadmin /complete downloadAppsJob

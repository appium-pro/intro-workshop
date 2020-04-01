#!/bin/bash

mkdir -p apps

curl -L https://github.com/cloudgrey-io/the-app/releases/download/v1.10.0/TheApp-v1.10.0.app.zip > apps/TheApp.app.zip
curl -L https://github.com/cloudgrey-io/the-app/releases/download/v1.10.0/TheApp-v1.10.0.apk > apps/TheApp.apk

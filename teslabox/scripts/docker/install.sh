#!/usr/bin/env bash

# Uninstall old versions
sudo apt-get remove docker docker-engine docker.io

# Convenience scripts
curl -fsSL https://get.docker.com -o get-docker.sh
sudo sh get-docker.sh
rm get-docker.sh

# Add docker to the user group
sudo usermod -a -G docker $USER

# It might be a reboot needed to affect the changes


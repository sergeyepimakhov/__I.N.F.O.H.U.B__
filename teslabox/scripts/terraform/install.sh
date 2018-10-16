#!/usr/bin/env bash

cd /usr/local/bin/
sudo wget https://releases.hashicorp.com/terraform/0.11.8/terraform_0.11.8_linux_amd64.zip
sudo unzip terraform_0.11.8_linux_amd64.zip
sudo rm terraform_0.11.8_linux_amd64.zip

# Test it
terraform
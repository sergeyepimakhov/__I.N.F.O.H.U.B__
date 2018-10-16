#!/usr/bin/env bash

cd /usr/local/bin

sudo wget https://github.com/stedolan/jq/releases/download/jq-1.5/jq-linux64
sudo chmod +x jq-linux64
sudo ln -s jq-linux64 jq

# Test it
jq
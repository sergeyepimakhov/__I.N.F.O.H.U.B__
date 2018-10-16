## Tesla Onboarding

Is was chosen to use Ubuntu in VM.

### Virtual Machine
Oracle VM VirtualBox can be found here 
[link](https://www.oracle.com/technetwork/server-storage/virtualbox/downloads/index.html)

### Ubuntu
The latest Ubuntu take from here [link](https://www.ubuntu.com/download/desktop). 
I took the latest 18.04 LTS

### Guest Addition
To enable Copy and Paste between Windows and Ubuntu you need to install Guest Addition

```
sudo apt install -y virtualbox-guest-x11
```

Then in VBox `Devices -> Shared Clipboard -> Bidirectional`

### Intelij Lisense

[Confluence](https://confluence.scm.otto.de/display/EC/IntelliJ+Lizenzen)

Then Intelij Ultimate can be installed

### Install Chrome

```
# Add key
wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | sudo apt-key add -
# Set repository
echo 'deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main' | sudo tee /etc/apt/sources.list.d/google-chrome.list
# Install package
sudo apt-get update
sudo apt-get install google-chrome-stable
```

### Otto Certificates
HowTo's are here

[Confluence](https://confluence.scm.otto.de/display/GBI/OTTO+CA+Certificate)

The certificatescan be found here

https://pki.ottogroup.com/


#### Chrome Certificates
How to install certificate in Chrome:
`Settings -> Manage Certificates -> Authorities` then `Import`.
You need to add `OTTO-Root-CA-v01.crt`


#### Intelij Certificates


### GitHub

#### Install git

```
sudo apt install -y git
```


#### SSH keys
[Git Hub link](https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/)

```
ssh-keygen -t rsa -b 4096 -C "name.surename@yourcompany.com"
ssh-add ~/.ssh/id_rsa
```
then copy to Git-Hub. Test it

```
git clone git@github.com:otto-ec/tsl_information-hub.git
```


### Docker Install
```
# Uninstall old versions
sudo apt-get remove docker docker-engine docker.io

# Convenience scripts
curl -fsSL https://get.docker.com -o get-docker.sh
sudo sh get-docker.sh
rm get-docker.sh

# Test it
docker run hello-world
```

### Java 8
```
sudo apt update
sudo apt install -y openjdk-8-jdk

# Test it
java -version
```

### Leiningen
```
sudo apt install -y leiningen

# Test it
lein -v
```

### Install Cursive (Clojure REPL) in Intellij
[link](https://cursive-ide.com/userguide/index.html)

Clojure licence for Intellij can be found here 
[Confluence](https://confluence.scm.otto.de/display/EC/Cursive-Lizenzen)


### AWS Cli
[link](https://aws.amazon.com/cli/)

```$xslt
pip install awscli
```

Please configure AWS afterwards

```$xslt
aws configure
AWS Access Key ID [None]: ***
AWS Secret Access Key [None]: ***
Default region name [None]: eu-central-1
Default output format [None]: json
```

### Tesla Toolbox
#### Swamp
Swamp should be installed from here [link](https://github.com/felixb/swamp/releases)

```$xslt
cd /usr/local/bin/
sudo wget https://github.com/felixb/swamp/releases/download/v0.8/swamp_amd64
sudo chmod +x swamp_amd64
sudo ln -s swamp_amd64 swamp
```

#### Alias
Tesla alias are located here [git](https://github.com/otto-ec/tsl_toolbox/blob/master/team-alias).
You could copy them and append to a script in your `/etc/bash.bashrc`. Also you need to set `OCN_USER` variable

```$xslt
export OCN_USER="your_ocn_name"
```

#### Distribute ssh keys
```$xslt
# copy from distribute-ssh-key toolbox
sudo cp distribute-ssh-key /usr/local/bin
cd /usr/local/bin
sudo chmod +x distribute-ssh-key 
```

### Terraform
[link](https://www.terraform.io/)

```$xslt
cd /usr/local/bin/
sudo wget https://releases.hashicorp.com/terraform/0.11.8/terraform_0.11.8_linux_amd64.zip
sudo unzip terraform_0.11.8_linux_amd64.zip
sudo rm terraform_0.11.8_linux_amd64.zip

# Test it
terraform
```

### JQ
[link](https://stedolan.github.io/jq/)
```$xslt
cd /usr/local/bin

sudo wget https://github.com/stedolan/jq/releases/download/jq-1.5/jq-linux64
sudo chmod +x jq-linux64
sudo ln -s jq-linux64 jq

# Test it
jq
```



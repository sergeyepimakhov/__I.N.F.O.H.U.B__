# License
echo 'EC License can be found here:
https://confluence.scm.otto.de/display/EC/IntelliJ+Lizenzen'

# install IntelliJ
cd /usr/local/
sudo mkdir idea
cd /usr/local/idea
wget -O /tmp/intellij.tar.gz http://download.jetbrains.com/idea/ideaIU-2018.2.4.tar.gz
sudo tar xfz /tmp/intellij.tar.gz 
cd idea-IU-182.4505.22/bin 
./idea.sh

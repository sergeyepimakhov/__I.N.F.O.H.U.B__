## DSB patch

###Zeppelin
install Zeppelin, make it run automatic. In the folder `/etc/profile.d` can be a small script created
```
zeppelin start

```
Where `zeppelin` is
```
zeppelin -> /opt/zeppelin/zeppelin-0.8.0-bin-all/bin/zeppelin-daemon.sh*
```
It can be also a launcher create. Take the Zeppelin logo and make the command
```
firefox localhost:8080
``` 
Install R
```
# Config the repo
sudo sh -c 'echo "deb http://cran.rstudio.com/bin/linux/ubuntu trusty/" >> /etc/apt/sources.list'
gpg --keyserver keyserver.ubuntu.com --recv-key E084DAB9
gpg -a --export E084DAB9 | sudo apt-key add -

# Install
sudo apt-get install r-base

# Set user group as own
sudo chown -R $USER:$USER /usr/local/lib/R/
```
Install packages devtools, knitr, ggplot2, etc...
```
R -e "install.packages('devtools', repos = 'http://cran.rstudio.org'')"
R -e "install.packages('knitr', repos = 'http://cran.rstudio.org'')"
R -e "install.packages('ggplot2', repos = 'http://cran.rstudio.org'')"
R -e "install.packages(c('devtools','mplot', 'googleVis'), repos = 'http://cran.rstudio.org''); require(devtools); install_github('ramnathv/rCharts')"
```

###Anaconda
update Anaconda to version 3 in the folder `/opt/Anaconda3-5.3.0-Linux-x86_64`. 
User ninja should be owner not root  
```
chmod +x Anaconda3-5.3.0-Linux-x86_64.sh
sudo ./Anaconda3-5.3.0-Linux-x86_64.sh
ln -s /opt/Anaconda2-4.2.0-Linux-x86_64/ anaconda
```
It repairs jupyter and spider as well.

###Install docker
See scripts from teslabox

###Add Certificates to Firefox
pass

###Install ExaPlus
```
dsb --update
```

###Install Teradata
``` 
dsb --install-teradata
```

###Install SQuirrel
See official docs 
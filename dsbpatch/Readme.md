## DSB patch

###Zeppelin
install Zeppelin, make it run automatic
It can be also a launcher create. Take the Zeppelin logo and make the command
```
firefox localhost:8080
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
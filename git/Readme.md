## Git

### Do not track .idea
```
# Remove the file from the repository
git rm --cached .idea/

# now update your gitignore file to ignore this folder
echo '.idea' >> .gitignore

# add the .gitignore file
git add .gitignore

git commit -m "Removed .idea files"
git push origin <branch>
```


### Private repo
```
git config --global user.name "Surename, Dr. Name"
git config --global user.email "Name.Surename@otto.de"
```

Mit Ihrem Repository arbeiten
Ich möchte dieses Repository nur klonen
Wenn Sie dieses leere Repository einfach klonen möchten, führen Sie diesen Befehl mit Ihrem Git-Client aus.

```
git clone ssh://git@bitbucket.scm.otto.de/~nickname/infohub.git
```

Mein Code ist bereit zum Pushen
Wenn Sie schon Code bereit haben, um ihn in dieses Repository zu schieben, führen Sie dies in Ihrem Terminal aus.

```
cd infohub
git init
git add --all
git commit -m "Initial Commit"
git remote add origin ssh://git@bitbucket.scm.otto.de/~nickname/infohub.git
git push -u origin master
```

Mein Code wird bereits von Git getrackt
Wenn Ihr Code schon von Git getrackt wird, so setzen Sie dieses Repository als Ihr "Original", zu dem zu pushen ist.

```
cd infohub
git remote set-url origin ssh://git@bitbucket.scm.otto.de/~nickname/infohub.git
git push -u origin --all
git push origin --tags
```

Ganz fertig mit den Befehlen?


# Sass
## Syntactically Awesome Style Sheets
### Sass is the most mature, stable, and powerful professional grade CSS extension language in the world 
### [https://sass-lang.com/]

### About It
Sass is a style sheet language. The language interprets or compiles .sass files into .css files. The interpreter is
on Ruby.

### How to install on Ubuntu
    sudo apt-get install ruby # or ruby-full
    sudo gem 
    # sudo apt-get install ruby-sass
    sass -v # Sass 3.2.12 (Media Mark)
    
### Basic Usage
Watch

    sass --watch input.sass:output.css
    sass --watch input-dir:output-dir
    
Update

    sass --update input.sass:output.css
    sass --update input-dir:output-dir
    
### Try it
    
    touch mystyle.scss
    
Content of ```mystyle.csss```

    $mycolor: #333;
    
    body {
      color: $mycolor;
    }
    
Run it

    sass --update mystyle.css               # overwrite mystyle.css
    sass --update mystyle.css:mystyle.css   # the same
    
With watch

    mv mystyle.scss sass/
    sass --watch scss:css
    
    # sudo apt-get install ruby-listen
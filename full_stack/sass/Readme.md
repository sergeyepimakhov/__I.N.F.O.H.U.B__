# Sass
## Syntactically Awesome Style Sheets
### Sass is the most mature, stable, and powerful professional grade CSS extension language in the world 
### [https://sass-lang.com/documentation/file.SASS_REFERENCE.html]

### Concept
CSS can be fun, but stylesheets are getting larger, more complex, and harder to maintain. 
This is where a preprocessor can help. Sass lets you use features that don't exist in CSS yet
like variables, nesting, mixins, inheritance and other nifty goodies that make writing CSS fun again.

### About It
Sass is a style sheet language. The language interprets or compiles .sass files into .css files. The interpreter is
on Ruby.

### How to install on Ubuntu
    sudo apt-get install ruby-full build-essential rubygems
    sudo gem install sass
    sass -v # Ruby Sass 3.7.3
    
### Basic Usage
Watch

    sass --watch input.sass:output.css
    sass --watch input-dir:output-dir
    
Update

    sass --update input.sass:output.css
    sass --update input-dir:output-dir
    
Interactive Shell

    sass -i
    >> 1px + 1px + 1px
    3px
    >> #777 + #888
    white
    
    
    
### Try it
    
    touch mystyle.scss
    
Content of ```mystyle.scss```

    $mycolor: #333;
    
    body {
      color: $mycolor;
    }
    
Run it

    sass --update mystyle.css               # overwrite mystyle.css
    sass --update mystyle.css:mystyle.css   # the same
    
With watch

    mv mystyle.scss scss/
    sass --watch scss:css
    
### Data Types

- Numbers (1.2, 13, 10px)
- Strings ("mystr", foo)
- Colors (#ffffff, rgba(255, 0, 0, 0.5))
- Booleans (true, false)
- Nulls (null)
- Lists separated by space or comma (1.5em 1em; Arial, sns-serif)
- Maps (key1: value1, key2: value2)
- Functions
    
### Variables

Variables as a way to store information that you want to reuse in your stylesheet.
    
    $mycolor: #333;
    $myfont: Arial, Sans-serif
        
    // body
    body {
        color: $mycolor;
        font-family: $myfont
    }
    
### Comments
    // inline comment
    
    /* multiline
    *  comments
    */
    
### Nesting

CSS does't provide the nesting or visual hierarchy, but SASS does.

    // nesting
    nav {
      ul {
        margin: 0;
        padding: 0;
      }
      li {
        display: inline-block;
      }
      a {
        display: block;
        padding: 6px 12px;
      }
    }
    
### Partials and Imports

Little snippets of CSS that can be included in other Sass files. 
This is a great way to modularize your CSS and help keep things easier to maintain. 
A module schould start with a leading underscore ```_partial.scss```.
Then it can be imported via ```@import```

    // _partial.scss
    html,
    ul {
      margin: 0;
      padding: 0;
    }
    
    // mystyle.scss
    @import "partial"
    
    
### Mixins (functions)

    @mixin firefox-message($selector) {
        body.firefox #{$selector}:before {
            content: "Hi, Firefox users!";
        }
    }
    
    @include firefox-message(".header")
    
    // is compiled to
    body.firefox .header:before {
      content: "Hi, Firefox users!"; }
      
### Math



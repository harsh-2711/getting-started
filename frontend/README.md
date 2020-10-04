# Bootstrap Quick Tutorial
## Introduction
Bootstrap is a free, open-source front-end framework. It is used for designing and developing responsive websites and web applications. It is the most popular framework of its type and the second most starred project on GitHub.

Bootstrap contains design templates based on HTML and CSS for loads of components. Components include navigation, typography, tables, buttons and much more… pretty much anything you put into a website really. There are also optional JavaScript plugins / extensions.

The latest release is Bootstrap 4. It is more responsive than previous versions, has a bunch of new components and a faster stylesheet. Other significant changes from previous versions include a move from Less to Sass; dropping support for Internet Explorer 9 (and older); and adding flexbox support (alongside dropping non-flexbox support).
## Reasons behind using Bootstrap
In short, because Bootstrap makes front-end web development faster and easier!
Bootstrap has been built in such a way that you really only need a beginner level knowledge of HTML and CSS to start using it. This means with very limited experience you are able to create some great looking, responsive sites and apps.

As more and more people predominantly access the web on their phone it is easily argued that developing mobile-first is what we should be doing. Bootstrap have taken a mobile-first approach. Mobile-first styles are part of the core framework.

Despite mobile being arguably the most important it is still essential we create responsive designs for our web development projects. Bootstrap’s CSS is fully responsive so automatically adjusts itself based on the size of the screen a user is viewing your site on. Whether they are using their phone, tablet, laptop or a large desktop display your site will look great.

Importantly Bootstrap is compatible with all modern browsers. These include Chrome, Safari, Firefox, Edge, Internet Explorer 10 and Opera. It even handles those annoying inconsistencies across browsers using Reboot.

## Starter Template
It is possible to download the Bootstrap source files but, to get started quickly, I would recommend using the template below. It uses BootstrapCDN provided by StackPath. Using the CDN is also beneficial to your users as using it leads to faster load times. The template contains all stylesheets and scripts you need to build your Bootstrap powered sites and apps.
```html
<!doctype html>
<html lang="en">
  <head>
<!-- THESE ARE THE META TAGS YOU MUST INCLUDE -->
    
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- NEXT IS THE BOOTSTRAP CDN -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>My Bootstrap Project!</title>
  </head>
<body>
  
  <!-- YOUR CONTENT GOES HERE -->
<!-- NEXT IS THE JAVASCRIPT: JQUERY FIRST, POPPER.JS SECOND, BOOTSTRAP JS THIRD -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
  </body>
</html>
```
## Template Explanation
### HTML5 doctype
In order to avoid any weird looking, incomplete styles you need to use the HTML5 doctype.
```html
<!doctype html>
<html lang="en">
</html>
```

### Mobile-first / Responsive
With Bootstrap employing a mobile-first strategy you have to add the responsive viewport ```<meta>``` tag. Doing so ensures everything is rendered properly and that touch zooming works as it should do.
```html
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
```
### CSS
The CDN included in the Bootstrap starter template shown above pulls through all the Bootstrap styles into your project. The CDN used is the most up to date one at the time of writing.
```html
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
```
### JavaScript
There’s a bunch of components in Bootstrap that use JavaScript to function so you need to include the relevant scripts in your project. They should be placed just before the closing ```</body>``` tag. The order of the scripts is important and must be in the order shown in the template. jQuery first, Popper.js second and then Bootstrap third.
```html
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
```
## Containers
In order to use Bootstrap’s grid system you need to wrap your content in a container. There are two types of container available to you:

```.container``` gives you a responsive container with a fixed width. This means that the ```max-width``` is adjusted automatically for each breakpoint (i.e. screen size).
```html
<div class="container">
  <p>Your content goes here</p>
</div>
```
```.container-fluid``` gives you a full width container. This means that it is always fills the entire width of the viewport… i.e. its width is always 100%.
```html
<div class="container-fluid">
  <p>Your content goes here</p>
</div>
```
Try putting each of the pieces of code above inside the ```<body>``` tags of the starter template so you can see what happens.

Hopefully this tutorial helps you see how quickly a website can be built using Bootstrap. To add more features to your website, Go to [Bootstrap’s website](https://getbootstrap.com/docs/4.5/components/alerts/) for code snippets.

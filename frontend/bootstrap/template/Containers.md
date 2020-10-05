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

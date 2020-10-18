## Introduction
-   Bootstrap is one of the most popular frontend frameworks for designing websites because it’s easy for anyone with basic HTML/CSS and JavaScript knowledge to get  started; it’s mobile-first and responsive design makes sure it’s functional across devices of all sizes.

## Getting Started

-   Some people will ask or explain “How to install Bootstrap”. Well, one doesn’t really need to “install” it. *Using* Bootstrap is a matter of referencing the appropriate CSS and/or JS files. You might have a build process or development environment that utilizes tools such as NPM or Nuget in which case you'll want [read the docs.](
https://getbootstrap.com/docs/4.1/getting-started/build-tools/)

-   You only need to know **how to reference Bootstrap on CDN.** As shown in the official [starter template](https://getbootstrap.com/docs/4.0/getting-started/introduction/#starter-template), the Bootstrap files can be referenced on [BootstrapCDN.](https://www.bootstrapcdn.com/)
    Just add the link to Bootstrap CSS in the HTML ```<head>``` tag for your webpage(s)…

     `` <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"> ``

    Then, the optional Bootstrap Javascript is added to a ` <script> ` tag before the closing ` </body> ` tag.

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>

## Goal
-   Provide quick start template for projects with flavour of Bootstrap.
-   Provide a range of features that are common to large classes of projects.

## Prerequisites
-   Should have a good grip on HTML and CSS
-   Prior basic knowledge on Bootstrap components would be beneficial; however not mandatory

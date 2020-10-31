## Starter Template

```
<?php
	switch ($_SERVER["SCRIPT_NAME"]) {
		case "/php-template/about.php":
			$CURRENT_PAGE = "About"; 
			$PAGE_TITLE = "About Us";
			break;
		case "/php-template/contact.php":
			$CURRENT_PAGE = "Contact"; 
			$PAGE_TITLE = "Contact Us";
			break;
		default:
			$CURRENT_PAGE = "Index";
			$PAGE_TITLE = "Welcome to my homepage!";
	}
?>
```
In this example, the config file detects which page you’re on, and sets some variables that will later display that content. If you’re using a database, the connection string would also go here.
Back to the template, you’ll notice I put everything in the HEAD tag in its own separate file.

### Contents imported to the HEAD tag: 

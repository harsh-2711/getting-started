A basic template that consists of the essential elements that are required to start building a React application.

### `Generate a New React App Using Create React App`

*   Create React App (CRA) is a tool to create a blank React app using a single terminal command.<br />
*   Configuring a modern React app from scratch can be quite intricate, and requires a fair amount of research and tinkering with build tools such     as Webpack, or compilers like Babel.
*   If we wants to spend more time coding and less time configuring then the best way to create React appliation is to use [Create React App tool](https://github.com/facebook/create-react-app).
*   Command to create React App<br/>
    `npx create-react-app react-template`
*   This command will generates  all of the files, folders, and libraries needed, as well as automatically configure React App.
*   Once Create React App has finished downloading all of the required packages, modules and scripts, it will configure webpack and new folder      named react-template will be created.
*   To open project in vscode first move to project folder and run following command.<br/>
    `cd react-template`<br/>
    `. code `
 
 ### `Run the React App`
 *   Start the React app by typing npm start into the terminal at root folder level.
 *   Changes made to the React app code are automatically shown in the browser thanks to hot reloading.
 *   Hot reloading means that any changes we make to the running app’s code will automatically refresh the app in the browser to reflect those     changes. It basically saves us that extra key stroke of having to refresh the browser window.
 *   To stop the React app by press Ctrl + C in the terminal.
 
### `Understand the Folder Structure`
*   There are three top level sub-folders:
    *   __/node_modules:__ Where all of the external libraries used to piece together the React app are located. You shouldn’t modify any of the code inside this folder as that would be modifying a third party library, and your changes would be overwritten the next time you run the npm install command.
    *   __/public:__ Assets that aren’t compiled or dynamically generated are stored here. These can be static assets like logos or the robots.txt  file.
    *   __/src:__  The src, or source folder contains all of our React components, external CSS files, and dynamic assets that we’ll bring into our component files.
*   At a high level React has one index.html page that contains a single div element (the root node). When a React app compiles, it mounts the entry component — App.js(default) — to that root node using JavaScript.

### `Create a Hello World React Component`
*   A React component is written as either a .JSX file or .JS file.
*   The component file contains both the logic and the view, written in JavaScript and HTML, respectively.
*   JSX enables us to write JavaScript inside of HTML, tying together the component’s logic and view code.
*   Create components folder in src. create `HelloWorld.jsx` file inside components.
*   This component contains Hello World text wrapped into header tag  and will return as a view.

### `Use the Hello World React Component`
*   Imports are made at the top of a React component.
*   React components are imported into other React components before using them.
*   To use Hello World component instead of default App.js do changes in index.js.
*   Save index.js. Hot reload will replace App.js with HelloWorld.jsx made in starter project.

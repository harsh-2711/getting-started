import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import * as serviceWorker from './serviceWorker';
import HelloWorld from './components/HelloWorld';

ReactDOM.render(
  <React.StrictMode>
    <HelloWorld/>
  </React.StrictMode>,
  document.getElementById('root')
);

serviceWorker.unregister();

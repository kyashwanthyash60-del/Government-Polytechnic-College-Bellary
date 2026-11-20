# Program 14 – Demonstration of React Context

## Folder structure
```
src/
  App.js
  userContext.js
  components/
    ComponentA.js
    ComponentB.js
    ComponentC.js
```

## userContext.js
```jsx
import React from 'react';
const UserContext = React.createContext();
const UserProvider = UserContext.Provider;
const UserConsumer = UserContext.Consumer;
export { UserProvider, UserConsumer };
```

## components/ComponentA.js
```jsx
import React, { Component } from 'react';
import ComponentB from './ComponentB';
class ComponentA extends Component {
  render() { return <ComponentB />; }
}
export default ComponentA;
```

## components/ComponentB.js
```jsx
import React, { Component } from 'react';
import ComponentC from './ComponentC';
class ComponentB extends Component {
  render() { return <ComponentC />; }
}
export default ComponentB;
```

## components/ComponentC.js
```jsx
import React, { Component } from 'react';
import { UserConsumer } from '../userContext';
class ComponentC extends Component {
  render() {
    return <UserConsumer>{username => <div>Hello {username}</div>}</UserConsumer>;
  }
}
export default ComponentC;
```

## App.js
```jsx
import React, { Component } from 'react';
import './App.css';
import { UserProvider } from './userContext';
import ComponentA from './components/ComponentA';
class App extends Component {
  render() {
    return <div className="App"><UserProvider value="Irfan"><ComponentA /></UserProvider></div>;
  }
}
export default App;
```

The manual has a few import-path and JSX typographical errors; paths and tags are corrected here so the Context demonstration runs.

# Program 11 – Demonstrate handling events in React

Create a React app and replace `src/App.js` with the following example. Run with `npm start`.

React event names use camelCase (for example, `onClick`) and handlers are passed in curly braces.

## App.js
```jsx
import React from 'react';

function Football() {
  const shoot = () => {
    alert("Great Shot!");
  };
  return <button onClick={shoot}>Take the shot!</button>;
}

export default Football;
```

## Passing an argument
Use an arrow function to pass an argument to the handler:

```jsx
const shoot = (message) => alert(message);
<button onClick={() => shoot("Goal!")}>Take the shot!</button>
```

## React event object
The event object can be passed to the handler to inspect the event type:

```jsx
const shoot = (message, event) => alert(event.type);
<button onClick={(event) => shoot("Goal!", event)}>Take the shot!</button>
```

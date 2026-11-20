# Program 10 – Demonstrate React Props

## Run
Create a React app, place the files below in `src`, and run `npm start`.

## App.js
```jsx
import React from 'react';
import Classprops from './Classprops';
import Functionprops from './Functionprops';

class App extends React.Component {
  render() {
    return (
      <div>
        <Classprops name="Learner1" place="Bagepalli" />
        <p>Child Component</p>
        <Classprops name="Learner2" place="Bangalore" />
        <button>Click</button>
        <Classprops name="Learner3" place="Mysore" />
        <Functionprops name="Learner4" place="Madikeri" />
      </div>
    );
  }
}
export default App;
```

## Functionprops.js
```jsx
import React from 'react';
function Functionprops(props) {
  return (
    <div>
      <h3>This is functional component</h3>
      <h3>Hello {props.name} from {props.place} Welcome to reactjs props</h3>
    </div>
  );
}
export default Functionprops;
```

## Classprops.js
```jsx
import React, { Component } from 'react';
class Classprops extends Component {
  render() {
    return (
      <div>
        <h1>Hello {this.props.name} from {this.props.place} Welcome to react props</h1>
        <p>{this.props.children}</p>
      </div>
    );
  }
}
export default Classprops;
```

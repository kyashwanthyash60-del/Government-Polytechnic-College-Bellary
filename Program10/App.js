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

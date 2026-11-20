import React, { Component } from 'react';
import './App.css';
import { UserProvider } from './userContext';
import ComponentA from './components/ComponentA';

class App extends Component {
  render() {
    return (
      <div className="App">
        <UserProvider value="Irfan">
          <ComponentA />
        </UserProvider>
      </div>
    );
  }
}
export default App;

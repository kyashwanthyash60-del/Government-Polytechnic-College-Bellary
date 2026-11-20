# Program 13 – Test a single-page registration application using React

## Setup
1. Install Node.js.
2. Create the app with `npx create-react-app program13`.
3. Open the folder and work in `src`.
4. Add the component below and render it from `App.js`.

## Hello.js
```jsx
import { useState } from 'react';
import './App.css';

export default function Form() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [submitted, setSubmitted] = useState(false);

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!name || !email || !password) {
      alert('Please enter all the fields');
    } else {
      setSubmitted(true);
    }
  };

  return (
    <div className="form">
      <h1>Login to GPT Bagepalli Website</h1>
      {submitted && <div className="success"><h2>User {name} successfully registered!!</h2></div>}
      <form onSubmit={handleSubmit}>
        <fieldset>
          <label>Name</label>
          <input value={name} onChange={e => setName(e.target.value)} type="text" />
          <label>Email</label>
          <input value={email} onChange={e => setEmail(e.target.value)} type="email" />
          <label>Password</label>
          <input value={password} onChange={e => setPassword(e.target.value)} type="password" />
          <button type="submit">Submit</button>
        </fieldset>
      </form>
    </div>
  );
}
```

## App.js
```jsx
import Form from './Hello';
export default function App() { return <Form />; }
```

## App.css
```css
.form { max-width: 520px; margin: 40px auto; font-family: Arial, sans-serif; }
.form fieldset { display: grid; gap: 10px; padding: 20px; }
.form input { width: 100%; padding: 10px; box-sizing: border-box; }
.form button { padding: 10px 18px; cursor: pointer; }
.success { color: green; }
```

**Source note:** The supplied manual code is continued across PDF pages 34–36; this version reconstructs the complete component and keeps its state, validation and success message behavior.

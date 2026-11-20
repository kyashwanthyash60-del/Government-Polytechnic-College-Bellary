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

import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import RegistrationForm from './components/RegistrationForm';
import SuccessPage from './components/SuccessPage';
import LoginForm from './components/LoginForm';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<RegistrationForm />} />
        <Route path="/success" element={<SuccessPage />} />
        <Route path="/login" element={<LoginForm/>} />
      </Routes>
    </Router>
  );
}

export default App;
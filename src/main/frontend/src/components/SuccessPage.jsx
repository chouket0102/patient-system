import { useLocation } from 'react-router-dom';

const SuccessPage = () => {
  const { state } = useLocation();
  
  return (
    <div>
      <h1>Hi {state?.name}, you are successfully registered!</h1>
    </div>
  );
};

export default SuccessPage;
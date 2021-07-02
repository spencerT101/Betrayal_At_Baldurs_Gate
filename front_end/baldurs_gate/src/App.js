import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

function App() {

  const [text, setText] = useState([])

  useEffect(() => {
    setText()
    
  }, [])

 const sayHI = "http://localhost:8080/api/test/kieran"

 const fetchapi= function(){
   fetch(sayHI)
  .then(response => response.text())
   .then(data => setText(data))
 }
 
const handleClick = (event) =>{
  
   console.log('hello gorgeous')
   setText('hello gorgeous')
}


  return (
    <>
    <div>

  <button onClick={fetchapi}>Hi</button>
  <p>{text}</p>

    </div>
    </>
  );
}

export default App;

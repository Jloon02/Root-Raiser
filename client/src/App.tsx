import { useState } from "react";
import { Buttonn } from "./pages/button";
import {  ListComponent} from "./ListComponent";


function App() {

  const [components, setComponents] = useState([""]); 
  
  function addComponent() { 
    
    setComponents([...components, "Sample Component"]) 
    
  } 

  return (
    <div className="App">

      <div> 
    
    <Buttonn onClick={addComponent} text="Call Component"/> 
    {components.map((item, i) => ( <ListComponent text={item} /> ))} 
    
    </div> 
    </div>
  );
}

export default App;

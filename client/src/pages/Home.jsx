import { Box, Text, Heading, Button, Input } from "@chakra-ui/react";
import PropertyCard from "components/PropertyCard";
import SearchBar from "components/searchBar";
import { loremIpsum } from "lorem-ipsum";
import { useState } from "react";
import { Buttonn } from "./button";
const Home = () => {
  const [components, setComponents] = useState([""]); 
  
  function addComponent() { 
    
    setComponents([...components, productName]) 
    
  } 

  const [productName, setProductName] = useState('');
  const [productPrice, setProductPrice] = useState('');
  

  const handleChange = (event) => {
    // 👇 Get input value from "event"
    setProductName(event.target.value);
    setProductPrice(event.target.value)

  };
  return (
    <>



      <PropertyCard/>

    </>
  );
};

export default Home;


/* Write a button component */ 
import { Box, Text, Heading, Button,  } from "@chakra-ui/react";
import React from 'react'; 
import { Form } from "react-router-dom";

const Buttonn = (props:any) => { 
  
  return ( 
    <>
    <input type="text" />
    <Button className="AddButton" onClick={props.onClick}>{props.text}</Button> 
    </>

    
  ); 
  
} 

export {Buttonn};
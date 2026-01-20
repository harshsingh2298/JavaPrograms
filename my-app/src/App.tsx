import React from 'react';
import './App.css';
import { Welcome } from './Welcome';
import { ToggleButton } from './ToggleButton';
import { UserForm } from './UserForm';
import { Message } from './Message';
import { ListGroup } from './ListGroup';
import Register from './Register';


// let name:string ;
// name= "harsh";

// let hobbie:string[];
// let role:[number,string]; role=[5,"harsh"];

// type Person = {
//   name:string;
//   age:number | string;
// };

// interface Person4  {
//   name:string;
//   age:number | string;
// };

// type Person1 = {
//   name:string;
//   age:number | string;
// };
// type Person = Person1 &{
//   name1:string;
//   age1:number | string;
// };
 
// let person: Person ={
//   name1:"harsh",
//   age1:25,
//   name:"singh",
//   age:45
// }
// // let person: Person={
// //   name:"harsh",
// //   age:34

// // }
// // alert(person);
// function printName(name: string){
//   console.log(name);
// }
// printName("harsh");

// let student : (studentName:string,studentId:number)=>never;
// // let lotOfPerson: Person[];

// function sum(a:number,b:number){
//   return a+b;
// }
// interface Iprops {
//   a:number,
//   b:number
// }

// function SumComponent(props:Iprops){
//   return <>{props.a+props.b}</>;
// }
//------------------------------------------- through Another class component----------------------------------------------------------
function App() {
  
  return (
    <>
    
    <div>
      <Register/>
    </div>
    
    
    
    </>
    // <><div className="App">
    //   <Welcome name="Harsh"/>
    //   <Welcome name="Singh"/>
    //   <ToggleButton></ToggleButton>
    //   <div><Message/></div>
    //   <div><ListGroup/></div>

    //   Hello World
    // </div>
    
    // <div>
    //    sum of numbers {value}<br></br>
    //     sum of two number with components <SumComponent a={5} b={3}/>
    
  );
}

export default App;
 
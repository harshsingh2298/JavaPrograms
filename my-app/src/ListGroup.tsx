import { link } from "fs";
import { MouseEvent, useState } from "react";
export function ListGroup(){
    let items = [
        'London',
        'San Francisco',
        'Tokyo',
        'New York',
        'Delhi'
    ]
    let selectedIndex = 0;
    //Hook
    const arr = useState(-1);
    arr[0] //variable selected index
    arr[1] // updater function

    //An event handler--------
    const handleClick = (event: MouseEvent)=> console.log(event)

 return (
    <ul className="list-group">
   { items.map((item,index) => (
   <li 
         className={selectedIndex===index? 'list-group-item active':'list-group-item'}
         key={item}
         onClick={handleClick}>
         {item}</li>))}
    </ul>);
}
import { useState } from "react";

interface IuserForm{
    name:string;
    age:number;
}
const defaultFormValue ={
    name:'',
    age:0
}

export function UserForm(){
    const [form, setForm] = useState<IuserForm>(defaultFormValue)

const onChangeName = (event:any)=>{
    setForm({
        ...form,
        name:event.target.value
    });
    const onChangeAge = (event:any)=>{
        setForm({
            ...form,
            age:event.target.value
        });
}
    return
    (
        <div> 
            <input type="text"  name="userName" value={form.name} 
            onChange={onChangeName}/>


<input type="text"  name="UserAge" value={form.age} 
           onChange={onChangeAge}/>

        </div>
    )}
console.log('form',form);
}
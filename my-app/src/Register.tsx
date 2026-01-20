import { useState } from "react"
import { signUp } from "./services/user-service";
import { error } from "console";

interface Istate{
    user:{
        email:string,
        password:string
    };
}
const Register:React.FC = ()=>{
    const [state,setState] = useState<Istate>({
        user:{
            email:'',
            password:''
        },
    });
const handleChange  = (event:React.ChangeEvent<HTMLInputElement>):void =>{
        setState({
            user: {
                ...state.user,
                [event.target.name]: event.target.value,
            },
        });
 };

 const handleSubmit = (event:React.FormEvent<HTMLFormElement>):void=>
 {
    event.preventDefault();
    console.log(state.user);
    // Call Server ApI for sending the data
    signUp(state.user).then((resp)=>{
        console.log(resp)
        console.log("Success Log")
    }).catch((error: any)=>{
        console.log(error);
    })

    alert('>>>>>>>  login Success  <<<<<<<<<')

 }
        return (
            <>
            <div className="container">
                <h1>Register Form</h1>
            </div>
          <div >
      <form className="card p-4" onSubmit={handleSubmit}>
  <div className="mb-3">
    <label htmlFor="exampleInputEmail1" className="form-label">Email address  :</label><br></br>
    <input type="email" 
    name="email"
    value={state.user.email}
    onChange={handleChange}
     className="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" /><br></br>
    
  </div>
  <div className="mb-3">
    <label htmlFor="exampleInputPassword1" className="form-label">Password   :</label><br></br>
    <input type="password" 
    name="password"
    value={state.user.password}
    onChange={handleChange}
    className="form-control" id="exampleInputPassword1" />
  </div><br></br>
  <button type="submit" className="btn btn-primary">Submit
  </button>
</form><br></br>
<p>{JSON.stringify(state.user)}</p>
</div>  
            </>
        )
}
export default Register;
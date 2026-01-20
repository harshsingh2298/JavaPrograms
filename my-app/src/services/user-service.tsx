import {myAxios} from "./helper";

export const signUp=(user: { email: string; password: string; })=>{

    return myAxios
    .post('/user/save',user)
    .then((response)=> response.data);
}
export default signUp;
interface Iprops{
    name:string,

}


export function Welcome(props:Iprops){
    // return <div>{props.name}</div>;
    //or
    const {name} = props;
    return <div>{name}</div>;
  }
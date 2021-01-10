import { useEffect } from "react";

function Hello({message}: Props){
    useEffect(() => {
            console.log('iniciou Componente');
        }, []);

    return(
        <h1>Hello {message}!</h1>
    )
}

type Props = {
    message: String;
}

export default Hello;
const main = () => { 

let impares=document.querySelector("li:nth-child(odd");
console.log(impares);

impares.classList.add(".estilo1");

let pares=document.querySelector("li:nth-child(even)");
console.log(pares);

pares.classList.add(".estilo2");

}

const cambiarColor1 = (li)=>{
    let impares = document.querySelector("li:nth-child(odd)");
    impares.classList.add("estilo1");
}

const cambiarColor2 =(li)=>{
    let pares = document.querySelector("li:nth-child(even)");
    pares.classList.add("estilo2");
}
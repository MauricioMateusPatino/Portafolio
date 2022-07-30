window.addEventListener('load', ()=> {
    const form = document.querySelector('#formulario')
    const usuario = document.getElementById('usuario')
    const email = document.getElementById('email')
    const asunto = document.getElementById('asunto')
    const mensaje = document.getElementById('mensaje')

  
 
    form.addEventListener('submit', (e) => {
        e.preventDefault()
        validaCampos()
    })
    
    
    const validaCampos = ()=> {
        //se captura los valores ingresados por el usuario
        const usuarioValor = usuario.value.trim()
        const emailValor = email.value.trim()
        const asuntoValor = asunto.value.trim()
        const mensajeValor = mensaje.value.trim();
     
        //validando campo usuario
        (!usuarioValor) ? console.log('CAMPO VACIO') : console.log(usuarioValor)
        if(!usuarioValor){
            //console.log('CAMPO VACIO')
            validaFalla(usuario, 'Campo vacío')
        }else{
            validaOk(usuario)
        }

        //validando campo email
        (!emailValor) ? console.log('CAMPO VACIO') : console.log(emailValor)
        if(!emailValor){
            validaFalla(email, 'Campo vacío')            
        }else if(!validaEmail(emailValor)) {
            validaFalla(email, 'El e-mail no es válido')
        }else {
            validaOk(email)
        }
         //validando campo Asunto
        (!asuntoValor) ? console.log('CAMPO VACIO') : console.log(asuntoValor)
        if(!asuntoValor){
            //console.log('CAMPO VACIO')
            validaFalla(asunto, 'Campo vacío')
        }else{
            validaOk(asunto)
        }

        //validando campo mensaje
        (!mensajeValor) ? console.log('CAMPO VACIO') : console.log(mensajeValor)
        if(!mensajeValor){
            //console.log('CAMPO VACIO')
            validaFalla(mensaje, 'Campo vacío')
        }else{
            validaOk(mensaje)
        }


    }

    const validaFalla = (input, msje) => {
        const formControl = input.parentElement
        const aviso = formControl.querySelector('p')
        aviso.innerText = msje

        formControl.className = 'form-control falla'
    }
    const validaOk = (input, msje) => {
        const formControl = input.parentElement
        formControl.className = 'form-control ok'
    }

    const validaEmail = (email) => {
        return /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(email);        
    }

})
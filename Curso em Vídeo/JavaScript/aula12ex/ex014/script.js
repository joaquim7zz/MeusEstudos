function carregar() {
let msg = document.querySelector('#msg')

let img = document.getElementById('foto')
let data = new Date()
let hora = data.getHours()
msg.innerHTML = `Agora são ${hora} horas.`

if (hora >= 0 && hora < 12) {
    img.src = 'imagens/manha.jpg';
    document.body.style.background = '#e2cd9f'
    msg.innerHTML = 'Bom dia!'

} else if (hora >= 12 && hora <= 18) {
    img.src = 'imagens/tarde.jpg';
    document.body.style.background = '#b9846f'
     msg.innerHTML = 'Boa tarde!'
} else {
    img.src = 'imagens/noite.jpg';
    document.body.style.background = '#515154'
     msg.innerHTML = 'Boa noite!'
}
}
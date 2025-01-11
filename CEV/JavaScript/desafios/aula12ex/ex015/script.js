function verificar() {
    let data = new Date()
    let ano = data.getFullYear()
    let fano = document.querySelector('#ano')
    let res = document.querySelector('#res')

    if (fano.value.length == 0 || fano.value > ano ) {
        alert('Verifique os dados e tente novamente')
    } else {
        let sex = document.getElementsByName('sex')
        let idade = ano - Number(fano.value)
        let genero = ''

        let img = document.createElement('img')
        img.setAttribute('id', 'foto')

        if (sex[0].checked) {

            genero = 'Homem'

            if (idade >= 0 && idade < 10) {
                //criança
                img.setAttribute('src', 'image/criancaH.jpg')
            } else if (idade < 21) {
                //jovem
                img.setAttribute('src', 'image/jovemH.jpg')
            }  else if (idade < 50) {
                // adulto
                img.setAttribute('src', 'image/adulto.jpg')
            } else {
                // idoso
                img.setAttribute('src', 'image/idoso.jpg')
            }
        } else {

            genero =  'Mulher'

            if (idade >= 0 && idade < 10) {
                //criança
                img.setAttribute('src', 'image/criancaF.jpg')
            } else if (idade < 21) {
                //jovem
                img.setAttribute('src', 'image/jovemM.jpg')
            }  else if (idade < 50) {
                // adulto
                img.setAttribute('src', 'image/adulta.jpg')
            } else {
                // idoso
                img.setAttribute('src', 'image/idosa.jpg')
            }
        }

        res.innerHTML = `${genero} com ${idade} anos`
        res.appendChild(img)

    }
}
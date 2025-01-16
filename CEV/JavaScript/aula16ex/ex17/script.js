let num = document.querySelector('#num')
let lista = document.querySelector('#lista')
let res = document.querySelector('#res')
let vetores = []

function isNumero(n) {
    if (Number(n) >= 1 && Number(n) <= 100) {
        return true

    } else {
        return false
    }
}

function inLista(n, l) {
    if (l.indexOf(Number(n)) != -1) {
        return true

    } else {
        return false
    }
}

function adicionar() {
    if (isNumero(num.value) && !inLista(num.value, vetores)) {
        vetores.push(Number(num.value))
        let item = document.createElement('option')
        item.text = `Valor ${num.value} adicionado`
        lista.appendChild(item)
        res.innerHTML = ''
    } else {
        alert('Valor invalido ou já encontrado na lista')
    }
    num.value = ''
    num.focus()
}

function finalizar() {
    if (vetores.length == 0) {
        alert('Adicione valores antes de finalizar!')
    } else {
        let tot = vetores.length
        let maior = vetores[0]
        let menor = vetores[0]
        for (let pos in vetores) {
            if (vetores[pos] > maior) {
                maior = vetores[pos]
            } if (vetores[pos] < menor) {
                menor = vetores[pos]
            }
            res.innerHTML = ''
            res.innerHTML += `<p>Ao todo, temos ${tot} números cadastrados </p>`
            res.innerHTML += `<p>O maior valor informado foi ${maior}</p>`
            res.innerHTML += `<p>O menor valor informado foi ${menor}</p>`

        }
    }
}
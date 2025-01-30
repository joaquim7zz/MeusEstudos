function contar() {
    let inicio = document.querySelector('#inicio')
    let fim = document.querySelector('#fim')
    let passo = document.querySelector('#passo')
    let res = document.querySelector('#res')

    if (inicio.value.length == 0 || fim.value.length == 0 || passo.value.length == 0) {
        alert('[ERRO] Digite todos os dados corretamente')
    } else {
        res.innerHTML = 'Contando: '
        let i = Number(inicio.value)
        let f = Number(fim.value)
        let p = Number(passo.value)
        
        if (p <= 0) {
            alert('Passo inválido! Considerando PASSO 1')
            p = 1
        }

        if (i < f) {
        for (let c = i; c <= f; c += p) {
            res.innerHTML += ` ${c} \u{1F603}`
        }
        
         } else {
            for (let c  = i; c >= f; c -= p)
                res.innerHTML += ` ${c} \u{1F603}`
         }
         res.innerHTML += '\u{1F3C1}'
    } 
}
function tabuada() {
    let num = document.querySelector('#num')
    let tabu = document.querySelector('#tabsel')

    if (num.value.length == 0) {
        alert('Digite um número válido')
    } else {
        let n = Number(num.value)
        let c = 1
        tabu.innerHTML = ''
        while (c <= 10) {
            let item = document.createElement('option')
            item.text = `${n} X ${c} = ${n*c}`
            tabu.appendChild(item)
            c++
        }
    }
}
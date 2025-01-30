let num = [0, 5, 3, 6, 4]
num.sort()
console.log(num)
console.log(`${num.length} posições`)
console.log(`primeiro valor ${num[0]}`) 

let pos = num.indexOf(3)
if (pos == -1) {
    console.log('Valor não encontrado')
} else {
    console.log(`O valor está na posição ${pos} `)
}
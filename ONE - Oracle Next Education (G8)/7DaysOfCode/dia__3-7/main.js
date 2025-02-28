let area = document.querySelector('.area');
let linguagem = document.querySelector('.linguagem');
let seguirArea = document.querySelector('.seguirArea');
let outrasLinguagens = document.querySelector('.outrasLinguagens');

//1. Se quer seguir para área de Front-End ou seguir para a área de Back-End.

let escolhaArea = prompt('Front-End [1] | Back-End [2]');
escolhaArea = Number(escolhaArea);

while (escolhaArea !== 1 &&  escolhaArea !== 2) {
    escolhaArea = Number(prompt('Escolha uma opção válida: FrontEnd [1] | BackEnd [2]'));
}

if (escolhaArea === 1) {
    area.innerHTML = 'Area: Front-End';
}else {
    area.innerHTML = 'Area: Back-End';
}

//2. Caso esteja na área de Front-End, se quer aprender React ou aprender Vue. Caso esteja na área de Back-End, poderá aprender C# ou aprender Java.
 
if (escolhaArea == 1){
    linguagem.innerHTML = 'Você pode aprender React ou Vue para aperfeiçoar suas habilidades em Front-End'
} else {
    linguagem.innerHTML = 'Você pode aprender C# ou Java para aperfeiçoar suas habilidades em Back-End'
}

// 3. Depois, independente das escolhas anteriores, o usuário poderá escolher entre seguir se especializando na área escolhida ou seguir se desenvolvendo para se tornar Fullstack. Você deve exibir na tela uma mensagem específica para cada escolha.

let carreira = prompt('Você vai seguir se especializando na área escolhida? [sim] [não]')


let formatCarreira = escolhaArea === 1 ? "Front-End" : "Back-End";

if (carreira.toLowerCase() == "sim"){
    seguirArea.innerHTML = `você irá seguir carreira como ${formatCarreira}`
} else if (carreira.toLowerCase() == "não") {
    seguirArea.innerHTML= `Você irá seguir carreira como Fullstack`
}
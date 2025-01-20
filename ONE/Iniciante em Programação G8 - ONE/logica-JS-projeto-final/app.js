let numeroSecreto = gerarNumeroAleatorio();
let tentativas = 1;

function exibirTextoNaTela(tag, texto) {
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

function exibirMensagemInicial() {
exibirTextoNaTela('h1', 'Jogo do número secreto');
exibirTextoNaTela('p', 'Escolha um número entre 1 e 10:');
}

exibirMensagemInicial()

function verificarChute() {
    let chute = document.querySelector('input').value;

    if (chute == numeroSecreto) {
        exibirTextoNaTela('h1', 'Você acertou!!!!');
        let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentaviva';
        let mensagemTentativas = `Você descobriu o núemero secreto com ${tentativas} ${palavraTentativa}`;
        exibirTextoNaTela('P', mensagemTentativas);
        document.getElementById('reiniciar').removeAttribute('disabled')
    } else if (chute > numeroSecreto) {
        exibirTextoNaTela('p', `O numero secreto é menor que ${chute}`);
    } else {
        exibirTextoNaTela('p', `O número secreto é maior que ${chute}`);
    } 
    tentativas++; //Conta quantidade de tentativas 
    limparCampo()

}

function gerarNumeroAleatorio() {
    return parseInt(Math.random() * 10 + 1);

}

function limparCampo() {
    chute = document.querySelector('input');
    chute.value = '';
}

function reiniciarJogo() {
    numeroSecreto = gerarNumeroAleatorio();
    limparCampo();
    tentativas = 1;
    exibirMensagemInicial()
    document.getElementById('reiniciar').setAttribute('disabled', true)
    
}
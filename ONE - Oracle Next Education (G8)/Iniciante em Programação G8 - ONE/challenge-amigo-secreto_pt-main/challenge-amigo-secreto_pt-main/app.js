let nomeAmigos = [];

function adicionarAmigo() {
  let inputAmigo = document.getElementById('amigo');
  let nome = inputAmigo.value.trim();

  if (nome === '') {
    exibirTexto('h2', 'Por favor, insira um nome válido.');
    return;
  }

  if (nomeAmigos.includes(nome)) {
    exibirTexto('h2','Nome já adicionado!');
    return;
  }

  limparMensagem();
  nomeAmigos.push(nome);
  atualizarListaAmigos();
  inputAmigo.value = '';
}

function reiniciar() {
  nomeAmigos = [];
  atualizarListaAmigos();
  limparMensagem();
  let resultado = document.getElementById('resultado');
  resultado.innerHTML = '';
}

function atualizarListaAmigos() {
  let listaElement = document.getElementById('listaAmigos');
  listaElement.innerHTML = '';

  nomeAmigos.forEach((amigo) => {
    let li = document.createElement('li');
    li.textContent = amigo;
    listaElement.appendChild(li);
  });
}

function sortearAmigo() {
  if (nomeAmigos.length < 1) {
    exibirTexto('h2', 'Adicione pelo menos dois nomes para sortear.');
    msg.classList.add('erro');
    return;
  }

  limparMensagem();

  const indiceSorteado = Math.floor(Math.random() * nomeAmigos.length);
  let amigoSorteado = nomeAmigos[indiceSorteado];

  nomeAmigos.splice(indiceSorteado, 1);
  atualizarListaAmigos();

  let resultadoSorteio = document.getElementById('resultado');
  resultadoSorteio.innerHTML = '';

  let li = document.createElement('li');
  li.textContent = amigoSorteado;
  resultadoSorteio.appendChild(li);
}

function exibirTexto(tag, texto) {
  let element = document.querySelector(tag);
  if (!element) {
    element = document.createElement(tag);
    document.body.appendChild(element);
  }
  element.innerHTML = texto;
  return element;
}

function textoNaTela() {
  exibirTexto('h2', 'Digite o nome dos seus amigos');
}

function limparMensagem() {
  let mensagem = document.querySelector('h2');
  if (mensagem) {
    mensagem.innerHTML = '';
    mensagem.classList.remove('erro');
  }
}

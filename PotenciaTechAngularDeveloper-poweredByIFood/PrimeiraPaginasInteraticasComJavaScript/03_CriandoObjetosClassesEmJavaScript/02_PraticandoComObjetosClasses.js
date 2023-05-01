class Carro{
    marca;
    cor;
    gastoMedioPorKm;

    constructor(pMarca, pCor, pGastoMedioPorKm){
        this.marca = pMarca;
        this.cor = pCor;
        this.gastoMedioPorKm = pGastoMedioPorKm;
    }

    calcularViagem(pDistancia, pPrecoCombustivel){
        return this.gastoMedioPorKm * pDistancia * pPrecoCombustivel;
    }
}

const uno = new Carro('Fiat','Prato',1/12);
console.log(uno.calcularViagem(100,3));

class Pessoa {
    nome;
    peso;
    altura;

    constructor(pNome, pPeso, pAltura){
        this.nome = pNome;
        this.peso = pPeso;
        this.altura = pAltura;
    }

    calcularImc(){
        return this.peso / (this.altura*2);
    }
}

const pedro = new Pessoa('Pedro', 87, 1.72);
console.log(pedro);
console.log(pedro.calcularImc());
function imc(peso, altura){
    return (peso / Math.pow(altura,2));
}

function classificacao(imc){
    if (imc <= 18.5){
        return 'Abaixo do peso';
    } else if (imc <= 25){
        return 'Peso normal';
    } else if (imc <= 30){
        return 'Acima do peso';
    } else if (imc <= 40){
        return 'Obeso';
    } else {
        return 'Obeso morbida';
    }
}

function calculoImc(){
    const peso = 70;
    const altura = 1.70;
    const vIMC = imc(peso, altura);
    const classificacaoImg = classificacao(vIMC);

    console.log(imc);
    console.log(classificacaoImg);
}

calculoImc();

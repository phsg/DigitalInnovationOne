/*
1) Faça um algoritmo que dado as 3 notas tiradas por um alino em um semestre na faculdade
sua media e a sua classificação conforme a tabela abaixo:

Media = (nota1 + nota2 + nota3)/3;

Classificação:
-   <= 5 reprovado
    5 e 7 recuperação
    >= 7 aprovado
*/

const nota1= 5;
const nota2 = 3;
const nota3 = 7;
const media = (nota1+nota2+nota3)/3;

console.log("Media  = " + media);

if (media <= 5){
     console.log("Reprovado");
} else if (media >= 7){
     console.log("Reprovado");
} else {
    console.log("Recuperação");
}

/*
    Formula IMC = Peso/(altura * altura)
    < 18.5 Abaixo do peso
    18.5 e 25 peso normal
    25 e 30 acima do peso;
    30 e 40 obeso
    > 40 obeso morbido
*/

const peso = 70;
const altura = 1.70;
const imc = peso / Math.pow(altura,2);

console.log(imc);

if (imc <= 18.5){
    console.log('Abaixo do peso');
} else if (imc <= 25){
    console.log('Peso normal');
} else if (imc <= 30){
    console.log('Acima do peso');
} else if (imc <= 40){
    console.log('Obeso');
} else {
    console.log('Obeso morbida');
}

/*
    - 1 A vista debito -10%
    - 2 A vista  dinheiro ou pix -15%
    - 3 2x preço normal
    - 3 >2x preço + juros 10%

*/
const preco = 100;
const formaPagamento = 3;
const parcelas=3;

if (formaPagamento === 1){
    console.log(preco*0.9);
} else if (formaPagamento === 2){
    console.log(preco*0.85);
} else {
    if (parcelas === 2){
        console.log(preco);
    } else {
        console.log(preco*1.1);
    }
}

const numero = 10;
    const numeroEmTexto = '10';
    console.log(numero === numeroEmTexto);
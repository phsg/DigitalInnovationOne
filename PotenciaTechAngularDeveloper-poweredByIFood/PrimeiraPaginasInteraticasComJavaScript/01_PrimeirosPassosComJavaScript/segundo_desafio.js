/*
Faça um programa para calcular o valor de uma viagem

Voce tera 3 variaveis, sendo elas:
1-Preço do etanol;
2-Preço da gasolina;
3-O tipo de combustivel que esta no carro;
4-Gasto medio de combustivel do carro por km;
5-Distancia em KM da viagem;

Imprima no console o valor que sera gasto para realizar esta viagem.

Write a program to calculate the cost of a trip

You will have 3 variables, namely:
1-Fuel price;
2-Average fuel consumption of the car per km;
3-Distance in KM of the trip;
*/

const PRECO_ETANOL = 4.47;
const PRECO_GASOLINA = 5.59;
const CONSUMO = 13; //km/l
const DISTANCIA = 1870;
const COMBUSTIVEL_ETANOL = 'Etanol';

let tipoCombustivel = 'Etanol';
let valorGasto;
let consumoCombustivel;

consumoCombustivel = DISTANCIA / CONSUMO;

if (tipoCombustivel === COMBUSTIVEL_ETANOL){
    valorGasto = consumoCombustivel * PRECO_ETANOL;
} else {
    valorGasto = consumoCombustivel * PRECO_GASOLINA;
}

console.log("Consumo litros = " + consumoCombustivel);
console.log("Gasto = " + valorGasto);


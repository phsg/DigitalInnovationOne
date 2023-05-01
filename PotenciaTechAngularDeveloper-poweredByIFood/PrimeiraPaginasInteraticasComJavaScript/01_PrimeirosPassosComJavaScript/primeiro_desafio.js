/*
Faça um programa para calcular o valor de uma viagem

Voce tera 3 variaveis, sendo elas:
1-Preço do combustivel;
2-Gasto medio de combustivel do carro por km;
3-Distancia em KM da viagem;

Write a program to calculate the cost of a trip

You will have 3 variables, namely:
1-Fuel price;
2-Average fuel consumption of the car per km;
3-Distance in KM of the trip;
*/

const PRECO_COMBUSTIVEL = 5.59;
const CONSUMO = 13; //km/l
const DISTANCIA = 1870;

console.log((DISTANCIA/CONSUMO) * PRECO_COMBUSTIVEL);


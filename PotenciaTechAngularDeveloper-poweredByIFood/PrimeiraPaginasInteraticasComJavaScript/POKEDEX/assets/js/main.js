const offset = 0;
const limit = 10;
const aUrl = `https://pokeapi.co/api/v2/pokemon?limit=${limit}&offset=${offset}`;

function convertPokemonToLi(pokemon) {
    return `
        <li class="pokemon ${pokemon.type}">
            <span class="number">#${pokemon.number}</span>
            <span class="name">${pokemon.name}</span>

            <div class="detail">
                <ol class="types">
                    <li class="type">Type</li>
                </ol>

                <img src="${pokemon.photo}"
                     alt="${pokemon.name}">
            </div>
        </li>
    `
}

const pokemonList = document.getElementById("pokemonList");
fetch(aUrl)
    .then((response) => response.json())
    .then((jsonBody) => jsonBody.results)
    .then((lista) => {
        for (let index = 0; index < lista.length; index++) {
            pokemonList.innerHTML += convertPokemonToLi(lista[index]);
        }
    })
    .catch((erro) => console.error(erro))

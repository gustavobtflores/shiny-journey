// return
// Retorna um valor de uma função
// O return encerra a função

/**
 * Retorna a soma de dois números.
 *
 * @param {number} a - O primeiro número a ser somado.
 * @param {number} b - O segundo número a ser somado.
 * @returns {number} A soma de `a` e `b`.
 *
 * @example
 * console.log(soma(1, 2)); // saída: 3
 */
function soma(a, b) {
  return a + b;
}

// funções aninhandas

/**
 * Retorna uma função `inner(inn)`. A função interna, quando chamada, retorna
 * a concatenação de uma string fornecida para a função externa (`out`) e uma
 * string fornecida para a função interna (`inn`), separadas por um espaço.
 *
 * @param {string} out - A string a ser concatenada na função interna.
 * @returns {function} A função `inner(inn)`.
 */
function outer(out) {
  /**
   * Retorna a concatenação de `out` e `inn`, separadas por um espaço.
   *
   * @param {string} inn - A string a ser concatenada com `out`.
   * @returns {string} A concatenação de `out` e `inn`, separadas por um espaço.
   */
  function inner(inn) {
    return out + " " + inn;
  }
  return inner;
}

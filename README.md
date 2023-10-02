# hashset

Nesse Trabalho utilizei Hash, sendo uma excelente abordagem para garantir dados únicos em uma estrutura. Temos diversos problemas com relação a reorganização da tabela quando removemos valores, pois deixa espaços em branco no meio da estrutura, mas não afeta na busca correta dos dados. Porém, seria muito mais custoso se usássemos uma árvore binária, pois nela dependeríamos de vários fatores, como ordem de inserção e balanceamento por exemplo.

Levando em consideração que a árvore binária tem complexidade O(log n), então é fácil notar que para casos onde o volume de dados é muito grande, haverá uma perda de performance considerável. Do contrário a tabela hash lida bem com grandes volumes de dados, pois ela calcula o índice e vai direto para a região correspondente no array, tendo uma complexidade de O(1).


tempos e complexidade das funções: 

insert: 
 tempo: O(1), mas também pode ser O(n) caso precise dobrar o tamanho do hash.
 espaço: O(1), na inserção de 1 elemento. 
 
 contains: 
 tempo: O(1), mas se desconsiderarmos o tempo de geração do hash e também levando em consideração que não haverão muitas colisões. 
 espaço: O(1), pois não muda nada em questão de memória. 
 
 remove: 
 tempo: O(1), nesse caso a gente só está indo até o valor e fazendo com que os bits daquela região fiquem inválidos, então tem custo constante.
 espaço: O(1), não adiciona espaço.
 
 union: 
 tempo: O(n), pois ele faz a inserção de n elementos, sendo assim o resultado da união de 2 hashSets. 
 espaço: O(n), pois precisa adicionar n valores
 
 intersection: 
tempo: O(n), pois ele vai buscar os valores que são presentes nos dois grupos, sendo feita uma interação em 1 dos hashSet para buscar no outro hashSet. Caso o valor buscado seja encontrado, esse valor será colocado em um hashSet "resultado".
 espaço: O(n), pois estará gerando um outro conjunto resultante 
 
 diferença:
tempo: O(n), pois faremos a contrução de um novo hashSet para o resultado da diferença entre os conjuntos. De maneira que perguntaremos se o que tem em um dos hashSet existe no outro e caso não exista ele será adicionado em um hashSet resultado.
espaço: O(n), pois estará gerando um outro conjunto resultante

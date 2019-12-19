# Programa em java implementando o algoritimo first fit

 *No primeiro ajuste, a partição é alocada, o que é suficiente pela primeira vez na parte superior da Memória principal.
Sua vantagem é que é a pesquisa mais rápida, pois pesquisa apenas o primeiro bloco, ou seja, o suficiente para atribuir um processo.
Pode haver problemas em não permitir que os processos ocupem espaço, mesmo que fosse possível alocar. Considere o exemplo acima, o processo número 4 (do tamanho 426) não obtém memória. No entanto, era possível alocar memória se tivéssemos alocado usando a alocação de melhor ajuste [número do bloco 4 (do tamanho 300) para o processo 1, número do bloco 2 para o processo 2, número do bloco 3 para o processo 3 e número do bloco 5 para o processo 4].
Implementação:
1- Entrada de blocos de memória com tamanho e processos com tamanho.
2- Inicialize todos os blocos de memória como livres.
3- Comece escolhendo cada processo e verifique se pode
   ser atribuído ao bloco atual. 
4- Se tamanho do processo <= tamanho do bloco, se sim, então 
   atribuir e verificar o próximo processo.
5- Caso contrário, continue verificando os outros blocos.
primeiro ajuste

Abaixo está uma implementação das etapas acima.

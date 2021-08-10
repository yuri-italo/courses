# Exercício de fixação

Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade),
conforme exemplo.



## EXAMPLE

**Source file:**<br>

TV LED,1290.99,1<br>
Video Game Chair,350.50,3<br>
Iphone X,900.00,2<br>
Samsung Galaxy 9,850.00,2<br>

**Output file (out/summary.csv):**<br>

TV LED,1290.99<br>
Video Game Chair,1051.50<br>
Iphone X,1800.00<br>
Samsung Galaxy 9,1700.00<br>
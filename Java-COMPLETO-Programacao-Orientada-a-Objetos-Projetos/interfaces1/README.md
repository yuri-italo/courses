# Exercício de fixação

Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
número de meses desejado.

A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.

Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
e valor total do contrato). Em seguida, o programa deve ler o número de meses para
parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.



## EXAMPLE

Enter contract data<br>
Number: **8028**<br>
Date (dd/MM/yyyy): **25/06/2018**<br>
Contract value: **600.00**<br>
Enter number of installments: **3**<br>
Installments:<br>
25/07/2018 - 206.04<br>
25/08/2018 - 208.08<br>
25/09/2018 - 210.12<br>

### Calculations (1% monthly simple interest + 2% payment fee):

**Quota #1:** <br>
200 + 1% * 1 = 202 <br>
202 + 2% = 206.04<br>

**Quota #2:** <br>
200 + 1% * 2 = 204 <br>
204 + 2% = 208.08<br>

**Quota #3:** <br>
200 + 1% * 3 = 206 <br>
206 + 2% = 210.12<br>
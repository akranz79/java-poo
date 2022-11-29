A padaria da senhora Juliana está tecnologicamente atrasada. O sistema de controle é
realizado à moda antiga, caneta e um caderno de anotações. A padaria possui uma
grande clientela local, pois a senhora Juliana permite que os clientes anotem “na conta”
os produtos que estão levando e efetuem o pagamento no final do mês (pagamento
fiado). Uma das dificuldades da senhora Juliana calcular quanto tem a receber de fiado
no mês. Cansado desta situação, ele deseja um sistema para obter um melhor
gerenciamento.
O sistema deve manter um cadastro dos clientes. Dos clientes deseja-se registrar código
identificador, nome, endereço, telefone. Clientes podem ser de dois tipos: pessoas
físicas ou pessoas jurídicas (empresas). De pessoas físicas deseja-se registrar o CPF,
enquanto de pessoas jurídicas deseja-se registrar CNPJ e número de inscrição estadual.
Os produtos são cadastrados no sistema com as seguintes informações: código,
descrição, estoque mínimo, quantidade atual em estoque, valor de custo e percentual
de lucro. O valor de venda de um produto é calculado com base no valor de custo e
percentual de lucro.
Ao longo do mês, os funcionários da Padaria registram cada venda de produtos para
clientes.
Das vendas efetuadas pela padaria aos clientes são registrados o cliente, a data da venda
(dia e mês), o produto vendido, a quantidade vendida, meio de pagamento valor da
venda e o status (pago ou não). Novamente, o valor de cada venda pode ser calculado a
partir o valor de venda do produto e a quantidade vendida. Os meios de pagamento
aceito são: dinheiro, cheque, cartão de débito/crédito, ticket alimentação e fiado.
Para construir esse sistema você utilizará os conceitos de orientação a objetos vistos na
disciplina.
Segue abaixo o modelo de classes, com suas subclasses, interface e métodos para serem
construídos. Esse modelo foi construído para auxiliar vocês na criação das classes,
métodos, atributos, etc.
Após essa construção, você irá criar uma classe teste com o método MAIN, que irá criar
objetos dessas classes construídas.
Nesse método MAIN você irá criar um MENU para o funcionamento do sistema. O menu
deverá ter as seguintes funções.
1 – Cadastrar Venda (Antes de pedir os dados da Venda e realizar o cadastro, você deve
pedir para informar os dados do Produto e do Cliente relativos a Venda).
2 – Buscar Venda Realizada
3 – Apresentar o relatório de vendas
4 – Apresentar o relatório de vendas a partir de um mês informado pelo usuário
5 – Apresentar o relatório de vendas como meio de pagamento fiado
6 – Apresentar o relatório de vendas como meio de pagamento dinheiro
7 – Apresentar o relatório de vendas que ainda não foram pagas
OBS: O relatório de vendas deve ter todas as informações da venda. Como na venda tem
o objeto Produto e Cliente, você terá as informações do cliente e do produto
relacionados a venda que precisam também ser apresentadas. 

![image](https://user-images.githubusercontent.com/65457837/204441057-0dfdab32-628c-4970-bc4d-dc5f513dd831.png)

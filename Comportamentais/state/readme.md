# Padrão State

Objetivo: Reduzir a quantidade de IFs em um código (complexidade ciclomática).

**Caso de Uso**: Estados de um pedido de compra online.  
Pedido Confirmado > Pedido enviado > Pedido entregue  
Podendo haver também: Pedido Cancelado, Pedido Extraviado, Pedido devolvido;

![Diagrama de classes](state.png)

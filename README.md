# Estrutura de Dados I — Revisão de pilhas e filas

Atividades de console da aula 11 em Java. Os exercícios usam pilhas e filas para praticar remoção e transferência de elementos, ordem de atendimento e separação de números.

| Projeto | O que demonstra | Classe principal |
| --- | --- | --- |
| [Exercicio2](Exercicio2) | Remoção de uma chave de uma pilha | `exercicio2.RemoveItem` |
| [Exercicio3](Exercicio3) | Fila de espera e autorização de decolagem | `exercicio3.Principal` |
| [Exercicio4](Exercicio4) | Inversão da ordem dos números de uma fila com uma segunda fila | `exercicio4.Principal` |
| [Exercicio5](Exercicio5) | Separação de números sorteados em fila de valores distintos e pilha de repetidos | `exercicio5.Principal` |
| [Exercicio6](Exercicio6) | Uso do sinal do número para empilhar ou desempilhar | `exercicio6.Principal` |
| [Exercicio7](Exercicio7) | Processamento de 20 números informados no console | `exercicio7.Principal` |
| [Exercicio8](Exercicio8) | Uso de pilhas distintas para positivos e negativos | `exercicio8.Principal` |

## Como executar

Com JDK 17 ou superior, importe cada pasta como um projeto Eclipse existente. Para executar a demonstração de aviões no PowerShell, abra o terminal na raiz.

```powershell
$fontes = Get-ChildItem -Path Exercicio3/src -Recurse -Filter '*.java' | ForEach-Object FullName
javac -encoding UTF-8 -d build/Exercicio3 $fontes
java -cp build/Exercicio3 exercicio3.Principal
```

O exercício imprime um cenário com aviões já definidos no código. Os exercícios 2 e 7 solicitam números no console.

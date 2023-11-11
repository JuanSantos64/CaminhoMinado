# 💣 Caminho Minado

Sejam bem-vindos ao jogo Caminho Minado!

Ele consiste em um campo minado em 1 dimensão, você deve selecionar quantos caminhos terão e quantas bombas haverá no caminho minado. 

Esse jogo foi feito para aproveitar os estudos de arrays e ArrayList.

## 🕹 Mecanicas 

Conheça as mecanicas utilizadas nesse jogo:

### ⚠ Alerta de bomba próximo


```
if (chute < caminhoMinado.size() && caminhoMinado.get(chute) == -1) {
                    System.out.println("Tem bomba próximo");
                }
                else if (chute > 1 && caminhoMinado.get(chute - 2) == -1) {
                    System.out.println("Tem bomba próximo");
                }
```
Esse jogo tem uma mecânica que avisa quando tem uma bomba perto da posição que você escolheu, seu desafio é descobrir em qual dos lados essa bomba está, boa sorte!


### 🔐 Sistema contra trapaças


````
if(caminhoMinadoUsuario.get(chute-1).equals("X ")){
                System.out.println("Você não me engana, você tentou digitar o mesmo número pra acumular pontos, agora você perdeu...");
                System.out.println("Game Over");
                break;
            }
````

O jogo contém essa mecânica para que o usuário não possa escolher a mesma posição.


### Exibição do score final e do caminho minado

```
 System.out.println("Sua pontuação final é " + pontos + " pontos");
        System.out.println("Número de bombas: " + bomba);
        System.out.print("Caminho Minado: ");
        for (String string : caminhoMinadoUsuario) {
            System.out.print(string);
        }
```

O jogo ao final ou ao perder, mostra ao usuário seus pontos feitos, numeros de bombas escolhidas e o caminho minado visualmente.

#
![Logo](https://th.bing.com/th/id/OIG.4HPb8XMRnv3SC9eSlNkx?pid=ImgGn&w=1024&h=1024&rs=1)


# CrecheCaotica
https://medium.com/rolando-dados/rpg-os-10-monstros-mais-memor%C3%A1veis-de-dungeons-dragons-1e819984036

Conceito Geral

Você é um funcionário de uma creche de treinamento de elite com 10 crianças mutantes e 1 supercriança.
Seu objetivo é proteger todas as crianças de invasões de monstros ao longo de vários dias (capítulos).

⚠️ Regra principal:
Se qualquer criança morrer → você perde

🔁 Loop do Jogo
Escolher crianças para a batalha
Enfrentar invasão
Distribuir cura
Avançar para o próximo dia

🧩 Modelagem de Classes
Classe Pessoa
id
nome
poder
vida
dano

Classe Crianca
herda de Pessoa
viva (boolean)

Funções:

receber dano
curar
Classe Monstro
nome
vida
dano
xp

👶 Crianças
ID	Nome	Poder	Vida	Dano
0	Hello Kitty	Cura	50	3
1	Kuromi	Invisibilidade	50	3
2	Ladybug	Criação	50	3
3	Cat Noir	Destruição	50	10
4	Homem-Aranha	Teia	50	5
5	Batman	Voo	50	3
6	Coringa	Telepatia	50	5
7	Arlequina	Telecinese	50	10
8	Chaves	Eletricidade	50	5
9	Chiquinha	Terra	50	10
10	Uva Passa Negra	Imortalidade	?	5

🩺 Sistema de Cura (Hello Kitty)
Possui 50 pontos de cura por dia
Pode distribuir entre várias crianças
Não pode exceder vida máxima
Estratégia:
Curar um personagem totalmente
Ou salvar vários personagens

⚔️ Sistema de Combate
Turno básico:
Crianças atacam
Monstros atacam
Regras:
Monstros atacam alvos aleatórios
Crianças mortas não agem

🧬 Habilidades Especiais (Sugestão)
Kuromi → não pode ser atacada por 1 turno
Ladybug → cria escudo
Cat Noir → dano crítico
Homem-Aranha → prende inimigo
Coringa → confunde inimigos
Arlequina → ataque em área
Chaves → dano elétrico em área
Chiquinha → alta defesa

👾 Inimigos
Nível	Nome	Quantidade	XP	Dano
1	Beholders	5	5	2
2	Queimados	3	10	1
3	Hides	2	15	10
4	Pantera Deslocadora	4	5	20 (veneno)
5	Tarrasque	1	50	30
🗺️ Progressão

Cada invasão representa um dia/capítulo.

Dificuldade aumenta progressivamente até o boss final.

🖥️ Telas do Sistema (FXML)
1. Menu
Iniciar jogo
Inventário
Conquistas
2. Seleção de Equipe
Escolher crianças para batalha
3. Combate
Vida das crianças
Vida dos monstros
Ações
4. Pós-batalha
Distribuir cura
🏆 Conquistas (Opcional)
Nenhuma morte
Derrotar boss
Vitória perfeita

olá pequeno gafanhoto, segue a Lore do projeto.
Você é um funcionário de uma creche de treinamento de elite com 10 crianças mutantes - 1 Supercriança
objetivo do jogo é salvar todas as crianças de uma invasão de Beholders(nível 1),  Queimados(Nível 2), Hides(Nível 3), Pantera Deslocadora (Nível 4) e Tarrasque(Nível 5) (monstros), 
Cada invasão é um capítulo diferente. Se deixar alguma criança morrer, você perde.
Classe pessoa: Id, nome e poder, vida, dano.
criança 0 - Hello Kitty / poder de cura - 50 de vida - ela cura 50 de vida por dia - 3 de dano
criança 1 - Kuromi / Invisibilidade - 50 de vida - 3 de dano
criança 2 - Ladybug / Poder da criação - 50 de vida - 3 de dano
criança 3 - Cat Noir / Poder da destruição  - 50 de vida - 10 de dano
criança 4 - Homem-aranha / Solta teia de aranha - 50 de vida - 5 de dano
criança 5 - Batman / Sabe voar - 50 de vida - 3 de dano
criança 6 - Coringa / Telepatia - 50 de vida - 5 de dano
criança 7 - Arlequina / Telecinese - 50 de vida - 10 de dano
criança 8 - Chaves / Manipulação da eletricidade - 50 de vida - 5 de dano
criança 9 - Chiquinha / Avatar da Terra - 50 de vida - 10 de dano
criança 10 - Uva passa Negra / Imortabilidade e autoregeneração - 5 de dano

Ver inventário e conquistas
Cada invasão será um dia você deve escolher as melhores crianças para a luta, após a luta, você deve escolher quem irá se curar.
Monstros
Beholders(nível 1) - Invasão com 5
Criaturas burras 
xp = 5
dano = 2
Queimados(Nível 2) - Invasão com 3
Criatura rápida
xp = 10
dano = 1 
Hides(Nível 3) - Invasão com 2
Criatura Agressiva
xp = 15
dano = 10
Pantera Deslocadora (Nível 4) - Invasão com 4
xp = 5
dano = 20 (venenoso)
Tarrasque(Nível 5) Invasão solitária
xp = 50
dano = 30

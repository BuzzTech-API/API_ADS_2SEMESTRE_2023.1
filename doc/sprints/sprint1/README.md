

# Sprint 1 - MVP


<p align="center">
      <img src="/doc/img/logo-BuzzTech.png" alt="logo da Buzz Tech" width="200">
      <h2 align="center"> Buzz Tech</h2>





<hr>
<br>
<p align="center">
  <a href ="#backlog"> Backlog da Sprint </a>  | 
  <a href ="#tarefas"> Tarefas </a>  |
  <a href ="#hitoria"> Histórias de Usuários </a>  |
  <a href ="#apresentação"> Apresentação </a>
</p>



</p>



<br>

<h4 align="center">
 <a href="https://docs.oracle.com/en/java/"><img src = "https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/></a>
 <a href="https://docs.github.com/pt"><img src = "https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white"/></a>
 <a href="https://help.figma.com/hc/en-us"><img src = "https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white"/></a>
 <a href="https://dev.mysql.com/doc/"><img src = "https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white"/></a>
</h4>




<br>
<br>

> Status da Sprint: Concluída :heavy_check_mark:

<br>

A escolha das tarefas dessa primeira Sprint - que é uma das etapas do desenvolvimento ágil de software - foi feita levando em consideração a definição do MVP *(Minimal Viable Product)*, que é uma versão mínima e funcional do programa desktop desenvolvido para que uma professora de escola estadual tenha controle das atividades dos alunos. Nele o usuário poderá inserir as seguintes informações:

- Cadastrar turmas;
- Cadastrar alunos;
- Cadastrar atividades.


<br>

##  :date: Backlog da Sprint<a id="backlog"></a>




|                            Tarefa                            |                          Descrição                           |               Histórias de Usuários                | Prioridade | Sprint | Estimativa de Esforço |       Status       |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :------------------------------------------------: | :--------: | :----: | :-------------------: | :----------------: |
| <a href='#wireframe'> Montagem do Wireframe </a>  | Criar um wireframe simples e objetivo, servindo como uma representação visual da estrutura do software e das suas funcionalidades. O objetivo é obter um feedback rápido sobre o layout e a organização das informações, antes de iniciar o processo de design detalhado. | <a href='#us01'>US01</a> |   Média    |   1    |          4h           | :white_check_mark: |
|                Diagrama de Classes UML                | Desenvolver o Diagrama de Classes UML. Este diagrama mostra a relação entre as classes Turmas, Alunos e Atividades e os atributos e métodos de cada uma. | <a href='#us02'>US02</a>, <a href='#us03'>US03</a>, <a href='#us04'>US04</a> |   Média    |   1    |          8h           | :white_check_mark: |
|            Cadastro das turmas            | Criação do protótipo do software que cadastra as turmas. |              <a href='#us02'>US02</a>              |    Média    |   1    |         4h          | :white_check_mark: |
|            Cadastro dos alunos            | Criação do protótipo do software para cadastrar os alunos de cada turma. |              <a href='#us03'>US03</a>              |    Média    |   1    |         4h          | :white_check_mark: |
|         Cadastro das atividades          | Criação do protótipo do software para cadastrar as atividades entregues por cada aluno. |              <a href='#us04'>US04</a>              |    Média    |   1    |          8h          | :white_check_mark: |
|                Interface gráfica das turmas                | Criação no Swing da interface gráfica do software que cadastra as turmas. | <a href='#us01'>US01</a>, <a href='#us02'>US02</a> |   Baixa    |   1    |          2h           | :white_check_mark: |
|            Interface gráfica dos alunos            | Criação no Swing da interface gráfica do software que cadastra os alunos de cada turma. |              <a href='#us01'>US01</a>, <a href='#us03'>US03</a>              |    Baixa    |   1    |         2h          | :white_check_mark: |
|         Interface gráfica das atividades          | Criação no Swing da interface gráfica do software que cadastra as atividades entregues por cada aluno. |              <a href='#us01'>US01</a>, <a href='#us04'>US04</a>              |    Média    |   1    |          4h          | :white_check_mark: |
|                Diagrama do Modelo Conceitual e Lógico do Banco de Dados                | Desenvolver o Diagrama do Modelo Conceitual e Lógico do Banco de Dados. Estes modelos são criados na fase inicial do desenvolvimento de um sistema e são usados para fornecer uma visão geral das principais entidades envolvidas no negócio. | <a href='#us08'>US08</a> |   Média    |   1    |          4h           | :white_check_mark: |




<br>




## :checkered_flag: Tarefas <a id="tarefas"></a>

### 1. Montagem do Wireframe <a id='wireframe'></a>

   A montagem de um wireframe é uma etapa importante no processo de desenvolvimento de um software, pois permite visualizar e planejar a interface do usuário e a disposição dos elementos na tela do software, por essa razão é parte essencial desta primeira Sprint. No caso específico de um software feito em Java para uma professora do ensino fundamental de uma escola estadual, a montagem do wireframe deve ser feita levando em conta as necessidades e expectativas do usuário final. 
   O wireframe pode incluir diferentes telas e elementos, como menus, botões, campos de texto, tabelas, gráficos, entre outros, que serão necessários para que a professora possa visualizar como irá trabalhar suas atividades no software de forma eficiente e intuitiva. Alguns exemplos de funcionalidades que são vistas no wireframe:

Cadastro de informações: permite que a professora visualize como será feito o cadastro das informações do nome da escola, turma, nome do aluno e atividades.
Controle de desempenho: permite que a professora visualize como será feito o registro as atividades realizadas pelos alunos em diferentes turmas.
Controle com dados estatísticos: permite que a professora tenha uma visão geral do desempenho da turma e dos alunos individualmente, permitindo identificar pontos de melhoria e planejar ações mais eficientes para o processo de ensino e aprendizagem, também permite que a professora se comunique de forma eficiente com os alunos e com a coordenação das escolas nas reuniões pedagógicas.
   
   

   

   <br>

2. ### Página de abertura de chamados em HTML<a id='abertura'></a>

   Prototipagem e  criação da página de abertura de chamados em HTML. Como parte do MVP, esta tarefa terá como objetivo entregar uma página funcional e testável para possíveis problemas. Sendo a págna que em que os usuários identificararão o problema das máquinas, outro objetivo é criar um sistema simples para os usuários, mas que ao mesmo tempo tenha todas as informações necessárias para que o técnico identifique tanto o problema, quanto a máquina em questão. Os campos de preenchimento do formulário desta página serão:

   - Número do laboratório;  
   - Número do computador; 
   - Se é problema de Hardware ou Software;
   - Descrição do problema.

   Para visualizar a página HTML de *abertura de chamados*, acesse o <a href=''>link :link:</a>.

   <br>

3. ### Página de visualização dos chamados em HTML<a id='visualização'></a>

   Prototipagem e criação da página de visualização de chamados em HTML. Como parte do MVP, esta tarefa terá como objetivo entregar uma página funcional e testável para possíveis problemas. Os usuários que fazer abertura de chamado não terão acesso à essa pagina. Por motivos gerenciais, apenas os técnicos terão acesso o link. Nela, além dos itens preenchidos pelos usuários na página de <a href='abertura'>abertura de chamados</a>, a tabela também contará com os seguintes itens para controle das OS:

   - Data dos chamados;
   - ID dos chamados;
   - Botão de apagar o chamado;
   - Botão para atualizar o chamado.

   Para visualizar a página HTML de *visualização de chamados*, acesse o <a href=''>link :link:</a>.

   <br>

4. ### Conexão  das páginas no Flask <a id='conexão'></a>

   Como tarefa fundamental para atingir MVP, esta tarefa propõe-se a conectar as páginsa de abertura de chamado e de visualização de chamados utilizando o framework Flask. Feita essa conexão, os chamados abertos pelos usuários serão automaticamente enviados e preenchidos na tabela te visualizão, para que o técnico possa, assim, analisar os problemas e adotar as devidas mediadas para resolvê-lo. Neste sentido, a partir desta tarefa já é possível que o cliente teste o sistema para avaliar e identificar pontos fortes e possíveis mudanças. Em consonância com a metodologia ágil do Scrum, colocar o produto em teste logo no início aumenta as chances de, ao final do tempo de desenvolvimento, a entrega atenda as necessidades e expectativas do cliente.

   <br>

5. ### Criação, aprovação e entrega do Wireframe<a id='wireframe'></a>

   Para termos mais clareza de como deve ficar a identidade visual do produto, a criação e aprovação do Wireframe é parte essencial desta primeira Sprint. A partir dele, é possível alinhar as expectativas com o cliente quanto à criação do frontend da página ficará. Além disso, o Wireframe dará a direção para que os desenvolvedores construam páginas que tanto atendam à identidade do cliente, bem como para entender como criar um sistema web que seja intuitivo e atgradável para os usuários e técnicos que o utilizarão.  Foi desenvolvido o Wirefram das seguintes páginas:

   

   |                 Home                  |                     Abertura de Chamado                      |                   Visualização de Chamado                    |
   | :-----------------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
   | ![Home](img/wireframe/PáginaHome.png) | ![Abertura de Chamado](img/wireframe/AberturaDeChamados.png) | ![Visualização de Chamado](img/wireframe/VisualizaçãoDeChamados.png) |

   Para visualizar o *Wireframe* em PDF, acesse o [link :link:](img/wireframe/wireframe.pdf).

<br>




## :key: Histórias de Usuário<a id="historia"></a>




|          ID           |                     História de Usuário                      |
| :-------------------: | :----------------------------------------------------------: |
| US01<a id='us01'></a> | Catarina, professora, precisa de uma interface gráfica ágil e prática para interagir com o programa. |
| US02<a id='us02'></a> | Catarina, professora, precisa cadastrar suas turmas de acordo com suas respectivas escolas. |
| US03<a id='us03'></a> | Catarina, professora, precisa cadastrar seus alunos de acordo com suas respectivas turmas. |
| US04<a id='us04'></a> | Catarina, professora, precisa cadastrar as atividades realizadas pelos seus alunos. |
| US08<a id='us08'></a> | Catarina, professora, precisa de um ambiente de armazenamento virtual seguro para acumular todas as informações cadastradas. |


<br>

## :mega: Apresentação da Sprint<a id='#apresentação'></a>

Para visualizar a *Apresentação da Sprint 1* em PDF, acesse o <a href='/doc/sprints/sprint1/img/Sprint1.pdf'>link :link:</a>.




# Sprint 1 - Cadastros


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
| <a href='#diagrama_uml'> Diagrama de Classes UML </a> | Desenvolver o Diagrama de Classes UML. Este diagrama mostra a relação entre as classes Turmas, Alunos e Atividades e os atributos e métodos de cada uma. | <a href='#us02'>US02</a>, <a href='#us03'>US03</a>, <a href='#us04'>US04</a> |   Média    |   1    |          8h           | :white_check_mark: |
| <a href='#cadastro_turmas'> Cadastro das turmas </a> | Criação do protótipo do software que cadastra as turmas. |              <a href='#us02'>US02</a>              |    Média    |   1    |         4h          | :white_check_mark: |
| <a href='#cadastro_alunos'> Cadastro dos alunos </a> | Criação do protótipo do software para cadastrar os alunos de cada turma. |              <a href='#us03'>US03</a>              |    Média    |   1    |         4h          | :white_check_mark: |
| <a href='#cadastro_atividades'> Cadastro das atividades </a> | Criação do protótipo do software para cadastrar as atividades entregues por cada aluno. |              <a href='#us04'>US04</a>              |    Média    |   1    |          8h          | :white_check_mark: |
| <a href='#interface_grafica_turmas'> Interface gráfica das turmas </a> | Criação no Swing da interface gráfica do software que cadastra as turmas. | <a href='#us01'>US01</a>, <a href='#us02'>US02</a> |   Baixa    |   1    |          2h           | :white_check_mark: |
| <a href='#interface_grafica_alunos'> Interface gráfica dos alunos </a> | Criação no Swing da interface gráfica do software que cadastra os alunos de cada turma. |              <a href='#us01'>US01</a>, <a href='#us03'>US03</a>              |    Baixa    |   1    |         2h          | :white_check_mark: |
| <a href='#interface_grafica_atividades'> Interface gráfica das atividades </a> | Criação no Swing da interface gráfica do software que cadastra as atividades entregues por cada aluno. |              <a href='#us01'>US01</a>, <a href='#us04'>US04</a>              |    Média    |   1    |          4h          | :white_check_mark: |
| <a href='#diagrama_modelo_logico_conceitual'> Diagrama do Modelo Conceitual e Lógico do Banco de Dados </a> | Desenvolver o Diagrama do Modelo Conceitual e Lógico do Banco de Dados. Estes modelos são criados na fase inicial do desenvolvimento de um sistema e são usados para fornecer uma visão geral das principais entidades envolvidas no negócio. | <a href='#us08'>US08</a> |   Média    |   1    |          4h           | :white_check_mark: |




<br>




## :checkered_flag: Tarefas <a id="tarefas"></a>

### 1. Montagem do Wireframe <a id='wireframe'></a>

   A montagem de um wireframe é uma etapa importante no processo de desenvolvimento de um software, pois permite visualizar e planejar a interface do usuário e a disposição dos elementos na tela do software, por essa razão é parte essencial desta primeira Sprint. No caso específico de um software feito em Java para uma professora do ensino fundamental de uma escola estadual, a montagem do wireframe deve ser feita levando em conta as necessidades e expectativas do usuário final. 
   O wireframe pode incluir diferentes telas e elementos, como menus, botões, campos de texto, tabelas, gráficos, entre outros, que serão necessários para que a professora possa visualizar como irá trabalhar suas atividades no software de forma eficiente e intuitiva. Alguns exemplos de funcionalidades que são vistas no wireframe:

**Cadastro de informações:** permite que a professora visualize como será feito o cadastro das turma, dos alunos e atividades.

<br>

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/cadastro_informacao.png?raw=true" alt="Wireframe dos Cadastros" style="zoom: 150%;" />

<br>

**Controle de desempenho:** permite que a professora tenha uma visão geral do desempenho da turma e dos alunos individualmente, permitindo identificar pontos de melhoria e planejar ações mais eficientes para o processo de ensino e aprendizagem. Também permite que a professora se comunique de forma eficiente com a coordenação das escolas nas reuniões pedagógicas.

<br>

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/controle_desempenho.png?raw=true" alt="Wireframe do Controle de Desempenho" style="zoom: 150%;" />
   
<br>

### 2. Diagrama de Classes UML <a id='diagrama_uml'></a>

   O diagrama de classes UML é uma ferramenta visual que permite analisar de forma clara e objetiva as classes de objetos, seus atributos e métodos da linguagem de programação Java. O software irá cadastrar turmas, alunos e atividades, enquanto o diagrama de classes será uma peça fundamental na organização e estruturação desse sistema, já que permite definir as entidades envolvidas e as relações entre elas.
   Dessa forma, o diagrama de classes UML é importante para a compreensão do sistema, permitindo que os desenvolvedores tenham uma visão geral da estrutura do programa e possam planejar a implementação de forma mais eficiente. Além disso, o diagrama de classes também facilita a comunicação entre os membros da equipe de desenvolvimento, já que permite uma representação visual das classes e das relações entre elas, facilitando a discussão e a tomada de decisões.

<br>

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/diagrama_uml.jpeg?raw=true" alt="Diagrama de Classes UML" style="zoom: 150%;" />

<br>

### 3. Cadastro das Turmas <a id='cadastro_turmas'></a>

   Prototipagem e criação da página de visualização do cadastros das turmas. Como parte do MVP, esta tarefa terá como objetivo entregar uma página funcional e testável para possíveis problemas.
   
<br>

### 4. Cadastro dos Alunos <a id='cadastro_alunos'></a>

   Prototipagem e criação da página de visualização do cadastros das turmas. Como parte do MVP, esta tarefa terá como objetivo entregar uma página funcional e testável para possíveis problemas.
   
<br>

### 5. Cadastro das Atividades <a id='cadastro_atividades'></a>

   Prototipagem e criação da página de visualização do cadastros das turmas. Como parte do MVP, esta tarefa terá como objetivo entregar uma página funcional e testável para possíveis problemas.
   
<br>

### 6. Interface gráfica das Turmas <a id='interface_grafica_turmas'></a>

   Prototipagem e criação da página de visualização do cadastros das turmas. Como parte do MVP, esta tarefa terá como objetivo entregar uma página funcional e testável para possíveis problemas.
   
<br>
   
### 7. Interface gráfica dos Alunos <a id='interface_grafica_alunos'></a>

   Prototipagem e criação da página de visualização do cadastros das turmas. Como parte do MVP, esta tarefa terá como objetivo entregar uma página funcional e testável para possíveis problemas.
   
<br>

### 8. Interface gráfica das Atividades <a id='interface_grafica_atividades'></a>

   Prototipagem e criação da página de visualização do cadastros das turmas. Como parte do MVP, esta tarefa terá como objetivo entregar uma página funcional e testável para possíveis problemas.
   
<br>

### 9. Diagrama do Modelo Conceitual e Lógico do Banco de Dados <a id='diagrama_modelo_logico_conceitual'></a>

   Prototipagem e criação da página de visualização do cadastros das turmas. Como parte do MVP, esta tarefa terá como objetivo entregar uma página funcional e testável para possíveis problemas.

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


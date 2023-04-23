

# Sprint 2 - Dados Estatísticos


<p align="center">
      <img src="/doc/img/logo-BuzzTech.png" alt="logo da Buzz Tech" width="200">
      <h2 align="center"> Buzz Tech</h2>





<hr>
<br>
<p align="center">
  <a href ="#backlog"> Backlog da Sprint </a>  | 
  <a href ="#tarefas"> Tarefas </a>  |
  <a href ="#burndown"> Burndown </a>  |
  <a href ="#historia"> Histórias de Usuários </a>  

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

A escolha das tarefas dessa segunda Sprint levou em consideração alguns fatores importantes. Primeiro, analisamos as necessidades do cliente e os requisitos do projeto, em especial, a importância da parte que mostra os dados estatísticos da atividades dos alunos.

Essa parte do projeto é de alto valor, pois é essencial para a professora acompanhar o desempenho dos alunos e identificar possíveis dificuldades de aprendizado. Além disso, a visualização dos dados estatísticos permite uma melhor organização da sala de aula, tornando mais fácil identificar quais alunos precisam de atenção especial e incentivar a entrega de atividades dentro do prazo.

Com base nessas informações, escolhemos as seguintes tarefas para a segunda sprint do projeto:

* Implementação do modo de visualização dos dados estatísticos das atividades dos alunos;
* Implementação da funcionalidade de registro de atividades entregues, incluindo informações sobre o prazo de entrega e atrasos;


Essas tarefas foram escolhidas para garantir que a parte mais importante do projeto seja implementada de forma eficiente e eficaz, atendendo às necessidades do cliente e tornando o processo de ensino-aprendizagem mais organizado e produtivo. Com a implementação dessas tarefas, esperamos fornecer uma ferramenta útil para a professora e ajudar no acompanhamento do desempenho dos alunos.


<br>

##  :date: Backlog da Sprint<a id="backlog"></a>




|                            Tarefa                            |                          Descrição                           |               Histórias de Usuários                | Prioridade | Sprint | Estimativa de Esforço |       Status       |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :------------------------------------------------: | :--------: | :----: | :-------------------: | :----------------: |
|      Registrar Atividade Entregue pelo Aluno | Desenvolver uma tela onde registre as atividades que foram entregues pelos alunos. | <a href='#us09'>US09</a> |   Alta    |   2    |          16h           | :white_check_mark: |
|   Visualizar informações da Turma | Desenvolver uma tela onde mostre as atividades entregues da turma. | <a href='#us10'>US10</a> |   Alta    |   2    |          8h           | :white_check_mark: |
|   Visualizar informações dos Alunos | Desenvolver uma tela onde mostre as atividades entregues do aluno. | <a href='#us11'>US11</a> |   Alta    |   2    |          8h           | :white_check_mark: |
|  Visualizar informações das Atividades | Desenvolver uma tela onde mostre as informações das atividades. | <a href='#us12'>US12</a> |   Alta    |   2    |          8h           | :white_check_mark: |


<br>




## :checkered_flag: Tarefas <a id="tarefas"></a>

### 1. Visualização dos Dados Estatísticos das Atividades dos Alunos </a>

   A funcionalidade de maior valor para a professora consistia em visualizar os alunos que ainda não entregaram as atividades avaliativas, bem como os alunos que entregaram as atividades com atraso.

Diante desse requisito, a equipe avaliou as possibilidades de implementação e decidiu que a melhor abordagem seria desenvolver uma visualização dos dados estatísticos das atividades dos alunos, que permitiria à professora acessar as informações de forma clara e concisa.

Ao abrir o programa, a professora irá ver quais atividades ainda tem aluno devendo entrega. A visualização da turma será apresentada de acordo com o dia da semana e hora que foram previamente cadastrados no programa.

Na imagem podemos ver um exemplo de como seria essa visualização dos dados estatísticos no programa para uma determinada turma.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_telahome.png" alt="Dados Estatístico na Tela Home" style="zoom: 150%;" />

Ao clicar em qualquer atividade, outra tela se abre apresentando de forma mais detalhada a descrição da atividade solicitada, a porcentagem dos alunos que estão devendo. 

Na tela a seguir existem duas ações possíveis:

* A primeira ação é clicar no botão em formato de lápis,
* A segunda ação é clicar no nome do aluno. 

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_atividade_alunosdevem_naoEntregou.png" alt="Dados Estatístico dos alunos que ainda estão Devendo entregar Atividades" style="zoom: 150%;" />

1ª ação: Quando clicamos no botão lápis, uma nova tela irá aparecer para que a professora marque nas respectivas checkbox quais alunos entregaram as atividades que ainda estavam pendentes ou as que foram entregues com atraso.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_telacheckbox.png" alt="Marcando os alunos que entregaram Atividades" style="zoom: 150%;" />

Depois de marcar os alunos que entregaram as atividades, é possível salvar as alterações realizadas. Ao clicar no botão de salvar, as informações serão registradas no sistema e estarão disponíveis para consulta posteriormente. Além disso, a professora poderá gerar relatórios e estatísticas com base nos dados registrados, o que contribuirá para uma análise mais completa e aprimoramento do processo de ensino.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_telacheckbox_salvar.png" alt="Salvando Alterações" style="zoom: 150%;" />

Ao confirmar que deseja salvar a alteração, outra tela irá aparecer indicando que as alterações foram realizadas com sucesso.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_telacheckbox_salvar_sucesso.png" alt="Alterações Realizadas com Sucesso" style="zoom: 150%;" />

2ª ação: Quando clicamos no nome do aluno, uma nova tela irá aparecer indicando quais atividades que ainda não foram entregues e qual a porcentagem de atividades não entregues pelo aluno selecionado. Nessa tela, é possível marcar as caixas de seleção (checkbox) correspondentes às atividades que foram entregues e, em seguida, salvar as alterações realizadas no botão salvar. Além disso, na mesma tela, há um botão indicando a próxima página. Ao clicar nesse botão, serão exibidas as atividades que foram entregues fora do prazo.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_nomeAluno.png" alt="Atividades que o Aluno Ainda Não Entregou" style="zoom: 150%;" />

Nessa tela é possível visualizar a porcentagem de atividades avaliativas entregues fora do prazo pelo aluno. Qualquer alteração pode ser salva ao clicar no botão salvar.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_atividade_alunosdevem_atrasado.png" alt="Atividades que o Aluno Entregou Atrasado" style="zoom: 150%;" />

Após clicar no botão salvar, será exibida a confirmação ou o cancelamento das alterações realizadas.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_atividade_alunosdevem_atrasado_salvar.png" alt="Salvando Alterações" style="zoom: 150%;" />

Ao confirmar que deseja salvar a alteração, outra tela irá aparecer indicando que as alterações foram realizadas com sucesso.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_atividade_alunosdevem_atrasado_salvar_sucesso.png" alt="Alterações Realizadas com Sucesso" style="zoom: 150%;" />

<br>


### 2. Funcionalidade de Registro de Atividades Entregues </a>

   Permite o registro das atividades e informa sobre o prazo de entrega e atrasos...

<br>


### 3. Funcionalidade de Contabilização de Atividades Entregues </a>

   Contabiliza as atividades entregues com informações sobre a quantidade de atividades que ainda estão faltando.
   
<br>

### 4. Funcionalidade de Visualização dos Dados de uma Turma </a>

   Inclui informações sobre a quantidade de alunos que entregaram as atividades dentro e fora do prazo.
   
   
<br>



## :fire: Burndown <a id='burndown'></a>

<img src="doc/img/burndown1.png" alt="Burndown" style="zoom: 150%;" />

<br>




## :key: Histórias de Usuário<a id="historia"></a>




|          ID           |                     História de Usuário                      |
| :-------------------: | :----------------------------------------------------------: |
| US09<a id='us09'></a> | Catarina, professora, precisa registrar quais alunos já entregaram as atividades avaliativas. |
| US10<a id='us10'></a> | Catarina, professora, precisa visualizar todas as informações relevantes das turmas através de dados estatísticos das atividades cadastradas para apresentar em reuniões com a coordenação da escola. |
| US11<a id='us11'></a> | Catarina, professora, precisa visualizar todas as informações relevantes dos alunos através de dados estatísticos das atividades cadastradas para apresentar em reuniões com a coordenação da escola. |
| US12<a id='us12'></a> | Catarina, professora, precisa de uma lista que apresente quais são os alunos que estão devendo entregar atividades. |


<br>


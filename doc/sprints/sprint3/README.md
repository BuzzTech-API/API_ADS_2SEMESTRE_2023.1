

# Sprint 3 - Edições


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

Na terceira Sprint do projeto, o foco principal foi o desenvolvimento das funcionalidades de edição e exclusão das turmas, alunos e atividades escolares. Com essas funcionalidades, a professora poderá gerenciar de forma mais eficiente e precisa as informações cadastradas anteriormente, podendo corrigir erros ou remover dados desnecessários.

Para a edição das turmas, será necessário implementar uma funcionalidade que permita à professora alterar o nome da escola, nome da turma, dia da semana e horário que ela dá aula nessa turma. Já para a exclusão de turmas, será necessário criar um processo de confirmação antes que a turma seja deletada, a fim de evitar a exclusão acidental.

Quanto aos alunos, a funcionalidade de edição permitirá à professora alterar o nome do aluno e a turma em que ele está matriculado. A exclusão de alunos exigirá também um processo de confirmação para evitar exclusões acidentais.

Por fim, as funções de edição e exclusão de atividades escolares permitirão que a professora altere ou exclua atividades já cadastradas. Isso inclui a possibilidade de alterar o tipo de atividade, a data em que ela foi solicitada aos alunos, a data de entrega e a sua descrição detalhada. A exclusão de atividades também exigirá um processo de confirmação antes que a atividade seja deletada.

Ao implementar essas funcionalidades na terceira Sprint do projeto, a professora terá uma ferramenta mais completa e eficiente para gerenciar as informações escolares de seus alunos, permitindo que ela se concentre no ensino e no acompanhamento do progresso de seus alunos.


<br>
<br>

##  :date: Backlog da Sprint<a id="backlog"></a>




|                            Tarefa                            |                          Descrição                           |               Histórias de Usuários                | Prioridade | Sprint | Estimativa de Esforço |       Status       |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :------------------------------------------------: | :--------: | :----: | :-------------------: | :----------------: |
|   Editar e Excluir Turmas | Desenvolver uma tela onde seja possível editar ou excluir as atividades da turma. | <a href='#us05'>US05</a> |   Média    |   3    |          4h           | :white_check_mark: |
|   Editar e Excluir Alunos | Desenvolver uma tela onde seja possível editar ou excluir as atividades do aluno. | <a href='#us06'>US06</a> |   Média    |   3    |          4h           | :white_check_mark: |
|  Editar e Excluir Atividades | Desenvolver uma tela onde seja possível editar ou excluir as atividades. | <a href='#us07'>US07</a> |   Média    |   3    |          4h           | :white_check_mark: |





<br>
<br>



## :checkered_flag: Tarefas <a id="tarefas"></a>

### 1. Área Editar </a>

O programa possui quatro abas com funções específicas, sendo a aba 'Editar' uma área reservada para a professora realizar a edição da turma, dos alunos ou das atividades.

Ao clicar na aba editar, é possível visualizar três áreas para edição. 

* Editar Turma,
* Editar Aluno,
* Editar Atividade. 

Na imagem podemos ver um exemplo de como seria a visualização da área editar.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/area_editar.png" alt="Área Editar" style="zoom: 150%;" />

<br>
<br>

### 2. Editar Turma </a>

Ao clicar no botão "Editar Turma"

Na imagem podemos ver um exemplo de como seria a visualização da área editar.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/botao_editar_turma.png" alt="Área Editar" style="zoom: 150%;" />

<br>
<br>

### 3. Editar Aluno </a>

O programa possui quatro abas com funções específicas, sendo a aba 'Editar' uma área reservada para a professora realizar a edição da turma, dos alunos ou das atividades.

Na imagem podemos ver um exemplo de como seria a visualização da área editar.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/aba_editar.png" alt="Área Editar" style="zoom: 150%;" />

<br>
<br>

### 4. Editar Atividade </a>

O programa possui quatro abas com funções específicas, sendo a aba 'Editar' uma área reservada para a professora realizar a edição da turma, dos alunos ou das atividades.

Na imagem podemos ver um exemplo de como seria a visualização da área editar.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/aba_editar.png" alt="Área Editar" style="zoom: 150%;" />

<br>
<br>

## :fire: Burndown <a id='burndown'></a>

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/burndown3.jpeg" alt="Burndown" style="zoom: 150%;" />

<br>




## :key: Histórias de Usuário<a id="historia"></a>




|          ID           |                     História de Usuário                      |
| :-------------------: | :----------------------------------------------------------: |
| US05<a id='us05'></a> | Catarina, professora, precisa editar ou excluir as turmas já cadastradas no programa. |
| US06<a id='us06'></a> | Catarina, professora, precisa editar ou excluir os alunos já cadastradas no programa. |
| US07<a id='us07'></a> | Catarina, professora, precisa editar ou excluir as atividades já cadastradas no programa. |


<br>


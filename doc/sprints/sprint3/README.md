

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

O programa possui quatro abas com funções específicas, sendo a aba "Editar" uma área reservada para a professora realizar a edição da turma, dos alunos ou das atividades.

Ao clicar na aba editar, é possível visualizar três áreas para edição. 

* Editar Turma,
* Editar Aluno,
* Editar Atividade. 

Na imagem podemos ver um exemplo de como seria a visualização da área editar.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/area_editar.png" alt="Área Editar" style="zoom: 150%;" />


<br>
<br>

### 2. Editar e Excluir Turma </a>

Ao clicar no botão "Editar Turma", outra tela abre apresentando todas as turmas já cadastradas. 

Na imagem, é possível ver como o botão muda de cor ao ser selecionado.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/botao_editar_turma.png" alt="Área Editar" style="zoom: 150%;" />

Na tela a seguir existem duas ações possíveis:

* A primeira ação é clicar no botão editar,
* A segunda ação é clicar no botão excluir. 

Na imagem podemos ver um exemplo de como seria a visualização da área editar e excluir turma. <br>
É importante destacar que essa área também pode ser acessada por meio da aba "Buscar".

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/area_editar_turma.png" alt="Área Editar" style="zoom: 150%;" />

Ao clicar no botão "Editar", uma nova tela será exibida para que a professora possa alterar o nome da escola, turma, dia da semana, além de corrigir o horário de início e fim das aulas que ministra.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/atualizar_turma.png" alt="Atualizar Turma" style="zoom: 150%;" />

Ao clicar no botão "Salvar", uma nova tela será exibida perguntando se a alteração deve ser confirmada. Se sim, basta clicar em "Salvar"; se não, basta clicar em "Cancelar".

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/confirmacao_editar_turma.png" alt="Alteração deve ser confirmada" style="zoom: 150%;" />

Ao clicar no botão "Salvar", uma nova tela será exibida informando que o cadastro foi realizado com sucesso.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/alteracao_editar_turma_sucesso.png" alt="Cadastro foi realizado com sucesso" style="zoom: 150%;" />

Ao clicar no botão "Excluir", uma nova tela será exibida para que a professora possa confirmar se deseja ou não excluir a turma.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/excluir_turma.png" alt="Excluir Turma" style="zoom: 150%;" />


<br>
<br>

### 3. Editar e Excluir Aluno </a>

Ao clicar no botão "Editar Aluno", uma nova tela será aberta, apresentando duas caixas de seleção: uma com todas as turmas já cadastradas e outra com os alunos cadastrados em suas respectivas turmas.

Na imagem, é possível ver como o botão muda de cor ao ser selecionado.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/editar_aluno.png" alt="Editar Aluno" style="zoom: 150%;" />

Na imagem, é possível ver a área com as caixas de seleção das turmas e alunos.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/editar_nome_aluno.png" alt="Buscar Aluno para Edição" style="zoom: 150%;" />

Ao clicar no botão "Buscar", uma nova tela será exibida para que a professora possa realizar alterações no nome do aluno.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/editando_nome_aluno.png" alt="Alterar Nome do Aluno" style="zoom: 150%;" />

Caso necessário, a professora poderá mudar qual turma o aluno deve ser registrado ao clicar na caixa de seleção "Turma".

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/editar_aluno_turma.png" alt="Alterar Turma do Aluno" style="zoom: 150%;" />

Ao clicar no botão "Salvar", uma nova tela será exibida perguntando se a alteração deve ser confirmada. Se sim, basta clicar em "Salvar"; se não, basta clicar em "Cancelar".

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/editando_nome_aluno_salvar.png" alt="Alteração deve ser confirmada" style="zoom: 150%;" />

Ao clicar no botão "Salvar", uma nova tela será exibida informando que o dado foi alterado com sucesso.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/editando_nome_aluno_salvar_sucesso.png" alt="Dado alterado com sucesso" style="zoom: 150%;" />

Ao clicar no botão "Excluir Aluno(a)", uma nova tela será exibida para que a professora possa confirmar se deseja ou não excluir o aluno.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/excluir_nome_aluno.png" alt="Excluir Aluno" style="zoom: 150%;" />


<br>
<br>

### 4. Editar e Excluir Atividade </a>

Na área editar, ao posicionar o cursor sobre o botão "Editar Atividade", é possível observar a mudança de cor.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/editar_atividade.png" alt="Editar Atividade" style="zoom: 150%;" />

Após clicar no botão "Editar Atividade", uma nova tela será aberta, apresentando uma caixa de seleção para que a professora possa selecionar a turma que deseja verificar as atividades que necessitam de alguma alteração.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/buscar_atividade.png" alt="Atividade Selecionada por Turma" style="zoom: 150%;" />

Ao selecionar a turma desejada e clicar no botão "Buscar", uma nova tela será aberta, apresentando a área para editar e excluir as atividades correspondentes. 

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/escolher_editar_atividade.png" alt="Área Editar ou Excluir Atividade" style="zoom: 150%;" />

Ao clicar no botão "Editar", uma nova tela será exibida, permitindo que a professora escolha a turma e sua respectiva escola por meio de uma caixa de seleção. Além disso, é possível editar informações como tipo de trabalho, dia de solicitação, dia de entrega da atividade e sua descrição.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/area_editar_atividade.png" alt="Área Editar Atividade" style="zoom: 150%;" />

Ao clicar no botão "Salvar", uma nova tela será exibida perguntando se a alteração deve ser confirmada. Se sim, basta clicar em "Salvar"; se não, basta clicar em "Cancelar".

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/editando_atividade_salvar.png" alt="Alteração deve ser confirmada" style="zoom: 150%;" />

Ao clicar no botão "Salvar", uma nova tela será exibida informando que o dado foi cadastrado com sucesso.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/editando_atividade_salvar_sucesso.png" alt="Atividade Alterada com sucesso" style="zoom: 150%;" />

Ao clicar no botão "Excluir", uma nova tela será exibida para que a professora possa confirmar se deseja ou não excluir a atividade daquela turma.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/excluir_atividade.png" alt="Excluir Atividade" style="zoom: 150%;" />


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


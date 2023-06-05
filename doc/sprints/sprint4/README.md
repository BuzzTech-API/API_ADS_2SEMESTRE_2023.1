

# Sprint 4 - Testes


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

Na quarta Sprint do projeto, dedicamos nosso tempo a aprimorar o software que desenvolvemos com o objetivo de atender às necessidades específicas do nosso usuário. Nessa etapa, realizamos testes minuciosos para identificar e corrigir quaisquer erros presentes no programa.

A equipe se empenhou em analisar cada funcionalidade do software, verificando se todas estavam operando conforme o esperado. Caso algum problema fosse encontrado, prontamente trabalhamos para solucioná-lo, garantindo assim a qualidade e confiabilidade do programa.

Além disso, visando melhorar a experiência do usuário, adicionamos algumas funcionalidades extras que tornarão o uso do programa ainda mais intuitivo e eficiente. Essas adições foram cuidadosamente planejadas levando em consideração o feedback recebido do usuário e suas necessidades.

Através dessas melhorias implementadas durante a quarta e última sprint, estamos confiantes de que estamos no caminho certo para fornecer ao nosso usuário um software robusto, confiável e com uma experiência de uso aprimorada que garantirá a excelência do software e a satisfação do nosso usuário.


<br>
<br>

##  :date: Backlog da Sprint<a id="backlog"></a>




|                            Tarefa                            |                          Descrição                           |               Histórias de Usuários                | Prioridade | Sprint | Estimativa de Esforço |       Status       |
| :----------------------------------------------------------: | :----------------------------------------------------------: | :------------------------------------------------: | :--------: | :----: | :-------------------: | :----------------: |
|  Testes | Testar as funcionalidades do software para verificar possíveis erros e corrigi-los. | <a href='#us13'>US13</a> |   Média    |   4    |          4h           | :white_check_mark: |





<br>
<br>



## :checkered_flag: Tarefas <a id="tarefas"></a>

### 1. Correção das Porcentagens </a>

O programa exibe a porcentagem de alunos que ainda não entregaram as atividades, bem como a porcentagem de alunos que entregaram as atividades com atraso.

Essa parte do programa exigiu várias ajustes antes de apresentar as porcentagens corretamente. Foram necessárias iterações e refinamentos para garantir que os cálculos e exibições das porcentagens estivessem precisos e coerentes com os dados dos alunos e suas entregas de atividades. A equipe trabalhou diligentemente para resolver quaisquer problemas ou erros, a fim de fornecer resultados confiáveis e precisos. Agora, o programa está configurado corretamente e é capaz de mostrar com exatidão a porcentagem de alunos que ainda não entregaram as atividades e a porcentagem de alunos que entregaram com atraso. 

Na imagem podemos ver um exemplo de como aparece as porcentagens das atividades não entregues e entregues com atraso.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/correcao_porcentagem_01.png" alt="Área Editar" style="zoom: 150%;" />


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

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/burndown4.jpeg" alt="Burndown" style="zoom: 150%;" />

<br>




## :key: Histórias de Usuário<a id="historia"></a>




|          ID           |                     História de Usuário                      |
| :-------------------: | :----------------------------------------------------------: |
| US13<a id='us13'></a> | Catarina, professora, precisa de um software confiável e que não tenha problemas de desempenho. |


<br>


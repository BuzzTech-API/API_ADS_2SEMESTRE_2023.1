

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

Na imagem podemos ver um exemplo de como seria a visualização da área editar.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/aba_editar.png" alt="Área Editar" style="zoom: 150%;" />

Ao clicar na aba editar, é possível visualizar 3 área para edição. 

* Editar Turma,
* Editar Aluno,
* Editar Atividade. 

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
<br>

### 2. Funcionalidade de Registro de Atividades Entregues </a>

A funcionalidade registro de atividades entregues foi desenvolvida no programa para auxiliar o cliente na gestão do desempenho de seus alunos. Com ela, é possível manter um registro atualizado das atividades entregues por cada aluno, o que contribui para uma análise mais completa do desempenho individual e coletivo da turma.

Essa funcionalidade permite que a professora marque as atividades entregues pelos alunos e registre o status de cada uma delas, indicando se foram entregues dentro do prazo ou com atraso. Além disso, é possível visualizar os alunos que ainda não entregaram as atividades, o que facilita a identificação de possíveis problemas e a tomada de medidas para corrigi-los.

Para acessar a área de registro de atividades entregues, é necessário clicar na opção "Buscar". Em seguida, todas as turmas previamente cadastradas no programa serão exibidas na tela.
Na imagem a seguir, podemos ver um exemplo de como seria essa visualização das turmas cadastradas no programa dentro da área de busca.

   
   <img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_turmas.png" alt="Buscar Turmas" style="zoom: 150%;" />

<br>

Ao clicar em qualquer turma na tela de busca, uma nova tela será exibida com informações dos alunos com atividades pendentes. Nessa nova tela, será possível visualizar a porcentagem de alunos com atividades pendentes, a porcentagem dos alunos que entregaram atrasado, quais alunos estão devendo atividades e quantas atividades estão pendentes.

Após realizar a mudança do status da atividade "pendente" para "entregue", as alterações serão efetuadas após clicar em "salvar".

Para verificar a situação de um aluno específico da turma, basta clicar no nome do aluno que uma nova tela será aberta, exibindo informações sobre as atividades avaliativas pendentes ou entregues fora do prazo.
   
   <img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_turmas_registroAtividadesPendentes.png" alt="Registro das Atividades" style="zoom: 150%;" />


<br>

Após clicar no botão salvar, será exibida a confirmação ou o cancelamento das alterações realizadas.
   
   <img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_turmas_registroAtividadesPendentes_salvar.png" alt="Registro das Atividades Salvas" style="zoom: 150%;" />

<br>

Ao confirmar que deseja salvar a alteração, outra tela irá aparecer indicando que as alterações foram realizadas com sucesso.
   
   <img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_turmas_registroAtividadesPendentes_salvar_sucesso.png" alt="Alterações Realizadas com Sucesso" style="zoom: 150%;" />

<br>

Quando clicamos no nome do aluno, uma nova tela irá aparecer indicando quais atividades que ainda não foram entregues e qual a porcentagem de atividades não entregues pelo aluno selecionado. Nessa tela, é possível marcar as caixas de seleção (checkbox) correspondentes às atividades que foram entregues e, em seguida, salvar as alterações realizadas no botão salvar. Além disso, na mesma tela, há um botão indicando a próxima página. Ao clicar nesse botão, serão exibidas as atividades que foram entregues fora do prazo.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_nomeAluno.png" alt="Atividades que o Aluno Ainda Não Entregou" style="zoom: 150%;" />

Nessa tela é possível visualizar a porcentagem de atividades avaliativas entregues fora do prazo pelo aluno. Qualquer alteração pode ser salva ao clicar no botão salvar.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_atividade_alunosdevem_atrasado.png" alt="Atividades que o Aluno Entregou Atrasado" style="zoom: 150%;" />

Após clicar no botão salvar, será exibida a confirmação ou o cancelamento das alterações realizadas.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_atividade_alunosdevem_atrasado_salvar.png" alt="Salvando Alterações" style="zoom: 150%;" />

Ao confirmar que deseja salvar a alteração, outra tela irá aparecer indicando que as alterações foram realizadas com sucesso.

<img src="https://github.com/BuzzTech-API/API_ADS_2SEMESTE_2023.1/blob/main/doc/img/dadosestatisticos_atividade_alunosdevem_atrasado_salvar_sucesso.png" alt="Alterações Realizadas com Sucesso" style="zoom: 150%;" />


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


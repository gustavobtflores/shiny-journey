# Como os Browsers Funcionam

- **UI:** A interface do usuário é a parte do navegador que interage diretamente com o usuário. Inclui elementos como a barra de endereços, botões de navegação, abas e outros componentes visíveis.

- **Browser Engine:** Este é o mediador entre a UI e o Rendering Engine. Ele recebe comandos da UI e direciona essas instruções para o Rendering Engine. Cada navegador possui seu próprio Browser Engine.

- **Rendering Engine:** Responsável por exibir o conteúdo solicitado na tela do navegador. As etapas incluem:
    - Obtenção do documento HTML.
    - Análise do HTML para construir a DOM.
    - Obtenção e análise do CSS para construir a CSSOM.
    - Construção da Render Tree a partir da DOM e da CSSOM.
    - Realização do Layout com base na Render Tree.
    - Pintura dos elementos na tela, baseada na Render Tree e no Layout.

- **Networking:** Lida com todos os aspectos de comunicação de internet dentro de um navegador. É responsável por solicitar e receber dados dos servidores, lidando com aspectos como HTTP requests e SSL/TLS.

- **JS Interpreter:** É a parte do navegador que lê, interpreta e executa o código JavaScript em uma página da web. Transforma o código fonte JavaScript, que é escrito como texto, em código de máquina que pode ser executado pelo computador.

- **UI Backend:** Responsável por desenhar elementos básicos da interface do usuário, como caixas de seleção, janelas, botões, etc. Usa as APIs do sistema operacional para renderizar esses elementos e permite que a UI se pareça nativa no ambiente do sistema operacional.

- **Data Persistence:** Refere-se a como os navegadores armazenam dados localmente. Isso pode ser feito através de cookies, IndexedDB, WebSQL, localStorage, entre outros. Esses dados são usados para funções como salvar as preferências do usuário, manter o usuário logado, etc.

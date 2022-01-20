# JavaWebcomServletseJSPs(JV-04)

 
Estudos baseados no curso: Java Web com Servlets e JSPs (JV-04)

Softblue

https://www.softblue.com.br/course/home/id/4

HTTP: protocolo para transporte dos dados

HTTP request: requisições ao servidor quando digita-se endereços urls para acessos a paginas na internet.
Uma requisição do tipo get.

HTTP response: resposta do servidor ao cliente. Ele não armazena estado, para contornar tal situacao foi 
criado a sessão. É representada no java pela camada httpsession. Cada cliente possui sua propria sessão. Vantagem
para ecomerce para carrinhos de compra, de forma a manter produtos ja escolhidos.
Para que isso funcione é necesario que cliente e servidor troquem id. Pode ser feito por cookies ou URL
rewriting.

Fórmularios com metodos tipo GET, as informações sao enviadas no corpo da url.
Do tipo POST, os dados sao passados no corpo do HTTP.

Thread é um pequeno programa que trabalha como um subsistema, sendo uma forma de um processo se autodividir em duas ou mais tarefas. 
É o termo em inglês para Linha ou Encadeamento de Execução. Essas tarefas múltiplas podem ser executadas simultaneamente para rodar mais rápido do que um programa em um único bloco ou praticamente juntas, 
mas que são tão rápidas que parecem estar trabalhando em conjunto ao mesmo tempo.


Os servlets existem para criar respostas dinamicas em java. No entanto, dependendo da resposta, é melhor utilizar o JSP.
Java Server Pages: permite que o html e o java  fiquem no mesmo arquivo. A resposta que chega enviada ao cliente é em html.
JSP: É um servlet.
JSP é o acrônimo para Java Server Pages, uma linguagem criada pela SUN gratuita, JSP é uma linguagem de script com especificação aberta que tem como
 objetivo primário a geração de conteúdo dinâmico para páginas da Internet. Podemos ao invés de utilizar HTML para desenvolver páginas Web estáticas e sem funcionalidade, 
utilizar o JSP para criar dinamismo. É possível escrever HTML com códigos JSP embutidos. Como o HTML é uma linguagem estática, o JSP será o responsável por criar dinamismo. 
Por ser gratuita e possuir especificação aberta possui diversos servidores que suportam a linguagem, entre eles temos: Tomcat, GlassFish, JBoss, entre outros.
 O JSP necessita de servidor para funcionar por ser uma linguagem Server-side script,
 o usuário não consegue ver a codificação JSP, pois esta é convertida diretamente pelo servidor, sendo apresentado ao usuário apenas codificação HTML.
Mais detalhes: https://www.devmedia.com.br/introducao-ao-java-server-pages-jsp/25602


Thread-safe: é usado para garantir que, quando a estrutura de dados compartilhada, que
 é manipulada por diferentes threads, seja impedida de entrar na condição de corrida. 
A segurança de thread é recomendada quando o servidor da web executa vários threads de execução 
simultaneamente para diferentes requests. No Thread Safety, o binário pode funcionar em um contexto
 de servidor da web multi-thread. Thread Safety funciona criando uma cópia
 de armazenamento local em cada thread para que os dados não colidam com outro thread. 

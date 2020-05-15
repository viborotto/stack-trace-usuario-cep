# stack-trace-usuario-cep
Projeto para aplicação do zipkin, sleuth para stack tracing. 

# :cloud: Tecnologias
- Feign
- Eureka
- Zuul
- Zipkin
- Sleuth

-Construa 2 microsserviços: O primeiro deve ter um endpoint que consulta CEPs no ViaCep O segundo deve chamar o primeiro microsserviço e criar um usuário com o resultado do CEP. Você deve acessar esses microsserviços somente via Zuul. Obs: Todos os microsserviços que você usar devem ter o Zipkin instalado. 

Microsserviços:

- Usuario: onde cria um usuario utilizando um CEP



- Consulta de Cep via API ViaCep

Obs: openzipkin rodando no Docker

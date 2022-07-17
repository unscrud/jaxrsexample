# jaxrsexample

CRUD básico usando JAX RS

## 🚀 Começando

Projeto criado seguindo o tutorial disponível em:

https://www.treinaweb.com.br/blog/criando-uma-api-restful-com-a-jax-rs-api

Inicialmente foi executado o comando abaixo para gerar a base do projeto:

mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-grizzly2 \
-DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false \
-DgroupId=dev.unscrud -DartifactId=jaxrsexample -Dpackage=dev.unscrud

### 📋 Pré-requisitos

Pelo menos uma das dependências (jakarta.ws.rs-api-3.1.0.jar) utiliza Java 11, \
então é recomendável usar esta versão ou uma versão superior.

Segue a lista de versões para referência:

https://docs.oracle.com/javase/specs/jvms/se17/html/jvms-4.html#jvms-4.1-200-B.2

# Sistema de Gerenciamento de Bootcamp

## 📝 Descrição do Projeto

Este projeto implementa um sistema de gerenciamento de bootcamps utilizando Java. O sistema permite a criação de bootcamps, cursos e mentorias, além de possibilitar a inscrição de desenvolvedores e o acompanhamento de seu progresso ao longo do programa.

Foi desenvolvido com foco na aplicação prática de conceitos fundamentais de Programação Orientada a Objetos (POO), utilização de Collections Framework e manipulação de dados com a Stream API do Java.

## 🔍 Funcionalidades

- Criação de bootcamps com conteúdos específicos (cursos e mentorias)
- Inscrição de desenvolvedores nos bootcamps
- Acompanhamento do progresso dos desenvolvedores
- Cálculo de XP com base nos conteúdos concluídos
- Gerenciamento de conteúdos concluídos e pendentes

## 🧱 Estrutura do Projeto

O projeto está organizado nas seguintes classes:

- **Conteudo**: Classe abstrata que serve como base para os diferentes tipos de conteúdo
- **Curso**: Representa um curso dentro do bootcamp com carga horária específica
- **Mentoria**: Representa uma mentoria com data específica
- **Bootcamp**: Contém informações do bootcamp, incluindo conteúdos e desenvolvedores inscritos
- **Dev**: Representa um desenvolvedor que pode se inscrever em bootcamps e progredir nos conteúdos

## 💻 Conceitos Aplicados

### Programação Orientada a Objetos
- **Abstração**: Criação da classe abstrata `Conteudo` definindo comportamentos comuns
- **Encapsulamento**: Utilização de modificadores de acesso e métodos getters/setters para controlar o acesso aos atributos
- **Herança**: Classes `Curso` e `Mentoria` herdam da classe `Conteudo`
- **Polimorfismo**: Implementação diferenciada do método `calcularXP()` nas classes filhas

### Collections Framework
- **Set**: Utilização de `HashSet` e `LinkedHashSet` para armazenar coleções de dados
- **LinkedHashSet**: Mantém a ordem de inserção dos elementos (usado para conteúdos do bootcamp)
- **HashSet**: Armazenamento eficiente de desenvolvedores inscritos

### Stream API
- Operações com streams para filtrar e manipular coleções de dados
- Uso de `findFirst()` para obter o primeiro elemento de uma coleção
- Utilização de `mapToDouble()` e `sum()` para cálculos de XP total
- Implementação de operações em pipeline para processamento de dados

### Outros Conceitos
- **Sobrescrita de métodos**: Implementação de `equals()`, `hashCode()` e `toString()`
- **Classes abstratas e métodos abstratos**: Definição de comportamentos que devem ser implementados nas classes filhas
- **Optional**: Tratamento seguro de valores que podem ser nulos

## 🚀 Como Executar

1. Clone o repositório
2. Importe o projeto em sua IDE de preferência (Eclipse, IntelliJ, etc.)
3. Execute a classe `Main.java`

## 📊 Exemplo de Uso

O arquivo `Main.java` contém um exemplo de uso do sistema, demonstrando:

1. Criação de cursos e mentorias
2. Configuração de um bootcamp com diferentes conteúdos
3. Inscrição de desenvolvedores no bootcamp
4. Progressão dos desenvolvedores através dos conteúdos
5. Cálculo de XP baseado nos conteúdos concluídos

## 📚 Aprendizados

Este projeto foi desenvolvido com o objetivo de aplicar na prática conceitos fundamentais de:

- Programação Orientada a Objetos
- Utilização eficiente de Collections Framework
- Manipulação de dados com Stream API
- Boas práticas de desenvolvimento Java

---

⭐ Desenvolvido como parte de um estudo prático de Java e seus recursos avançados.
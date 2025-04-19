# ✈️ Sistema de Gestão de Viagens

Este projeto é um sistema em Java para gerenciamento de voos, passageiros e reservas. Desenvolvido com foco em reforçar conceitos de Programação Orientada a Objetos (POO), alocação dinâmica com vetores e listas, e estruturação modular de código.

---

## 📚 Funcionalidades

✔️ Cadastrar Passageiros  
✔️ Cadastrar Voos com destino, número do voo e valor da passagem  
✔️ Realizar Reservas associando um passageiro a um voo e a um assento específico  
✔️ Cancelar reservas  
✔️ Exibir feedbacks de operação no terminal

---

## 🧠 Conceitos Utilizados

- Programação Orientada a Objetos (Encapsulamento, Composição)
- Vetores como estrutura de alocação de assentos
- Listas dinâmicas com `ArrayList`
- Separação por camadas: `Entities`, `Services` e `View`
- Injeção de dependência via construtor

---

## 📁 Estrutura do Projeto
SistemaGestaodeViagens/ 
├── src/ │ 
    ├── Entities/ │ 
│       ├── Voo.java │ 
│       ├── Passageiro.java │ 
│       ├── Reserva.java 
│ 
    ├── Services/ │ 
│       ├── GerenciadorVoo.java │ 
│       ├── GerenciadorPassageiro.java │ 
│       ├── GerenciarReserva.java │ 
    ├── View/ │ 
│       └── Main.java
    ├── readme.md

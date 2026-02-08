# HScript de HArdware Information (Java + OSHI)

Este projeto é um script em Java que utiliza a biblioteca **OSHI (Operating System and Hardware Information)** para realizar uma varredura completa nos componentes de hardware da máquina.
 obersevação: è um projeto um pouco antigo e quando fiz decidi não importar a parte de Logs , eu o fiz, pois precisava saber informações de software que o gerenciador de tarefas não mostrava

## 🚀 Funcionalidades
O script coleta e exibe no console as seguintes informações:
* **Sistema Operacional:** Nome e versão.
* **Processador (CPU):** Nome comercial e identificador.
* **Memória RAM:** Capacidade total, disponível, memória virtual e detalhes físicos.
* **Placa-Mãe:** Modelo, versão, fabricante e número de série.
* **BIOS/Firmware:** Fabricante, versão e data de lançamento.
* **Placa de Vídeo (GPU):** Nome do modelo e quantidade de VRAM.

## 🛠️ Tecnologias
* **Java 21** (ou a versão que você utilizou)
* **OSHI:** Biblioteca nativa para consulta de hardware.
* **Maven:** Gerenciamento de dependências.

## 📦 Como executar
1. Certifique-se de ter o JDK instalado.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)

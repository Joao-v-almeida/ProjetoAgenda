package REPOSITORIO

import ENTIDADE.EntidadeContato

class RepositorioContato {

    companion object { // Acessar a mesma coisa sempre (classe)
        private val listaContatos = mutableListOf<EntidadeContato>() //Lista mutável

        fun salvar(contato: EntidadeContato) {
            listaContatos.add(contato)
        }

        fun deletar(contato: EntidadeContato) {

        }

        fun getList(): List<EntidadeContato> {
            return listaContatos
        }
    }
}
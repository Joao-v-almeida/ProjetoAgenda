package REPOSITORIO

import ENTIDADE.EntidadeContato

class RepositorioContato {

    companion object { // Acessar a mesma coisa sempre (classe)
        private val listaContatos = mutableListOf<EntidadeContato>() //Lista mutável

        fun salvar(contato: EntidadeContato) {
            listaContatos.add(contato)
        }

        fun deletar(contato: EntidadeContato) {
            //listaContatos.remove(contato)

            var index = 0
            for (item in listaContatos.withIndex()) {
                if (item.value.nome == contato.nome && item.value.telefone == contato.telefone) {
                    index = item.index
                    break
                }
            }
            listaContatos.removeAt(index)
        }

        fun getList(): List<EntidadeContato> {
            return listaContatos
        }
    }
}
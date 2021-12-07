package BUSINESS

import ENTIDADE.EntidadeContato
import REPOSITORIO.RepositorioContato

class BusinessContato {
    private fun validar(nome: String, telefone: String) {
        if (nome == "") {
            throw Exception("Nome Obrigatório!")
        }
        if (telefone == "") {
            throw Exception("Telefone Obrigatório!")
        }
    }

    private fun validarRemover(nome: String, telefone: String) {
        if (nome == "" || telefone == "") {
            throw Exception("Necessário selecionar um contato antes de remover")
        }
    }

    fun salvar(nome: String, telefone: String) {
        validar(nome, telefone)

        val contato = EntidadeContato(nome, telefone)
        RepositorioContato.salvar(contato)

    }

    fun remover(nome: String, telefone: String) {
        validarRemover(nome, telefone)

        val contato = EntidadeContato(nome, telefone)
        RepositorioContato.deletar(contato)
    }

    fun getList(): List<EntidadeContato> {
        return RepositorioContato.getList()
    }

}

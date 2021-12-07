package BUSINESS

class BusinessContato {
    fun validar(nome: String, telefone: String) {
        if (nome == "") {
            throw Exception("Nome Obrigatório!")
        }
        if (telefone == "") {
            throw Exception("Telefone Obrigatório!")
        }
    }

    fun validarRemover(nome: String, telefone: String) {
        if (nome == "" || telefone == "") {
            throw Exception("Necessário selecionar um contato antes de remover")
        }
    }

    fun salvar(nome: String, telefone: String) {
        validar(nome, telefone)

    }

    fun remover(nome: String, telefone: String) {
        validarRemover(nome, telefone)
    }

}

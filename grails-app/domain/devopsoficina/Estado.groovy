package devopsoficina

class Estado {

    String nome
    String uf

    static hasMany = [cidade: Cidade]

    static constraints = {
    }

    String toString(){
        this.nome
    }
}
